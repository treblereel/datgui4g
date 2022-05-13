/*
 * Copyright © 2022 Treblereel
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.treblereel.gwt.datgui4g;

import elemental2.dom.HTMLElement;
import jsinterop.base.JsPropertyMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/3/18.
 */
public class GUI {

    GUIImpl guiImpl;

    Map<String, ControllerOrFolder> controllersAndFolders = new LinkedHashMap<>();

    JsPropertyMap entity;

    private String name;

    private GUI parent;

    private boolean folder, open = false;

    private GUIProperty guiProperty;

    private boolean autoPlace = true;

    private JsPropertyMap load;

    private String preset;

    public GUI() {

    }

    public GUI(GUIProperty guiProperty) {
        this.guiProperty = guiProperty;
    }

    GUI(GUI parent, String name) {
        this.parent = parent;
        this.name = name;
        this.folder = true;
    }

    public GUI parent() {
        if (parent == null) {
            return this;
        }
        return parent;
    }

    public GUI open() {
        if (guiImpl != null) {
            guiImpl.open();
        } else {
            this.open = true;
        }
        return this;
    }

    public GUI close() {
        if (guiImpl != null) {
            guiImpl.close();
        } else {
            this.open = false;
        }
        return this;
    }

    public GUI revert() {
        if (guiImpl != null) {
            guiImpl.revert();
        } else {
            //TODO before created
        }
        return this;
    }

    public GUI revert(GUI gui) {
        if (guiImpl != null) {
            guiImpl.revert(gui.guiImpl);
        } else {
            //TODO before created
        }
        return this;
    }

    public void updateDisplay() {
        if (guiImpl != null) {
            guiImpl.updateDisplay();
        }
    }

    public void destroy() {
        guiImpl.destroy();
    }

    public void remember(Object json) {
        if (this.parent != null) {
            throw new IllegalArgumentException("You can only call remember on a top level GUI.");
        }
        if (this.guiImpl != null) {
            this.guiImpl.remember(json); //TODO
        }
    }

    public void removeFolder(GUI folder) {
        if (controllersAndFolders.containsKey(folder.name) && guiImpl != null) {
            guiImpl.removeFolder(folder.guiImpl);
            controllersAndFolders.remove(folder.name);
        }
    }

    public GUI addFolder(String name) {
        GUI folder = new GUI(this, name);
        controllersAndFolders.put(name, new ControllerOrFolder(folder));
        return folder;
    }

    public Object getValue(String key) {
        return entity.get(key);
    }

    public StringController add(String key, String value) {
        StringController controller = new StringController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public BooleanController add(String key, Boolean value) {
        BooleanController controller = new BooleanController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox add(String key, Number value) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox add(String key, Number value, Number min) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controller.setMin(min);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerSlider add(String key, Number value, Number min, Number max) {
        NumberControllerSlider controller = new NumberControllerSlider(this, value, key);
        controller.setMax(max).setMin(min);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public FunctionController add(String key, OnClick onClick) {
        FunctionController controller = new FunctionController(this, onClick, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public ColorController addColor(String key, String value) {
        ColorController controller = new ColorController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public ColorController addColor(String key, double r, double g, double b) {
        double[] value = new double[3];
        value[0] = r;
        value[1] = g;
        value[2] = b;
        ColorController controller = new ColorController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public ColorController addColor(String key, double r, double g, double b, double alfa) {
        double[] value = new double[4];
        value[0] = r;
        value[1] = g;
        value[2] = b;
        value[3] = alfa;
        ColorController controller = new ColorController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public ColorController addColor(String key, HSV hsv) {
        JsPropertyMap value = JsPropertyMap.of();
        value.set("h", hsv.h);
        value.set("s", hsv.s);
        value.set("v", hsv.v);
        ColorController controller = new ColorController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public OptionController add(String key, String[] values, Object selected) {
        OptionController controller = new OptionController(this, values, key, selected);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public OptionController add(String key, Map values, Object selected) {
        OptionController controller = new OptionController(this, values, key, selected);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public GUI finishAndBuild() {
        if (!folder)
            build(null);
        return this;
    }

    void build(GUI parent) {
        if (!folder) {
            if (guiProperty == null) {
                guiImpl = new GUIImpl();
            } else {
                guiImpl = new GUIImpl(guiProperty);
            }
            entity = JsPropertyMap.of();
            processControllersAndFolders(entity);
        } else {
            this.parent = parent;
            guiImpl = this.parent.guiImpl.addFolder(name);
            if (open)
                guiImpl.open();
            entity = JsPropertyMap.of();
            processControllersAndFolders(entity);
        }
    }

    private void processControllersAndFolders(JsPropertyMap entity) {
        controllersAndFolders.forEach((k, v) -> {
            if (v.folder != null) {
                v.folder.build(this);
            } else {
                Controller controller = v.controller;
                addAsType(entity, controller.name, controller.defaultValue);
                controller.init();
            }
        });
    }

    private void addAsType(JsPropertyMap entity, String key, Object value) {
        if (value instanceof Integer) {
            entity.set(key, ((Integer) value).doubleValue());
        } else if (value instanceof Float) {
            entity.set(key, ((Float) value).doubleValue());
        } else {
            entity.set(key, value);
        }
    }

    public boolean isAutoPlace() {
        if (guiImpl == null) {
            return autoPlace;
        } else {
            return guiImpl.autoPlace;
        }
    }

    public GUI setAutoPlace(boolean autoPlace) {
        if (guiImpl == null) {
            this.autoPlace = autoPlace;
        } else {
            guiImpl.autoPlace = autoPlace;
        }
        return this;
    }

    public HTMLElement getDomElement() {
        if (guiImpl == null) {
            throw new IllegalStateException("GUI doesn't constructed");
        }
        return guiImpl.domElement;
    }

    public JsPropertyMap getState() {
        if (guiImpl == null) {
            throw new IllegalStateException("GUI doesn't constructed");
        }
        return entity;
    }

    class ControllerOrFolder {
        GUI folder;
        Controller controller;

        ControllerOrFolder(GUI folder) {
            this.folder = folder;
        }

        ControllerOrFolder(Controller controller) {
            this.controller = controller;
        }

    }

}

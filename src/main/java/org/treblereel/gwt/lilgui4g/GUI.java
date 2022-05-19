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

package org.treblereel.gwt.lilgui4g;

import elemental2.core.JsArray;
import elemental2.dom.HTMLDivElement;
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

    private final JsArray<Controller> listen = new JsArray<>();

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

    public GUI addFolder(String name) {
        GUI folder = new GUI(this, name);
        controllersAndFolders.put(name, new ControllerOrFolder(folder));
        return folder;
    }

    public StringController addString(Object value, String key) {
        StringController controller = new StringController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public BooleanController addBoolean(Object value, String key) {
        BooleanController controller = new BooleanController(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox addNumber(Object value, String key) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox addNumber(Object value, String key, Number min) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controller.setMin(min);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox addNumber(Object value, String key, Number min, Number max) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controller.setMax(max).setMin(min);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public NumberControllerBox addNumber(Object value, String key, Number min, Number max, Number step) {
        NumberControllerBox controller = new NumberControllerBox(this, value, key);
        controller.setMax(max).setMin(min).setStep(step);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public FunctionController addFunction(Object entity, String key) {
        FunctionController controller = new FunctionController(this, entity, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public ColorController addColor(Object entity, String key) {
        ColorController controller = new ColorController(this, entity, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public OptionController addOption(Object entity, String key, String[] values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public OptionController addOption(Object entity, String key, Map values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public OptionController addOption(Object entity, String key, JsArray values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllersAndFolders.put(key, new ControllerOrFolder(controller));
        return controller;
    }

    public GUI finishAndBuild() {
        if (!folder) {
            build(null);
        }
        return this;
    }

    void build(GUI parent) {
        if (!folder) {
            if (guiProperty == null) {
                guiImpl = new GUIImpl();
            } else {
                guiImpl = new GUIImpl(guiProperty);
            }
        } else {
            this.parent = parent;
            guiImpl = this.parent.guiImpl.addFolder(name);
            if (open)
                guiImpl.open();
        }
        postBuildTasks();
    }

    private void postBuildTasks() {
        controllersAndFolders.forEach((k, v) -> {
            if (v.folder != null) {
                v.folder.build(this);
            } else {
                v.controller.init();
            }
        });

        listen.forEach((p0, p1, p2) -> {
            p0.listen();
            return null;
        });
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

    public HTMLDivElement getDomElement() {
        if (guiImpl == null) {
            throw new IllegalStateException("GUI doesn't constructed");
        }
        return guiImpl.domElement;
    }

    void addListen(Controller controller) {
        listen.push(controller);
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

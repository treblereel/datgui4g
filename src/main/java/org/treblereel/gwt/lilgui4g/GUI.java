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
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsProperty;

import java.util.Map;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/3/18.
 */
public class GUI {

    public HTMLElement getDomElement() {
        return guiImpl.domElement;
    }


    public boolean isClosed() {
        return guiImpl._closed;
    }

    public JsArray<Controller> getControllers() {
        return controllers;
    }

    public JsArray<GUI> getFolders() {
        return folders;
    }

    @JsProperty(name = "folders")
    JsArray<GUIImpl> _folders;

    @JsProperty(name = "controllers")
    JsArray<ControllerImpl> _controllers;

    GUIImpl guiImpl;

    private JsArray<Controller> controllers = new JsArray<>();
    private JsArray<GUI> folders = new JsArray<>();

    private GUI parent;

    public GUI() {
        guiImpl = new GUIImpl();
    }

    private GUI(GUIImpl gui) {
        this.guiImpl = gui;
    }

    public GUI(GUIProperty guiProperty) {
        guiImpl = new GUIImpl(guiProperty.toNative());
    }

    public GUI parent() {
        if (parent == null) {
            return this;
        }
        return parent;
    }

    public GUI addFolder(String name) {
        GUI folder = new GUI(this.guiImpl.addFolder(name));
        folders.push(folder);
        folder.parent = this;
        return folder;
    }

    public StringController addString(Object value, String key) {
        StringController controller = new StringController(this, value, key);
        controllers.push(controller);
        return controller;
    }

    public BooleanController addBoolean(Object value, String key) {
        BooleanController controller = new BooleanController(this, value, key);
        controllers.push(controller);
        return controller;
    }

    public NumberController addNumber(Object value, String key) {
        NumberController controller = new NumberController(this, value, key);
        controllers.push(controller);
        return controller;
    }

    public NumberController addNumber(Object value, String key, Number min) {
        NumberController controller = new NumberController(this, value, key);
        controller.setMin(min);
        controllers.push(controller);
        return controller;
    }

    public NumberController addNumber(Object value, String key, Number min, Number max) {
        NumberController controller = new NumberController(this, value, key);
        controller.setMax(max).setMin(min);
        controllers.push(controller);
        return controller;
    }

    public NumberController addNumber(Object value, String key, Number min, Number max, Number step) {
        NumberController controller = new NumberController(this, value, key);
        controller.setMax(max).setMin(min).setStep(step);
        controllers.push(controller);
        return controller;
    }

    public FunctionController addFunction(Object entity, String key) {
        FunctionController controller = new FunctionController(this, entity, key);
        controllers.push(controller);
        return controller;
    }

    public ColorController addColor(Object entity, String key) {
        ColorController controller = new ColorController(this, entity, key);
        controllers.push(controller);
        return controller;
    }

    public OptionController addOption(Object entity, String key, String[] values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllers.push(controller);
        return controller;
    }

    public OptionController addOption(Object entity, String key, Map values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllers.push(controller);
        return controller;
    }

    public OptionController addOption(Object entity, String key, JsArray values) {
        OptionController controller = new OptionController(this, entity, values, key);
        controllers.push(controller);
        return controller;
    }

    public GUI load(Object obj) {
        guiImpl.load(obj);
        return this;
    }

    public GUI load(Object obj, boolean recursive) {
        guiImpl.load(obj, recursive);
        return this;
    }

    public GUI open() {
        guiImpl.open();
        return this;
    }

    public GUI open(boolean open) {
        guiImpl.open(open);
        return this;
    }

    public GUI close() {
        guiImpl.close();
        return this;
    }

    public GUI save() {
        guiImpl.save();
        return this;
    }

    public GUI save(boolean recursive) {
        guiImpl.save(recursive);
        return this;
    }

    public GUI show() {
        guiImpl.show();
        return this;
    }

    public GUI show(boolean recursive) {
        guiImpl.show(recursive);
        return this;
    }

    public GUI hide() {
        guiImpl.hide();
        return this;
    }

    public GUI title(String title) {
        guiImpl.title(title);
        return this;
    }

    public GUI reset() {
        guiImpl.reset();
        return this;
    }

    public GUI reset(boolean recursive) {
        guiImpl.reset(recursive);
        return this;
    }

    public void destroy() {
        guiImpl.destroy();
    }

}

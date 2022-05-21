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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "lil.GUI")
public class GUIImpl {

    @JsProperty
    HTMLElement domElement;

    @JsProperty
    GUIImpl parent;

    @JsProperty
    boolean _closed;

    @JsProperty
    GUIImpl root;

    @JsProperty
    JsArray<GUIImpl> folders;

    @JsProperty
    JsArray<ControllerImpl> controllers;

    @JsConstructor
    GUIImpl() {

    }

    @JsConstructor
    GUIImpl(JsPropertyMap property) {

    }

    public native GUIImpl addFolder(String name);

    @JsMethod(name = "add")
    public native BooleanControllerImpl addBooleanController(Object obj, String control);

    @JsMethod(name = "add")
    public native StringControllerImpl addStringController(Object obj, String control);

    @JsMethod(name = "add")
    public native ControllerImpl addNumberController(Object obj, String control);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object obj, int[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object obj, double[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object obj, String cssColor);

    @JsMethod(name = "add")
    public native OptionControllerImpl addOptionController(Object obj, String control, Object args);

    @JsMethod(name = "add")
    public native FunctionControllerImpl addFunctionController(Object obj, String name);

    public native GUIImpl load(Object obj);

    public native GUIImpl load(Object obj, boolean recursive);

    public native GUIImpl open();

    public native GUIImpl open(boolean open);

    public native GUIImpl close();

    public native GUIImpl save();

    public native GUIImpl save(boolean recursive);

    public native GUIImpl show();

    public native GUIImpl show(boolean recursive);

    public native GUIImpl hide();

    public native GUIImpl title(String title);

    public native GUIImpl reset();
    public native GUIImpl destroy();

    public native GUIImpl reset(boolean recursive);

}
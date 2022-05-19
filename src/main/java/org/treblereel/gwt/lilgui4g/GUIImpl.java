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

import elemental2.dom.HTMLDivElement;
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
    boolean autoPlace;

    @JsProperty
    HTMLDivElement domElement;

    JsPropertyMap load;

    String preset;

    @JsConstructor
    GUIImpl() {

    }

    @JsConstructor
    GUIImpl(GUIProperty guiProperty) {

    }

    public native GUIImpl addFolder(String name);

    @JsMethod(name = "add")
    public native BooleanControllerImpl addBooleanController(Object keeper, String control);

    @JsMethod(name = "add")
    public native StringControllerImpl addStringController(Object keeper, String control);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(Object keeper, String control);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(Object keeper, String control, int min);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(Object keeper, String control, float min);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(Object keeper, String control, double min);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object JsPropertyMap, int[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object JsPropertyMap, double[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(Object JsPropertyMap, String cssColor);

    @JsMethod(name = "add")
    public native OptionControllerImpl addOptionController(Object JsPropertyMap, String control, Object args);

    @JsMethod(name = "add")
    public native FunctionControllerImpl addFunctionController(Object JsPropertyMap, String name);

    public native void open();

    public native void close();

    public native void remove(ControllerImpl impl);

    public native void removeFolder(GUIImpl impl);

    public native void remember(Object json);

    public native void save();

    public native void saveAs(String presetName);

    public native void revert();

    public native void revert(GUIImpl gui);

    public native void updateDisplay();

    public native void destroy();

}
package org.treblereel.gwt.datgui4g;

import com.google.gwt.json.client.JSONObject;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

import java.util.Map;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = "dat", name = "GUI")
public class GUIImpl {

    boolean autoPlace;

    HTMLElement domElement;

    JSONObject load;

    String preset;

    @JsConstructor
    GUIImpl() {

    }

    @JsConstructor
    GUIImpl(GUIProperty guiProperty) {

    }

    public native GUIImpl addFolder(String name);

    @JsMethod(name = "add")
    public native BooleanControllerImpl addBooleanController(JsPropertyMap keeper, String control);

    @JsMethod(name = "add")
    public native StringControllerImpl addStringController(JsPropertyMap keeper, String control);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(JsPropertyMap keeper, String control);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(JsPropertyMap keeper, String control, int min);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(JsPropertyMap keeper, String control, float min);

    @JsMethod(name = "add")
    public native NumberControllerBoxImpl addNumberControllerBox(JsPropertyMap keeper, String control, double min);

    @JsMethod(name = "add")
    public native NumberControllerSliderImpl addNumberControllerSlider(JsPropertyMap keeper, String control, int min, int max);

    @JsMethod(name = "add")
    public native NumberControllerSliderImpl addNumberControllerSlider(JsPropertyMap keeper, String control, double min, double max);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(JsPropertyMap JsPropertyMap, int[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(JsPropertyMap JsPropertyMap, double[] rgb);

    @JsMethod(name = "addColor")
    public native ColorControllerImpl addColorController(JsPropertyMap JsPropertyMap, String cssColor);

    @JsMethod(name = "add")
    public native OptionControllerImpl addOptionController(JsPropertyMap JsPropertyMap, String control, Object args);

    @JsMethod(name = "add")
    public native FunctionControllerImpl addFunctionController(JsPropertyMap JsPropertyMap, String name);

    @JsMethod(name = "add")
    public native FunctionControllerImpl addFunctionController(Map JsPropertyMap, String name);

    public native void open();

    public native void close();

    public native void remove(ControllerImpl impl);

    public native void removeFolder(GUIImpl impl);

    public native void remember(JsPropertyMap json);

    public native void save();

    public native void saveAs(String presetName);

    public native void revert();

    public native void revert(GUIImpl gui);

    public native void updateDisplay();

    public native void destroy();


}
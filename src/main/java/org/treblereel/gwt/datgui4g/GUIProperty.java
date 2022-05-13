package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/9/18.
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
public class GUIProperty {

    public boolean autoPlace;

    public JsPropertyMap load;

    public String preset;

    public String name;

    public boolean hideable, closed, closeOnTop;

}

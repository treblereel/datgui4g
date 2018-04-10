package org.treblereel.gwt.datgui4g;

import com.google.gwt.json.client.JSONObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/9/18.
 */
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
public class GUIProperty {

    public boolean autoPlace;

    public JSONObject load;

    public String preset;

}

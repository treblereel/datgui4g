package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = "Controller", name = "Controller")
class ControllerImpl {

    native Object onChange(OnChange event);

    native Object onFinishChange(OnFinishChange event);

    native Object setValue(Object newValue);

    native Object getValue();

    native boolean isModified();

}

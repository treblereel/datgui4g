package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = "BooleanController", name = "BooleanController")
class BooleanControllerImpl extends ControllerImpl{
    native Boolean getValue();
}

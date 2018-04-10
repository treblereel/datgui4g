package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "NumberController")
class NumberControllerImpl extends ControllerImpl {

    native NumberControllerImpl min(Number min);

    native NumberControllerImpl max(Number max);

    native NumberControllerImpl step(Number step);
}

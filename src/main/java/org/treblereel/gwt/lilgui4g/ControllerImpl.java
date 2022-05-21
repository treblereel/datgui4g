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

import elemental2.core.JsNumber;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "lil.GUI.Controller")
class ControllerImpl {

    boolean _disabled;

    HTMLElement domElement;

    Object object;

    String property;

    native ControllerImpl onChange(OnChange event);

    native ControllerImpl onFinishChange(OnFinishChange event);

    native ControllerImpl setValue(Object newValue);

    native Object getValue();

    native ControllerImpl listen();

    native ControllerImpl listen(boolean listen);

    native ControllerImpl destroy();
    native ControllerImpl updateDisplay();

    native ControllerImpl reset();
    native ControllerImpl disable();
    native ControllerImpl disable(boolean disabled);
    native ControllerImpl enable();
    native ControllerImpl enable(boolean enabled);

    native ControllerImpl name(String name);

    native ControllerImpl min(JsNumber min);

    native ControllerImpl max(JsNumber max);

    native ControllerImpl step(JsNumber step);
}

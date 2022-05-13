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

package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "dat.GUI.Controller")
class ControllerImpl {

    native Object onChange(OnChange event);

    native Object onFinishChange(OnFinishChange event);

    native Object setValue(Object newValue);

    native Object getValue();

    native boolean isModified();

}

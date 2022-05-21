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

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public class NumberController extends Controller<Number, NumberController, ControllerImpl> {

    NumberController(GUI parent, Object entity, String name) {
        super(parent, parent.guiImpl.addNumberController(entity, name));
    }

    public NumberController setMax(Number max) {
        impl.max(new JsNumber(max));
        return this;
    }

    public NumberController setMin(Number min) {
        impl.min(new JsNumber(min));
        return this;
    }

    public NumberController setStep(Number step) {
        impl.step(new JsNumber(step));
        return this;
    }

    public NumberController onChange(OnChange<Number> func) {
        impl.onChange(result -> func.onChange((new Double(new JsNumber(result).valueOf()))));
        return this;
    }

    public NumberController onFinishChange(OnFinishChange<Number> func) {
        impl.onChange(result -> func.onFinishChange((new Double(new JsNumber(result).valueOf()))));
        return this;
    }
}

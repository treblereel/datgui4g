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

import jsinterop.base.Js;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public abstract class NumberController<V, C extends NumberController, T extends NumberControllerImpl> extends Controller<V, C, T> {

    protected Number min, max, step;

    NumberController(GUI parent, Object holder, String name) {
        super(parent, holder, name);
    }

    public C setMax(Number max) {
        if (impl == null) {
            this.max = max;
        }else {
            NumberControllerImpl numberControllerImpl = Js.uncheckedCast(impl);
            numberControllerImpl.max(max);
        }
        return (C) this;
    }

    public C setMin(Number min) {
        if (impl == null) {
            this.min = min;
        }else {
            NumberControllerImpl numberControllerImpl = Js.uncheckedCast(impl);
            numberControllerImpl.min(min);
        }
        return (C) this;
    }

    public C setStep(Number step) {
        if (impl == null) {
            this.step = step;
        } else {
            NumberControllerImpl numberControllerImpl = Js.uncheckedCast(impl);
            numberControllerImpl.step(step);
        }
        return (C) this;
    }
}

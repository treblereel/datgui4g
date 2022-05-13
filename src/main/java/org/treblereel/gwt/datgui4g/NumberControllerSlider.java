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

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public class NumberControllerSlider extends NumberController<Number, NumberControllerSlider, NumberControllerSliderImpl> {

    NumberControllerSlider(GUI parent, Number number, String name) {
        super(parent, number, name);
    }


    @Override
    void init() {
        if (min instanceof Float || max instanceof Float) {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name,  min.floatValue(), max.floatValue()));
        } else if (min instanceof Double || max instanceof Double) {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, min.doubleValue(), max.doubleValue()));
        } else {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, min.intValue(), max.intValue()));
        }


        if (step != null && impl != null) {
            setStep(step);
        }
        super.init();
    }

}

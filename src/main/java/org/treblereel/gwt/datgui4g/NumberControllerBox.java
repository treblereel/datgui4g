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
public class NumberControllerBox extends NumberController<Number, NumberControllerBox, NumberControllerBoxImpl> {

    NumberControllerBox(GUI parent, Number number, String name) {
        super(parent, number, name);
    }

    @Override
    void init() {
        setImpl(parent.guiImpl.addNumberControllerBox(parent.entity, this.name));
        if(min != null){
            setMin(min);
        }
        if(max != null){
            setMax(max);
        }
        if(step != null){
            setStep(step);
        }
        super.init();
    }
}

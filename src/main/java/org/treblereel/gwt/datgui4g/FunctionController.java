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

import elemental2.core.Global;
import elemental2.dom.DomGlobal;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/9/18.
 */
public class FunctionController extends Controller<Object, FunctionController, FunctionControllerImpl> {

    FunctionController(GUI parent, Object holder, String name) {
        super(parent, holder, name);
    }

    @Override
    protected void init() {
        DomGlobal.console.log("??? " + Global.JSON.stringify(holder));

        setImpl(parent.guiImpl.addFunctionController(holder, name));
        super.init();
    }
}


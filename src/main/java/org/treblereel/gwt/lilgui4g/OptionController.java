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

import elemental2.core.JsArray;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/6/18.
 */
public class OptionController extends Controller<String, OptionController, OptionControllerImpl>{

    OptionController(GUI parent, Object holder, Map<String, ?> values, String name) {
        super(parent, Js.uncheckedCast(parent.guiImpl.addOptionController(holder, name, toJsPropertyMap(values))));
    }

    OptionController(GUI parent, Object holder, String[] values, String name) {
        super(parent, Js.uncheckedCast(parent.guiImpl.addOptionController(holder, name, toJsPropertyMap(values))));
    }

    OptionController(GUI parent, Object holder, JsArray values, String name) {
        super(parent, Js.uncheckedCast(parent.guiImpl.addOptionController(holder, name, toJsPropertyMap(values))));
    }

    private static JsPropertyMap toJsPropertyMap(JsArray values) {
        final JsPropertyMap<Object> props = JsPropertyMap.of();
        values.forEach((p0, p1, p2) -> {
            props.set(String.valueOf(p0), String.valueOf(p0));
            return null;
        });
        return props;
    }

    private static JsPropertyMap toJsPropertyMap(String[] store) {
        final JsPropertyMap<Object> props = JsPropertyMap.of();
        Arrays.stream(store)
                .forEach(k -> props.set(k, k));
        return props;
    }

    private static JsPropertyMap toJsPropertyMap(Map<String, ?> store) {
        final JsPropertyMap<Object> props = JsPropertyMap.of();
        store.entrySet().stream().forEach(k -> props.set(k.getKey(), String.valueOf(k.getValue())));
        return props;
    }
}

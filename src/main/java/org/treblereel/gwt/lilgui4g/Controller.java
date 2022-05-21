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

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public abstract class Controller<V, C extends Controller, T extends ControllerImpl> {

    final public GUI parent;

    final protected T impl;

    Controller(GUI parent, T impl) {
        this.parent = parent;
        this.impl = impl;
    }

    public C onChange(OnChange<V> func) {
        impl.onChange(func);
        return (C) this;
    }

    public C onFinishChange(OnFinishChange<V> func) {
        impl.onFinishChange(func);
        return (C) this;
    }

    public C setValue(V newValue) {
        impl.setValue(newValue);
        return (C) this;
    }

    public V getValue() {
        return (V) impl.getValue();
    }

    public C listen() {
        return (C) listen(true);
    }
    public C listen(boolean listen) {
        this.impl.listen(listen);
        return (C) this;
    }

    public void destroy() {
        this.impl.destroy();
    }

    public boolean isDisabled() {
        return impl._disabled;
    }

    public HTMLElement domElement() {
        return impl.domElement;
    }

    public Object object() {
        return impl.object;
    }

    public String property() {
        return impl.property;
    }
    public C updateDisplay() {
        impl.updateDisplay();
        return (C) this;
    }

    public C reset() {
        impl.reset();
        return (C) this;
    }

    public C disable() {
        impl.disable();
        return (C) this;
    }

    public C disable(boolean disabled) {
        impl.disable(disabled);
        return (C) this;
    }

    public C enable() {
        impl.enable();
        return (C) this;
    }

    public C enable(boolean enable) {
        impl.enable(enable);
        return (C) this;
    }

    public C name(String name) {
        impl.name(name);
        return (C) this;
    }

    @JsFunction
    @FunctionalInterface
    private interface OnChangeInternal {

        void onChange(Object result);
    }

}

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
public abstract class Controller<V, C extends Controller, T extends ControllerImpl> {

    public GUI parent;
    protected Object holder;
    protected String name;
    protected OnChange<V> onChange;
    protected OnFinishChange<V> onFinishChange;
    protected T impl;


    Controller(GUI parent, Object holder, String name) {
        this.parent = parent;
        this.holder = holder;
        this.name = name;
    }

    public GUI done() {
        return parent;
    }

    public C onChange(OnChange<V> func) {
        if (impl == null) {
            this.onChange = func;
        } else {
            impl.onChange(func);
        }
        return (C)this;
    }

    public C onFinishChange(OnFinishChange<V> func) {
        if (impl == null) {
            this.onFinishChange = func;
        } else {
            impl.onFinishChange(func);
        }
        return (C) this;
    }

    public C setValue(V newValue) {
        impl.setValue(newValue);
        return (C) this;
    }

    public V getValue() {
        return (V)impl.getValue();
    }


    public boolean isModified() {
        return impl.isModified();
    }

    public C listen() {
        this.parent.addListen(this);
        return (C) this;
    }

    void setImpl(T impl) {
        this.impl = impl;
    }

    protected void init() {
        if (onChange != null) {
            impl.onChange(onChange);
        }

        if (onFinishChange != null) {
            impl.onFinishChange(onFinishChange);
        }
    }
}

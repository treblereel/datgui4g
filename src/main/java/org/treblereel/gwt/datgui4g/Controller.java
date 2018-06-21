package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public abstract class Controller<V, C extends Controller, T extends ControllerImpl> {

    protected GUI parent;
    protected String name;
    protected V defaultValue;
    protected OnChange onChange;
    protected OnFinishChange onFinishChange;
    protected T impl;


    Controller(GUI parent, V defaultValue, String name) {
        this.parent = parent;
        this.defaultValue = defaultValue;
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
        return (C)this;
    }

    public C setValue(V newValue) {
        impl.setValue(newValue);
        return (C)this;
    }

    public V getValue() {
        return (V)impl.getValue();
    }


    public boolean isModified() {
        return impl.isModified();
    }

    void setImpl(T impl) {
        this.impl = impl;
    }

    void init() {
        if (onChange != null) {
            impl.onChange(onChange);
        }

        if (onFinishChange != null) {
            impl.onFinishChange(onFinishChange);
        }
    }
}

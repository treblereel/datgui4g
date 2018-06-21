package org.treblereel.gwt.datgui4g;

import jsinterop.base.Js;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public abstract class NumberController<V, C extends NumberController, T extends NumberControllerImpl> extends Controller<V, C, T> {

    protected Number min, max, step;

    NumberController(GUI parent, V number, String name) {
        super(parent, number, name);
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

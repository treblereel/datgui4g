package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
@JsFunction
@FunctionalInterface
public interface OnFinishChange<T> {
    void onFinishChange(T event);
}

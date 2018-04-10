package org.treblereel.gwt.datgui4g;

import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
@JsFunction
@FunctionalInterface
public interface OnChange<T> {
    void onChange(T result);
}

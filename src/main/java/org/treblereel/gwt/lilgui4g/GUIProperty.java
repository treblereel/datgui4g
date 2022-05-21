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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/9/18.
 */
public class GUIProperty {

    private boolean autoPlace = true;

    private boolean touchStyles = true;

    private boolean injectStyles = true;

    private HTMLElement container;

    private String title;

    private double width = 245;

    private GUI parent;


    public boolean isAutoPlace() {
        return autoPlace;
    }

    public GUIProperty setAutoPlace(boolean autoPlace) {
        this.autoPlace = autoPlace;
        return this;
    }

    public boolean isTouchStyles() {
        return touchStyles;
    }

    public GUIProperty setTouchStyles(boolean touchStyles) {
        this.touchStyles = touchStyles;
        return this;
    }

    public boolean isInjectStyles() {
        return injectStyles;
    }

    public GUIProperty setInjectStyles(boolean injectStyles) {
        this.injectStyles = injectStyles;
        return this;
    }

    public HTMLElement getContainer() {
        return container;
    }

    public GUIProperty setContainer(HTMLElement container) {
        this.container = container;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GUIProperty setTitle(String title) {
        this.title = title;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public GUIProperty setWidth(double width) {
        this.width = width;
        return this;
    }

    public GUIProperty setParent(GUI parent) {
        this.parent = parent;
        return this;
    }

    JsPropertyMap toNative() {
        JsPropertyMap properties = JsPropertyMap.of();
        properties.set("autoPlace", autoPlace);
        if (container != null)
            properties.set("container", container);
        properties.set("width", width);
        if (title != null)
            properties.set("title", title);
        properties.set("injectStyles", injectStyles);
        properties.set("touchStyles", touchStyles);
        if (parent != null && parent.guiImpl != null)
            properties.set("parent", parent.guiImpl);
        return properties;
    }

}

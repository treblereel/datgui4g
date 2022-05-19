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
@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Object")
public class GUIProperty {

    private boolean autoPlace;

    private boolean touchStyles;

    private boolean injectStyles;

    private HTMLElement container;

    private String title;

    private double width;

    private GUIImpl parent;

    private GUIProperty() {

    }

    public static class GUIPropertyBuilder {

        private GUIProperty property = new GUIProperty();

        public GUIPropertyBuilder() {

        }

        public GUIPropertyBuilder setAutoPlace(boolean autoPlace) {
            property.autoPlace = autoPlace;
            return this;
        }

        public GUIPropertyBuilder setTouchStyles(boolean touchStyles) {
            property.touchStyles = touchStyles;
            return this;
        }

        public GUIPropertyBuilder setInjectStyles(boolean injectStyles) {
            property.injectStyles = injectStyles;
            return this;
        }

        public GUIPropertyBuilder setContainer(HTMLElement container) {
            property.container = container;
            return this;
        }

        public GUIPropertyBuilder setTitle(String title) {
            property.title = title;
            return this;
        }

        public GUIPropertyBuilder setWidth(double width) {
            property.width = width;
            return this;
        }

        public GUIPropertyBuilder setParent(GUI parent) {
            property.parent = parent.guiImpl;
            return this;
        }

        public GUIProperty build() {
            return property;
        }
    }

}

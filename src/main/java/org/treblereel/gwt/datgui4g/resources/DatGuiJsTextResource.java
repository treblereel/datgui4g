package org.treblereel.gwt.datgui4g.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 3/28/18.
 */
public interface DatGuiJsTextResource extends ClientBundle {

    DatGuiJsTextResource IMPL = GWT.create(DatGuiJsTextResource.class);


    @Source("js/dat.gui.js")
    TextResource getDatGUIJS();

    @Source("js/dat.gui.min.js")
    TextResource getDatGUIJSMin();
}

package org.treblereel.gwt.datgui4g;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.treblereel.gwt.datgui4g.resources.DatGuiJsTextResource;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 3/28/18.
 */
public class DatGUIEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        loadDatGUIJS();
    }

    public static void loadDatGUIJS() {
        load("dat.gui.js");
    }

    public static void loadDatGUIJSMin() {
        load("dat.gui.min.js");
    }

    private static void load(String scriptName) {
        if (!isMaterializeLoaded()) {
            try {

                ScriptInjector.fromString(DatGuiJsTextResource.IMPL.getDatGUIJS().getText())
                        .setWindow(ScriptInjector.TOP_WINDOW).inject();
            }catch(Exception e){
                throw new IllegalArgumentException(e);
            }
        }
    }

    public static native boolean isMaterializeLoaded() /*-{
        return (typeof $wnd['Materialize'] !== 'undefined')
    }-*/;

}

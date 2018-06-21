package org.treblereel.gwt.datgui4g;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.treblereel.gwt.datgui4g.resources.DatGuiJsTextResource;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/28/18.
 */
public class DatGUIEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        load();
    }

    private void load() {
        try {
            ScriptInjector.fromString(DatGuiJsTextResource.IMPL.getDatGUIJS().getText())
                    .setWindow(ScriptInjector.TOP_WINDOW).inject();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }


}

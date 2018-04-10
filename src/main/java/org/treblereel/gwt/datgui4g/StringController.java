package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
public class StringController extends Controller<String, StringController, StringControllerImpl>{

    StringController(GUI parent, String value, String name) {
        super(parent, value, name);
    }

    @Override
    void init() {
        setImpl(parent.guiImpl.addStringController(parent.entity, name));
        super.init();
    }
}

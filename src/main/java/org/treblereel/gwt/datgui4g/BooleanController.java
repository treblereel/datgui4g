package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
public class BooleanController extends Controller<Boolean, BooleanController, BooleanControllerImpl> {

    BooleanController(GUI parent, Boolean value, String name) {
        super(parent, value, name);
    }

    @Override
    void init() {
        setImpl(parent.guiImpl.addBooleanController(parent.entity, name));
        super.init();
    }
}

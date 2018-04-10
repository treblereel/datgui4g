package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/6/18.
 */
public class ColorController extends Controller<Object, ColorController, ColorControllerImpl> {

    ColorController(GUI parent, Object defaultValue, String name) {
        super(parent, defaultValue, name);
    }

    @Override
    void init() {
        setImpl(parent.guiImpl.addColorController(parent.entity, name));
        super.init();
    }
}

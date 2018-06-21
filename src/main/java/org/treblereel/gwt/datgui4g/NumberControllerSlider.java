package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/4/18.
 */
public class NumberControllerSlider extends NumberController<Number, NumberControllerSlider, NumberControllerSliderImpl> {

    NumberControllerSlider(GUI parent, Number number, String name) {
        super(parent, number, name);
    }


    @Override
    void init() {
        if (min instanceof Float || max instanceof Float) {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name,  min.floatValue(), max.floatValue()));
        } else if (min instanceof Double || max instanceof Double) {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, min.doubleValue(), max.doubleValue()));
        } else {
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, min.intValue(), max.intValue()));
        }


        if (step != null && impl != null) {
            setStep(step);
        }
        super.init();
    }

}

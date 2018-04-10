package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
public class NumberControllerSlider extends NumberController<Number, NumberControllerSlider, NumberControllerSliderImpl> {

    NumberControllerSlider(GUI parent, Number number, String name) {
        super(parent, number, name);
    }


    @Override
    void init() {
        if(min instanceof Integer && max instanceof Integer){
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, (Integer) min, (Integer)max));
        } else if(min instanceof Double && max instanceof Double){
            setImpl(parent.guiImpl.addNumberControllerSlider(parent.entity, name, (Double) min, (Double)max));
        }

        if(step != null && impl != null){
            setStep(step);
        }
        super.init();
    }

}

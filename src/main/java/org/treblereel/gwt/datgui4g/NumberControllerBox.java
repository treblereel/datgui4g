package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/4/18.
 */
public class NumberControllerBox extends NumberController<Number, NumberControllerBox, NumberControllerBoxImpl> {

    NumberControllerBox(GUI parent, Number number, String name) {
        super(parent, number, name);
    }

    @Override
    void init() {
        setImpl(parent.guiImpl.addNumberControllerBox(parent.entity, this.name));
        if(min != null){
            setMin(min);
        }
        if(max != null){
            setMax(max);
        }
        if(step != null){
            setStep(step);
        }
        super.init();
    }
}

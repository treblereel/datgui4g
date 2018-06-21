package org.treblereel.gwt.datgui4g;

import jsinterop.base.JsPropertyMap;

import java.util.Map;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/6/18.
 */
public class OptionController extends Controller<Object, OptionController, OptionControllerImpl>{

    private Object selected;

    OptionController(GUI parent, Object store, String name, Object selected) {
        super(parent, store, name);
        this.selected = selected;
    }

    @Override
    void init() {
        if(defaultValue instanceof String[]) {
            setImpl(parent.guiImpl.addOptionController(parent.entity, name, defaultValue));
        }else if(defaultValue instanceof Map){
            Map map = (Map) defaultValue;
            JsPropertyMap<Object> props = JsPropertyMap.of();
            map.forEach((k,v) ->props.set(k.toString(), v));
            setImpl(parent.guiImpl.addOptionController(parent.entity, name, props));
        }
        super.init();
        if(selected !=null){
            setValue(selected);
        }
    }
}

package org.treblereel.gwt.datgui4g;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 4/9/18.
 */
public class FunctionController extends Controller<Object, FunctionController, FunctionControllerImpl> {

    OnClick onClick;

    FunctionController(GUI parent, OnClick value, String name) {
        super(parent, value, name);
    }

    @Override
    void init() {
       // JsPropertyMap map = JsPropertyMap.of();
       // map.set(name, onClick);


        //Map map = new HashMap();
        //map.put(name, onClick);

        //parent.entity.put(name, onClick);

        //JavaScriptObject obj = parent.entity;
        //obj.

        //Object obj = Js.uncheckedCast(parent.entity);

/*        Map map = new HashMap();
        map.put(name, new OnClick() {
            @Override
            public void onClick() {
                Window.alert("OILO");
            }
        });*/

     //   jsinterop.base.Js.asPropertyMap(obj).set(name, onClick);

      //  JSONObject o = Js.uncheckedCast(onClick);

       // JSONObject o = new JSONObject(onClick);

        //parent.entity.put(name, new JSONNumber(5));

        setImpl(parent.guiImpl.addFunctionController(parent.entity, name));

        super.init();
    }
}


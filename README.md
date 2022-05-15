# datgui4g
dat.GUI for GWT2/J2CL, for details see [chromeexperiments dat.GUI](https://workshop.chromeexperiments.com/examples/gui/#1--Basic-Usage)

# Setup

Maven

```xml
<dependency>
    <groupId>org.treblereel</groupId>
    <artifactId>datgui4g</artifactId>
    <version>0.7.9.1</version>
</dependency>
```

for gwt2 all you need to do is to add to your module configuration:
```xml
<inherits name="org.treblereel.gwt.DATGUI4G"/>
```

# Example:
```java

DatGuiBootstrap.inject(new Runnable() {
    @Override
    public void run() {
    
            JsPropertyMap holder = JsPropertyMap.of();
    
            holder.set("String", "TEXT!!!!");
            holder.set("test3", 2222);
            holder.set("test4", 222d);
            holder.set("test5", 0.001);
            holder.set("test6", 5);
            holder.set("test7", 5);
            holder.set("test8", 5);
            holder.set("boolean", false);
            holder.set("test_r0", "Val2");
            holder.set("test_r1", "Val3");
            holder.set("test_r2", "Val4");
            holder.set("test_r3", "Val1");
            holder.set("func", (Fn) () -> DomGlobal.console.log("Fn called"));
    
            holder.set("color_1", "#ffae23");
    
            JsArray<Integer> color_2 = new JsArray<>();
            color_2.push(0, 128, 255);
    
            holder.set("color_2", color_2);
    
            JsArray<Double> color_3 = new JsArray<>();
            color_3.push(0d, 128d, 255d, 0.3);
    
            holder.set("color_3", color_3);
    
            JsPropertyMap color_4 = JsPropertyMap.of();
            color_4.set("h", 350);
            color_4.set("s", 0.9);
            color_4.set("v", 0.3);
    
            holder.set("color_4", color_4);
    
            GUIProperty property = new GUIProperty();
            property.load = JsPropertyMap.of();
            property.preset = "Preset1";
    
            GUI gui = new GUI(property);
    
            Map<String, String> values = new HashMap<>();
            values.put("Key1", "Val1");
            values.put("Key2", "Val2");
            values.put("Key3", "Val3");
            values.put("Key4", "Val4");
    
    
            gui.remember(holder);
    
            gui.addBoolean(holder, "boolean").onChange(result -> DomGlobal.console.log("test0 " + result));
            gui.addString(holder, "String").onChange(result -> DomGlobal.console.log("test1 " + result)).listen();
    
            GUI numbers = gui.addFolder("Numbers");
            numbers.addNumber(holder, "test3").onChange(result -> DomGlobal.console.log("test3 " + result)).listen();
            numbers.addNumber(holder, "test4").onChange(result -> DomGlobal.console.log("test4 " + result));
            numbers.addNumber(holder, "test5").onChange(result -> DomGlobal.console.log("test5 " + result));
            numbers.addNumberSlider(holder, "test6", 0, 10).onChange(result -> DomGlobal.console.log("test6 " + result));
            numbers.addNumberBox(holder, "test7", 0).onChange(result -> DomGlobal.console.log("test7 " + result));
            numbers.addNumberBox(holder, "test8", 0, 10).onChange(result -> DomGlobal.console.log("test8 " + result));
    
            GUI options = gui.addFolder("Options");
    
            options.addOption(holder, "test_r0", values).onChange(result -> DomGlobal.console.log("test_r0 " + result));
            options.addOption(holder, "test_r1", new String[]{"Val1", "Val2", "Val3", "Val4"}).onChange(result -> DomGlobal.console.log("test_r1 " + result));
    
            JsArray<String> jsArray = new JsArray<>();
            jsArray.push("Val1", "Val2", "Val3", "Val4");
    
            options.addOption(holder, "test_r2", jsArray).onChange(result -> DomGlobal.console.log("test_r2 " + result));
    
            gui.addFolder("Color")
            .addColor(holder, "color_1").onChange(result -> DomGlobal.console.log("color_1 " + result))
            .parent
            .addColor(holder, "color_2").onChange(result -> DomGlobal.console.log("color_2 " + result))
            .parent
            .addColor(holder, "color_3").onChange(result -> DomGlobal.console.log("color_3 " + result))
            .parent
            .addColor(holder, "color_4").onChange(result -> DomGlobal.console.log("color_4 " + result));
    
            gui.addFunction(holder, "func");
    
            gui.finishAndBuild();
      }
    });
    

```


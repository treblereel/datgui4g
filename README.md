# datgui4g
dat.GUI for GWT2/J2CL, for details see [chromeexperiments dat.GUI](https://workshop.chromeexperiments.com/examples/gui/#1--Basic-Usage)

# Setup

Maven

```xml
<dependency>
    <groupId>org.treblereel</groupId>
    <artifactId>datgui4g</artifactId>
    <version>0.7.9</version>
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
        
        GUI gui = new GUI();
        
        gui.add("String Holder", "AAAAA").onChange(new OnChange<String>() {
            @Override
            public void onChange(String result) {
                    DomGlobal.console.log("AAAA " + result);
                    }
            });
        
       Map<String, String> values = new HashMap<>();
       values.put("Key1", "Val1");
       values.put("Key2", "Val2");
       values.put("Key3", "Val3");
       values.put("Key4", "Val4");
        
        
       gui.add("Boolean Holder ", false);
       gui.add("Number Holder ", 4);
       gui.add("Number Box Holder ", 4, 10);
       gui.add("Number Slider Holder ", 4, 1, 10);
       gui.add("Select Array Holder", new String[]{"Val1", "Val2", "Val3"}, "Val2");
       gui.add("Select Map Holder", values, "Val3");
       gui.addFolder("Color subFolder")
            .addColor("Color 1", "#ffae23")
                .parent
            .addColor("Color 2", "#ffae23")
                .parent
            .addColor("Color 3",0, 128, 255)
                .parent
            .addColor("Color 4",0, 128, 255, 0.3)
                .parent
            .addColor("Color 5", new HSV(350, 0.9, 0.3));
       gui.finishAndBuild();
    });
    

```


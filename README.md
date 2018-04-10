# datgui4g
dat.GUI for GWT 2.8 and above, for details see [chromeexperiments dat.GUI](https://workshop.chromeexperiments.com/examples/gui/#1--Basic-Usage)



Example:
```java

        GUI gui = new GUI();
        NumberControllerBox box = gui.add("float", 10f);
        box.onChange(e -> {

            logger.warn(" o1 -> " + e + " " + box.getValue());

        });
        gui.add("int", 10);
        gui.add("double", 10.0);
        gui.add("double win min 5", 10).setMin(1);
        gui.add("int with max50", 10).setMax(50);
        gui.add("int with step of 5", 10).setStep(5);
        gui.add("text field", "dat.gui rulezz");




        gui.add("slider win min and max", 0.8,  -5, 5);
        gui.add("... and step of 2", 5,  -15, 15).setStep(2);

        gui.add("function on log", new OnClick() {
            @Override
            public void onClick() {
                logger.warn("PRESSED!");
            }
        });


        gui.addColor("color css","#ffae23");
        gui.addColor("color rgb", 0, 97, 255);
        gui.addColor("color rgb + alpha", 0, 128, 255, 0.3d );


        String[] args = new String[]{"AAAA","BBBBB","CCCC"};
        gui.add("option of String[]", args, "CCCC");

        Map<String, Integer> map = new HashMap<>();
        map.put("Small", 1);
        map.put("Medium", 2);
        map.put("Big", 3);

        OptionController optionController = gui.add("option of Map", map, 3);



        GUI mediumFolder = gui.addFolder("Folder");
        mediumFolder.add("m_1", "ololo");
        mediumFolder.add("m_2", 8888);
        mediumFolder.add("m_3", false);

        GUI mediumFolder2 = mediumFolder.addFolder("SubFolder 1");
        mediumFolder2.add("m_1", "ololo");
        mediumFolder2.add("m_2", 8888);
        mediumFolder2.add("m_3", false);

        GUI mediumFolder3 = mediumFolder.addFolder("SubFolder 2");
        mediumFolder3.add("m_1", "ololo");
        mediumFolder3.add("m_2", 8888);
        mediumFolder3.add("m_3", false);



        optionController.onChange(result -> {
            String value = Js.uncheckedCast(result);
            logger.warn("result >> " +  " " + Integer.valueOf(value) + " " + result.getClass().getSimpleName());
        });

        gui.add("boolean controller", false);

        gui.finishAndBuild();

```

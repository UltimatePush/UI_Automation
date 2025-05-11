package org.utils.setup;

import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        ConfigLoader.loadConfig();
    }
}

package org.utils.setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.utils.driverUtils.WebDriverUtils;
import org.utils.driverUtils.WebUtils;

public class Hooks {

    @Before
    public void setup(){
        ConfigLoader.loadConfig();
    }

    @After
    public void kill(){
        WebDriverUtils.close();
    }
}

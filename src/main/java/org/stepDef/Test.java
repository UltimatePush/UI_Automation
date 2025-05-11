package org.stepDef;

import io.cucumber.java.en.Given;
import org.utils.driverUtils.WebDriverUtils;
import org.utils.driverUtils.WebUtils;

public class Test {

    @Given("User navigates to home page")
    public void userNavigateToHomePage(){
        WebUtils.load();
    }
}

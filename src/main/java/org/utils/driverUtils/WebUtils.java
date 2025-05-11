package org.utils.driverUtils;

import org.utils.setup.Setup;

public class WebUtils {

    public static void load(){
        WebDriverUtils.get().get(Setup.URL.getValue());
    }
}

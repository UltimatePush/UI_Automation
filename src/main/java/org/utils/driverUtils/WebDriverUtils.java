package org.utils.driverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.utils.setup.Setup;

import java.time.Duration;

public class WebDriverUtils {
    private static ThreadLocal<WebDriver> driverObj = new ThreadLocal<>();

    public static WebDriver get(){
        if(driverObj.get() == null){
            driverInit();
        }
        return driverObj.get();
    }

    private static void driverInit(){
        WebDriver driver = null;
        switch(Setup.BROWSER.getValue()){
            case "edge"   :
                driver = new EdgeDriver();
                break;
            default       :
                driver = new ChromeDriver();
                break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driverObj.set(driver);
    }

    public static void close(){
        if(driverObj.get() != null){
            driverObj.get().quit();
            driverObj.remove();
        }
    }
}
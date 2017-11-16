package com.amath.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonMethods {
    static WebDriver driver;

    public  CommonMethods(WebDriver driver) {
        this.driver=driver;
    }

    public static void clickByJavaScript (WebElement element){
        element.isEnabled();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

}

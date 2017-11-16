package com.amath.tests;

import com.amath.pages.HomePage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class simpleTest {
    WebDriver driver;

    @Before
    public void setup(){
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dzialajKurwa(){
        HomePage home = new HomePage(driver);
        home.check();

    }

    @After
    public void close(){
        driver.close();
    }
}

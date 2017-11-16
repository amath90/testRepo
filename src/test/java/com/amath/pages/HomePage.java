package com.amath.pages;

import com.amath.helpers.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonMethods {

    public WebDriver driver;
//    CommonMethods cm = new CommonMethods(driver);  // wiem wiemże jestem upośledzony i czegoś tu brakuje
    public CommonMethods cm;

    private static String PAGE_URL="http://new.kolinskiego.pl/";

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div")
    private WebElement mainTheme;

    @FindBy(xpath = "//*[@id=\"block-tb-megamenu-main-menu\"]/div/div/ul/li[1]/a")
    private WebElement StronaGlowna;

    @FindBy(xpath = "//*[@id=\"block-tb-megamenu-main-menu\"]/div/div/ul/li[4]")
    private WebElement Kontakt;

    @FindBy(xpath = "//*[@id=\"block-tb-megamenu-main-menu\"]/div/div/ul/li[2]/a")
    private WebElement oPrzychodni;

    @FindBy(xpath = "//*[@id=\"block-tb-megamenu-main-menu\"]/div/div/ul/li[3]/a")
    private WebElement Oferta;

    @FindBy(xpath = "//*[@id=\"block-tb-megamenu-main-menu\"]/div/div/ul/li[4]/a")
    private WebElement Grafik;

    public HomePage(WebDriver driver) {
        super(driver);
//        this.driver=driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this   );
    }


    public void check(){
        mainTheme.isDisplayed();
        cm.clickByJavaScript(Kontakt);
    }

}

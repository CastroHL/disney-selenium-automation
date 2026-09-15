package com.heliocastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public static final String URL = "https://disneyplus.com/";

    private By linkPrivacy = By.cssSelector("[data-key='privacy']");
    private By linkExplore = By.cssSelector("[data-key='explore disney+']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickPrivacy() {
        waitAndClick(linkPrivacy);
    }

    public void clickExplore() {
        waitAndClick(linkExplore);
    }

}

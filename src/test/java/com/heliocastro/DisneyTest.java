package com.heliocastro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heliocastro.pages.ExplorePage;
import com.heliocastro.pages.HomePage;
import com.heliocastro.pages.PrivacyPage;

public class DisneyTest {

    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(HomePage.URL);
        homePage = new HomePage(driver);
    }

    @Test
    public void shouldNavigateToPrivacyPage() {
        homePage.clickPrivacy();
        assertEquals(
                PrivacyPage.URL,
                driver.getCurrentUrl());
    }

    @Test
    public void shouldNavigateToExplorePage() {
        homePage.clickExplore();
        assertEquals(
                ExplorePage.URL,
                driver.getCurrentUrl());
    }

    @AfterMethod 
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

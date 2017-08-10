package com.globantu.automation.giovanna_urrego.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globantu.automation.giovanna_urrego.pages.HomePage;

public class Tests {

WebDriver driver;
  
  @BeforeMethod
  public void before(){
    driver = new FirefoxDriver();
  }
  
/*  @AfterMethod
  public void after(){
    driver.close();
  }
  */
  @Test
  public void travelocitySearch(){
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.go(driver);
    homePage.searchFlight(driver, "LAS", "LAX", "1");
    Assert.assertEquals("LAS to LAX Flights | Travelocity", driver.getTitle(), "Este no es el nombre de la página");
   // homePage.selectDates();
  }

}

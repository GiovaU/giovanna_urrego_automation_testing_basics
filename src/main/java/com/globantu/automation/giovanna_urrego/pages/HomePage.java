package com.globantu.automation.giovanna_urrego.pages;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

  //@FindBy(xpath="//*[@id='tab-flight-tab']/span[1]")
  @FindBy(id="tab-flight-tab")
  private WebElement flights;
  
  @FindBy(id="flight-type-roundtrip-label")
  private WebElement roundtrip;
  
  @FindBy(id="flight-origin")
  private WebElement origin;
  
  @FindBy(id="flight-destination")
  private WebElement destination;
  
  @FindBy(id="flight-adults")
  private WebElement adults;
  
  @FindBy(id="flight-departing")
  private WebElement departing;
  
  @FindBy(id="flight-returning")
  private WebElement returning;
  
  @FindBy(xpath="//*[@id='flight-departing-wrapper']/div/div/div[2]/table/tbody")
  private List<WebElement> calDatesStart; 
  
  @FindBy(id="search-button")
  private WebElement search;
  
  public void go(WebDriver driver){
    driver.get("https://www.travelocity.com/");
    WebDriverWait wait = new WebDriverWait(driver, 10000);
    wait.until(ExpectedConditions.visibilityOf(flights));
  }
  
  public void searchFlight(WebDriver driver, String start, String end, String travelers){
    flights.click();
    roundtrip.click();
    WebDriverWait wait = new WebDriverWait(driver, 10000);
    wait.until(ExpectedConditions.visibilityOf(origin));
    origin.sendKeys(start);
    destination.sendKeys(end);
    adults.sendKeys(travelers);
    departing.clear();
    departing.sendKeys("09/04/2017");
    returning.clear();
    returning.sendKeys("11/04/2017");
    search.click();
    
  }
  
/*  public void selectDates(){
    Date now = new Date();
    Calendar myCal = Calendar.getInstance();
    myCal.setTime(now);
    myCal.add(Calendar.MONTH, +1);
    now = myCal.getTime();
    for (WebElement cell: calDatesStart){
      if (cell.getText().equals(now)){
        cell.click();
        break;
      }
    }
  }*/
    

}

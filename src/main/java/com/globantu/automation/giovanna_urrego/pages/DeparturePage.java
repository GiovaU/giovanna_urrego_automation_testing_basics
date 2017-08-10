package com.globantu.automation.giovanna_urrego.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeparturePage {

  @FindBy(id="departure-airport-1")
  private WebElement departureAirport;
  
  @FindBy(id="arrival-airport-1")
  private WebElement arrivalAirport;
  
  @FindBy(className="title-city-text")
  private WebElement cityText;
  

}

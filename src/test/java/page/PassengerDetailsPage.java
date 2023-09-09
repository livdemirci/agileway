package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PassengerDetailsPage {
    public PassengerDetailsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='passengerFirstName']")
    public WebElement passengerFirstName;

    @FindBy(xpath = "//input[@name='passengerLastName']")
    public WebElement passengerLastName;

    @FindBy(xpath = "//input[@value='Next']")
    public WebElement nextButton;

    public void getPassengerDetails(String nam, String surnam){
        passengerFirstName.sendKeys(nam);
        passengerLastName.sendKeys(surnam);
        nextButton.click();

    }
}

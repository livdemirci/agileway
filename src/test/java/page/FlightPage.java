package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class FlightPage {

    public FlightPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@type='radio'][1]")
    public WebElement wayCheckBoxReturn;


    @FindBy(xpath = "//*[@type='radio'][2]")
    public WebElement wayCheckBoxOneWay;

    @FindBy(xpath = "//select[@name='toPort']")
    public WebElement toDdmFlight;

    @FindBy(xpath = "//select[@id='departDay']")
    public WebElement departingDayDdm;

    @FindBy(xpath = "//select[@id='departMonth']")
    public WebElement departingMonthDdm;

    @FindBy(xpath = "//select[@name='fromPort']")
    public WebElement fromDdmFlight;


    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> flightNoList;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement flightContionue;

    @FindBy(xpath = "//select[@id='returnDay']")
    public WebElement returnDayDdmList;

    @FindBy(xpath = "//select[@id='returnMonth']")
    public WebElement returnMonthDdmList;




    public void selectFlight(String tripType, String from, String to, String departingD, String departingM, String returnD, String returnM) {

        if (tripType.equalsIgnoreCase("Return")) {
            if (!wayCheckBoxReturn.isSelected()) {
                wayCheckBoxReturn.click();
            }
        } else if (tripType.equalsIgnoreCase("One way")) {
            if (!wayCheckBoxOneWay.isSelected()) {
                wayCheckBoxOneWay.click();
            }
        }
        ReusableMethods.ddmVisibleText(fromDdmFlight,from);
        ReusableMethods.ddmVisibleText(toDdmFlight,to);
        ReusableMethods.ddmVisibleText(departingDayDdm,departingD);
        ReusableMethods.ddmVisibleText(departingMonthDdm,departingM);
        ReusableMethods.ddmVisibleText(returnDayDdmList,returnD);
        ReusableMethods.ddmVisibleText(returnMonthDdmList,returnM);

        flightContionue.click();

    }


}

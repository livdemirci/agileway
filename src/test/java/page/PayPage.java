package page;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class PayPage {
    public PayPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    Faker faker = new Faker();
    Random random = new Random();
    @FindBy(xpath = "//*[@type='radio'][1]")
    public WebElement cardTypeCheckboxVisa;

    @FindBy(xpath = "//*[@type='radio'][2]")
    public WebElement cardTypeCheckboxMaster;

    @FindBy(xpath = "//input[@name='card_number']")
    public WebElement cardNumber;

    @FindBy(xpath = "//select[@name='expiry_month']")
    public WebElement expiryMonthDdm;

    @FindBy(xpath = "//select[@name='expiry_year']")
    public WebElement expiryYearDdm;

    @FindBy(xpath = "//input[@value='Pay now']")
    public WebElement payNowButton;


    @FindBy(xpath = "//a[.='Sign off']")
    public WebElement singOff;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement confirmation;

    @FindBy(xpath = "//*[@name='holder_name']")
    public WebElement holderName;
    public void getPayByCreditCard(String cardType, String holdnam,String crdnbr,String month,String year ){
        if (cardType.equalsIgnoreCase("Visa")) {
            if (!cardTypeCheckboxVisa.isSelected()) {
                cardTypeCheckboxVisa.click();
            }
        } else if (cardType.equalsIgnoreCase("Master")) {
            if (!cardTypeCheckboxMaster.isSelected()) {
                cardTypeCheckboxMaster.click();
            }
        }
        Random rand = new Random();
        String crd=faker.business().creditCardNumber();
        String hld =faker.name().name()+" "+faker.name().lastName();
        holderName.clear();
        holderName.sendKeys(hld);
        cardNumber.clear();
        cardNumber.sendKeys(crd);
        int monthNumber = rand.nextInt(12) + 1;


        String formattedMonthNumber = String.format("%02d", monthNumber);

        ReusableMethods.ddmVisibleText(expiryMonthDdm,formattedMonthNumber);
        ReusableMethods.ddmVisibleText(expiryYearDdm,year);


    }
}
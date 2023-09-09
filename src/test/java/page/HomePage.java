package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='commit']")
    public WebElement signIn;

    public void getSignin(String usernamestr, String passwordstr) {
        username.sendKeys(usernamestr);
        password.sendKeys(passwordstr);
        signIn.click();
    }

}

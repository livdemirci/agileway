package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import page.FlightPage;
import page.HomePage;
import page.PassengerDetailsPage;
import page.PayPage;
import utilities.Driver;

public class Stepdefs {

    HomePage homePage = new HomePage();
    FlightPage flightPage = new FlightPage();
    PassengerDetailsPage passengerDetailsPage = new PassengerDetailsPage();
    PayPage payPage = new PayPage();
    @Given("the user goes to the home page")
    public void the_user_goes_to_the_home_page() {
        Driver.getDriver().get("https://travel.agileway.net/login");
    }

    @And("signOff butonuna basar")
    public void signoffButonunaBasar() {
        payPage.singOff.click();
    }


////////////////////////////////
    @Given("enters {string} in the username field, enters {string} in the password field, and clicks the sign-in button")
    public void enters_in_the_username_field_enters_in_the_password_field_and_clicks_the_sign_in_button(String usern, String pass) {
        homePage.getSignin(usern,pass);
    }
    @Given("enters flight information: {string},{string},{string}, {string},{string}, and optionally {string}, {string}, and clicks continue")
    public void enters_flight_information_and_optionally_and_clicks_continue(String trip, String frm, String too, String departd, String departy, String returnd, String returnY) {
        flightPage.selectFlight(trip,frm,too,departd,departy,returnd,returnY);
    }
    @Given("enters passenger information as {string} and {string}, and clicks the next button")
    public void enters_passenger_information_as_and_and_clicks_the_next_button(String nam, String surnam) {
        passengerDetailsPage.getPassengerDetails(nam,surnam);
    }

    //////////////////////////////////
    @Given("the user enters credit card information: {string}, {string},{string},{string},{string}")
    public void the_user_enters_credit_card_information(String crd, String holder, String crdnbr, String day, String year) {
        payPage.getPayByCreditCard(crd,holder,crdnbr,day,year);
    }
    @Given("clicks the {string} button")
    public void clicks_the_button(String string) {
        payPage.payNowButton.click();
    }
    @Then("verifies that the text {string} is displayed")
    public void verifies_that_the_text_is_displayed(String message) {
        Assert.assertEquals(message,payPage.confirmation.getText());
    }
    @Then("refreshes the page")
    public void refreshes_the_page() {
        Driver.getDriver().navigate().refresh();
    }
}

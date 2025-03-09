package stepDefinition;

import com.aventstack.extentreports.Status;
import config.ExtentManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {
    public LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }
    @Given("Istifadeci Ana sehifeye gedir")
    public void navigatesToTheHomepage() throws InterruptedException {
        String firstpage = "https://www.brandalley.co.uk/";
        loginPage.driver.get(firstpage);
        loginPage.driver.manage().window().maximize();
        loginPage.cookies();
        Thread.sleep(100);
        loginPage.cookies();

        ExtentManager.getTest().log(Status.INFO, "Istifadeci Ana sehifeye gedir");
    }

    @And("Giris Iconuna Klick Edir")
    public void loginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        loginPage.cookies();
        Thread.sleep(10);
        loginPage.cookies();
    }

    @And("Istifadeci acilan Tabloda Continue With Emaili secir")
    public void ContinueWithEmail() {
        loginPage.clickContinueWithEmail();
    }



    @When("Istifadeci {string} ve {string} yazir")
    public void userEntersCredentials(String email, String password) {
        loginPage.enterEmail("sakina.guliyeva@yahoo.com");
        loginPage.enterPassword("sakina1985");
    }

    @Then("Login Buttonuna basir ve Istifadeci sehifesine kecid edir")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }



}




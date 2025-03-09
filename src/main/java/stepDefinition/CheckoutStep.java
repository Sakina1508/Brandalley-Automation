package stepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.CheckoutPage;



public class CheckoutStep {
    public CheckoutPage checkoutPage;

    public CheckoutStep() {
        checkoutPage = new CheckoutPage();
    }

    @When("the user navigates to the shopping cart")
    public void navigateToShoppingCart() {
        checkoutPage.navigateToShoppingCart();
    }


    @And("the user clicks on Woman")
    public void clickWoman() {
        checkoutPage.clickWoman();
    }

    @And("the user clicks on accessories from the product catalog")
    public void clickOnAccessories() {
        checkoutPage.clickAccessories();
    }

    @When("the user clicks on sunglasses")
    public void clickOnSunglasses() {
        checkoutPage.clickSunglasses();
    }


    @When("the user clicks on Add to Cart")
    public void clickAddToCart() {
        checkoutPage.clickAddToCart();
    }

    @Then("the user click basketbutton")
    public void clickBasketbutton() {
        checkoutPage.clickBasket();
    }




}
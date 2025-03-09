package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.ShoppingCartPage;


import static org.junit.Assert.assertTrue;

public class ShoppingCartStep {

    private ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("Istifadeci Esas sehifeye gedir")
    public void goToHomePage() {
        shoppingCartPage.acceptCookiesIfPresent();
        System.out.println("Esas səhifəyə gedildi.");
    }

    @When("Axtarish butonuna klik edir")
    public void clickSearchButton() {
      shoppingCartPage.clickSearch();


    }



    @And("{string} üçün axtarış edib axtarış düyməsini klik et")
    public void searchForProduct(String productName) {
        shoppingCartPage.searchForProduct(productName);
        System.out.println(productName + " üçün arama yapıldı.");
    }

    @And("Mehsullara bax duymesini klik et")
    public void viewProducts() {
        System.out.println("Məhsullara baxıldı.");
    }

    @And("Siyahida 1 ci mehsulu sec")
    public void selectFirstProduct() {
        shoppingCartPage.selectFirstProduct();
        System.out.println("İlk məhsul seçildi.");
    }

    @And("Sebete elave et duymesine klik et")
    public void addToCart() {
        shoppingCartPage.addToCart();
        System.out.println("Məhsul səbətə əlavə edildi.");
    }

    @When("Sebete get")
    public void goToCart() {
        shoppingCartPage.goToCart();
        System.out.println("Səbət səhifəsinə gedildi.");
    }

    @And("Odenishe Kec duymesini klik et")
    public void proceedToCheckout() {
        shoppingCartPage.proceedToCheckout();
        System.out.println("Ödənişə keçid edildi.");
    }



    @And("Ilk gelen catdirilmani sec")
    public void selectFirstDeliveryOption() {
        shoppingCartPage.selectFirstDeliveryOption();
        System.out.println("İlk çatdırılma seçildi.");
    }

    @And("Odenise davam et")
    public void continueToPayment() {
        shoppingCartPage.continueToPayment();
        System.out.println("Ödənişə davam edildi.");
    }

    @Then("Odenis sehifesine yonlendirilir")
    public void verifyPaymentPage() {
       shoppingCartPage.isPaymentPageDisplayed();
    }
}
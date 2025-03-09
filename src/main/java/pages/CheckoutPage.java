package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {

        // Web Elementləri və onların metodları
        public void navigateToShoppingCart() {
                driver.get("https://www.brandalley.co.uk/checkout/cart/");
        }

        // Products Link

        @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div[3]/div/nav/div[2]/a")
        private WebElement womanLink;
        public void clickWoman() {
                womanLink.click();
        }


        // Accessories Link
        @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div/div[3]/div/div[7]/div/div/a/div[1]/div[3]")
        private WebElement accessoriesLink;
        public void clickAccessories() {
                accessoriesLink.click();
        }

        // Sunglasses Link
        @FindBy(xpath = "//*[@id=\"instant-search-results-container\"]/div/ol/li[1]/div/div/div/a[1]/div/img")
        private WebElement sunglassesLink;
        public void clickSunglasses() {
                sunglassesLink.click();
        }



        // Add to Cart Button
        @FindBy(id = "product-addtocart-button")
        private WebElement addToCartButton;
        public void clickAddToCart() {
                addToCartButton.click();
        }

        @FindBy(id = "menu-cart-icon")
        private WebElement basketbutton;
        public void clickBasket() {
                basketbutton.click();
        }



}

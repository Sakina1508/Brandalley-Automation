package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage extends BasePage {

    // Web Elementləri
    @FindBy(id = "autocomplete-0-input") // Arama qutusu
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"html-body\"]/div[8]/div/div[2]/div[2]/a") // Arama düyməsi
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"instant-search-results-container\"]/div/ol/li[1]/div/div/div/a[1]/div/img") // İlk məhsul
    private WebElement firstProduct;

    @FindBy(id = "product-addtocart-button") // Səbətə əlavə et düyməsi
    private WebElement addToCartButton;

    @FindBy(id = "menu-cart-icon") // Səbət ikonu
    private WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"checkout-link-button\"]")
    private WebElement checkoutButton;

    public void proceedToCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }



   @FindBy(xpath = "//*[@id=\"checkout-shipping-method-load\"]/div[2]/div[3]")
   private WebElement selectFirstDeliveryOption;
    public void selectFirstDeliveryOption() {
        selectFirstDeliveryOption.click();
    }

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button") // Ödənişə davam et düyməsi
    private WebElement continueToPaymentButton;

    public ShoppingCartPage() {
        super();
    }

    // Arama düyməsinə klik et
    public void clickSearch() {
        searchInput.click();
        searchInput.sendKeys("Bags");
        searchInput.sendKeys(Keys.ENTER);
    }

    // Arama qutusuna mətn yaz və ara
    public void searchForProduct(String productName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchInput)); // Arama qutusunun görünür olmasını gözlə
        searchInput.sendKeys(productName);
        searchInput.sendKeys(Keys.ENTER); // Enter düyməsi ilə arama et
        System.out.println(productName + " üçün arama edildi.");
    }

    // Digər metodlar...
    public void selectFirstProduct() {
        firstProduct.click();
        System.out.println("İlk məhsul seçildi.");
    }

    public void addToCart() {
        addToCartButton.click();
        System.out.println("Məhsul səbətə əlavə edildi.");
    }

    public void goToCart() {
        cartIcon.click();
        System.out.println("Səbət səhifəsinə keçid edildi.");
    }






    public void continueToPayment() {
        continueToPaymentButton.click();
        System.out.println("Ödənişə davam edildi.");
    }

    // Ödəniş səhifəsinin yükləndiyini təsdiqləyən metod (URL ilə)
    public boolean isPaymentPageDisplayed() {
        String expectedUrlPart = "payment"; // Ödəniş səhifəsinin URL-də gözlənilən hissə
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.contains(expectedUrlPart);
    }
}
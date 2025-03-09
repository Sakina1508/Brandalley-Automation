package pages;


import config.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    public WebDriver driver;
    public JavascriptExecutor js;
    public WebDriverWait wait;

    public BasePage() {
        this.driver = WebDriverManager.getChromeDriver();
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;


    public void acceptCookiesIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
            cookieButton.click();
            System.out.println("Cookies accepted.");

        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("Cookie button not found or already accepted.");
        }
    }


}



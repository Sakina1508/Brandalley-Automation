package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage() {
//super();
    }

    public void clickLoginButton() {
        WebElement loginIcon = driver.findElement(By.id("customer-menu"));
        loginIcon.click();
    }

    public void cookies() {
        try {
            WebElement cookieButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
            cookieButton.click();
            System.out.println("Cookies accepted.");
        } catch (Exception e) {
            System.out.println("Cookie banner not found or already accepted.");
        }
    }


    public void clickContinueWithEmail() {
        acceptCookiesIfPresent(); // Cookie problemindən qaçmaq üçün
        WebElement continueButton = driver.findElement(By.xpath("//*[@id='default-tab-content']/div/div[2]/button[3]"));
        continueButton.click();
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.id("develo_login_email"));
        emailField.click();
        emailField.sendKeys("sakina.guliyeva@yahoo.com");
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.id("develo_login_password"));
        passwordField.click();
        passwordField.sendKeys("sakina1985");
    }

    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"develo-customer-login-form\"]/button"));
        submitButton.click();
    }
}



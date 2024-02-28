package MakeUpTests;

import MakeUpPages.HomePageMakeUp;
import MakeUpPages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.WeakHashMap;

public class MakeUpTest extends MakeUpTestInit{

    @Test
    public void AuthorizationTest() {
        HomePageMakeUp homePageMakeUp = new HomePageMakeUp(this.getDriver());
        homePageMakeUp.clickAuthorizationButton();

        RegistrationPage registrationPage = new RegistrationPage(this.getDriver());
        registrationPage.clickOnRegistrationButton();
        WebDriverWait wait = new WebDriverWait(this.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']"))).click();
        registrationPage.emailInput();
        registrationPage.passwordInput();

    }
}

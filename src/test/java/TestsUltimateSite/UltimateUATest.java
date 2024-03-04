package TestsUltimateSite;

import PagesUltimateSite.HomePageUltimate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UltimateUATest extends TestInit {


    @Test
    public void RegistrationTest() {
        HomePageUltimate homePage = new HomePageUltimate(getDriver());
        homePage.inputName();
        homePage.inputEmail();
        homePage.inputMessage();
        homePage.inputSummary();
        homePage.doRegistration();
    }
}

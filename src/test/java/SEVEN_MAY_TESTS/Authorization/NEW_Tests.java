package SEVEN_MAY_TESTS.Authorization;

import PagesUltimateSite2.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NEW_Tests extends NEW_TestInit{
    @Test
     public void AuthorizationTest() {
        NEW_HomePage newHomePage = new NEW_HomePage();
        newHomePage.click_input_UserName();
        newHomePage.addName_input_Username();
        newHomePage.click_input_password();
        newHomePage.addPassword_input_password();
        newHomePage.click_button_login();
    }

}

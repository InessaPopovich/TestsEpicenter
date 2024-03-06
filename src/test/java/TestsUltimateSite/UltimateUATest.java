package TestsUltimateSite;
import PagesUltimateSite.HomePageUltimate;
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

    @Test //тренування на XPath, бо багато кнопок в одній секції
    public void SectionOfButtons() {
        HomePageUltimate homePageUltimate = new HomePageUltimate(getDriver());
        homePageUltimate.Button1();
        homePageUltimate.Button2();
        try {
            homePageUltimate.Button3();
        } catch (ArithmeticException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        homePageUltimate.Button4();
        homePageUltimate.Button5();
    }
}

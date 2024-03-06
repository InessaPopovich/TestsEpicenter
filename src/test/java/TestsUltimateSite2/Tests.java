package TestsUltimateSite2;
import PagesUltimateSite2.AfterHomePage;
import PagesUltimateSite2.HomePage;
import org.testng.annotations.Test;

public class Tests extends TestInit{

    @Test
    public void SampleApplicationLifecycle() {
        HomePage homePage = new HomePage(getDriver());
        homePage.inputName();
        homePage.buttonGoToTheNextSprint();

        AfterHomePage afterHomePage = new AfterHomePage(getDriver());
        afterHomePage.inputName2();
        afterHomePage.inputSurname();
        afterHomePage.buttonGoToSprint3();
    }
}

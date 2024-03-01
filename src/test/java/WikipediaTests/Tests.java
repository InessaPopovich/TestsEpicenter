package WikipediaTests;

import WikipediaPages.HomePage;
import org.testng.annotations.Test;

public class Tests extends TestInit {

    @Test
    public void TranslateTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.textInput();



    }
}

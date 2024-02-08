package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickBinButton() {
        return findByXpath("//button[@data-card-params='144140, 1,1']");
    }

}



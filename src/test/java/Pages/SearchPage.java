package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement BinButton = findByXpath("//button[@data-card-params=\"6611897, 1,1\"]");
    public WebElement clickBinButton() {
        BinButton.click();
    }

}



package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage extends BasePage {
    protected WebElement binButton() {
        return findByXpath("(//button[@title='Купити'])[1]");
    }

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickBinButton() {
        binButton().click();
    }

    public  String SearchPageUrl = "https://epicentrk.ua/ua/search/?q=dog";

}

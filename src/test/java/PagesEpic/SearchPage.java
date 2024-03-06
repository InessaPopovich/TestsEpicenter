package PagesEpic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage extends BasePage {
    protected WebElement binButton() {
        return this.findByXpath("(//button[@title='Купити'])[1]");
    }


    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public void clickBinButton() {
        this.binButton().click();
    }
}

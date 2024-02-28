package MakeUpPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageMakeUp extends BasePageMakeUp{

    public WebElement authorization = findByXpath("//div[@data-popup-handler=\"auth\"]");

    public HomePageMakeUp(WebDriver driver) {
        super(driver);
    }

    public void clickAuthorizationButton() {
        authorization.click();
    }
}

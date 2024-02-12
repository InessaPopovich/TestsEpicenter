package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement loginButton = findByXpath("//span[@class='_VckGS5']");
    public void clickToLoginButton(){
        loginButton.click();
    }

    public WebElement SearchField = findByXpath("//input[@type='text']");
    public WebElement clickSearchField(){
        SearchField.click();
    }

    public WebElement writeSearchField(){
        SearchField.sendKeys("dog\n");
    }


    public WebElement Location = findByXpath("//div[@class='header__locations-opener']");
    public WebElement clickLocation(){
        Location.click();
    }


}

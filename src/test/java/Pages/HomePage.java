package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement clickToLoginButton(){
        return findByXpath("//span[@class='_VckGS5']");
    }


    public WebElement clickSearchField(){
        return findByXpath("//input[@type='text']");
    }


    public WebElement clickLocation(){
        return findByXpath("//div[@class='header__locations-opener']");
    }


}

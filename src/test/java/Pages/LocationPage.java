package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocationPage extends BasePage{


    public LocationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement LocationButton = findByXpath("//*[@id='global-site-header']/header/div/div[4]/div[2]");
    public WebElement clickLocationButton() {
        LocationButton.click();
    }

    public WebElement SearchLocation = findByXpath("//input[@class='input _MGeWxP _FeIEJW']");
    public WebElement clickSearchLocation() {
        SearchLocation.click();
    }

   public WebElement writeSearchLocation() {
        SearchLocation.sendKeys("Бровари");
   }

    public WebElement BrovaryLocation = findByXpath("/html/body/div[6]/div/div/div[2]/div[1]/div/div[3]/div[2]/div/div[2]");
    public WebElement clickBrovaryLocation() {
        BrovaryLocation.click();
    }

    public WebElement ShopInBrovary = findByXpath("/html/body/div[6]/div/div/div[2]/div[2]/div/div/div/div[1]/button");
    public WebElement ChooseShopInBrovary() {
        ShopInBrovary.click();
    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BinPage extends BasePage{

    public BinPage(WebDriver driver) {
        super(driver);
    }

public WebElement nameProduct(){
        return findByXpath("//a[@class='link basket-product__info-name']");
}
}

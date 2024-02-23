package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage{

    public BasketPage(WebDriver driver) {
        super(driver);
    }

public WebElement nameProduct(){
        return findByXpath("//a[@class='link basket-product__info-name']");
}

public WebElement order() {
        return findByXpath("//button[@tabindex='93']");
}

    public WebElement ElementOnBasketPage() {
        return this.findByXpath("//button[@tabindex='92']");
    }
public void clickDoOrder() {
        order().click();
}
}

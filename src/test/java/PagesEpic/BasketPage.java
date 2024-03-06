package PagesEpic;
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
        return this.findByXpath("//button[@tabindex='93']");
}
public void clickDoOrder() {
        this.order().click();
}
}

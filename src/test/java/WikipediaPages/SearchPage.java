package WikipediaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    protected WebElement elementPage() {
        return this.driver.findElement(By.xpath("//span[contains(@class,'toctext') and contains(text(), 'О композиции')]"));
    }

    public void selectElementPage() {
        elementPage().click();
    }
}

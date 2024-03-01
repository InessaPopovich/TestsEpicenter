package WikipediaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    protected WebElement textArea() {
        return this.driver.findElement(By.xpath("//input[@id='searchInput']"));
    }

    public void textInput() {
        textArea().sendKeys("dogs\n");
    }






}

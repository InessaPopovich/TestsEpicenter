package PagesEpic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeOrderPage extends BasketPage{

    public MakeOrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputNumber() {
        return this.findByXpath("//input[@id='auth-number_0'] ");
    }

    public WebElement inputName() {
        return this.findByXpath("//input[@id='auth-name_0'] ");
    }

    public WebElement inputSurname() {
        return this.findByXpath("//input[@id='auth-family_0'] ");
    }

    public WebElement inputEmail() {
        return this.findByXpath("//input[@id='auth-email_0'] ");
    }

    public WebElement wayDelivery() {
        return this.findByXpath("(//span[contains(text(), 'Самовивіз')])[1]");
    }

    public WebElement adress() {
        return this.findByXpath("//div[contains(text(), 'Бровари, вул. Київська, 253,')]");
    }

    public WebElement wayPay() {
        return this.findByXpath("//span[contains(text(), 'При отриманні')]");
    }

    public WebElement buyButton() {
        return this.findByXpath("//button[@tabindex='110']");
    }

    public void writeNumber() {
        this.inputNumber().sendKeys("095 892 5913");
    }

    public void writeName() {
        this.inputName().sendKeys("Інеса");
    }

    public void writeSurname() {
        this.inputSurname().sendKeys("Попович");
    }

    public void writeEmail() {
        this.inputEmail().sendKeys("inessa.popovich@gmail.com");
    }

    public void chooseWayDelivery() {
        this.wayDelivery().click();
    }
    public void chooseAdress() {
        this.adress().click();
    }

    public void chooseWayPay() {
        this.wayPay().click();
    }






}

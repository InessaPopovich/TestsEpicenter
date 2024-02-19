package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class MyFirstTests extends TestInit {
    public MyFirstTests() {
    }


    @Test
    public void successfulLogIn() {
        HomePage homePage = new HomePage(this.getDriver()); // ?
        homePage.clickLoginButton();
        AuthorizationPage authorizationPage = new AuthorizationPage(this.getDriver()); // ?
        authorizationPage.sendKeysToLoginInputField();
        authorizationPage.sendKeysToPasswordInputField();
        authorizationPage.clickAuthorizationButton();
    }


    @Test
    public void findElements() {
        HomePage homePage = new HomePage(this.getDriver()); // ?
        homePage.sendKeysToSearchField("dog\n");
        SearchPage searchPage =new SearchPage(this.getDriver()); // ?
        searchPage.clickBinButton();

        BasketPage binPage = new BasketPage(this.getDriver()); // ?
        Assert.assertTrue(binPage.nameProduct().isDisplayed());
    }


    @Test
    public void selectLocation() {
        LocationPage locationPage = new LocationPage(this.getDriver());
        locationPage.clickLocationButton();
        locationPage.sendKeysToSearchFealdLocation("Бровари");
        locationPage.clickBrovaryLocation();
        locationPage.clickShopInBrovary();
    }


    @Test
    public void addProductToBin() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.sendKeysToSearchField("dog\n");
        SearchPage searchPage = new SearchPage(this.getDriver());
        searchPage.clickBinButton();
    }

    @Test
    public void doOrder() {
        HomePage homePage = new HomePage(this.getDriver());
        homePage.sendKeysToSearchField("dog\n");
        SearchPage searchPage = new SearchPage(this.getDriver());
        searchPage.clickBinButton();
        BasketPage basketPage = new BasketPage(this.getDriver());
        basketPage.clickDoOrder();
        MakeOrderPage makeOrderPage = new MakeOrderPage(this.getDriver());
        makeOrderPage.writeNumber();
        makeOrderPage.writeName();
        makeOrderPage.writeSurname();
        makeOrderPage.writeEmail();
        makeOrderPage.chooseWayDelivery();
        makeOrderPage.chooseAdress();
        makeOrderPage.chooseWayPay();
        Assert.assertTrue(makeOrderPage.buyButton().isDisplayed());
    }
}


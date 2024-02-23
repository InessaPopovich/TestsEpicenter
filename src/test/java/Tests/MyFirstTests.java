package Tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class MyFirstTests extends TestInit {

    @Test
    public void successfulLogIn() {
        HomePage homePage = new HomePage(getDriver()); // ?
        homePage.clickLoginButton();

        AuthorizationPage authorizationPage = new AuthorizationPage(getDriver()); // ?
        Assert.assertTrue(authorizationPage.ElementOnAuthorizationPage().isDisplayed());
        authorizationPage.sendKeysToLoginInputField();
        authorizationPage.sendKeysToPasswordInputField();
        authorizationPage.clickAuthorizationButton();
    }

    @Test
    public void findElements() {
        HomePage homePage = new HomePage(getDriver()); // ?
        homePage.sendKeysToSearchField("dog\n");

        SearchPage searchPage =new SearchPage(getDriver()); //
        Assert.assertEquals(searchPage.SearchPageUrl,getDriver().getCurrentUrl());
        searchPage.clickBinButton();

        BasketPage binPage = new BasketPage(getDriver()); // ?
        Assert.assertTrue(binPage.ElementOnBasketPage().isDisplayed());
        Assert.assertTrue(binPage.nameProduct().isDisplayed());
    }

    @Test
    public void selectLocation() {
        LocationPage locationPage = new LocationPage(getDriver());
        Assert.assertTrue(locationPage.ElementOnLocationPage().isDisplayed());
        locationPage.clickLocationButton();
        locationPage.sendKeysToSearchFealdLocation("Бровари");
        locationPage.clickBrovaryLocation();
        locationPage.clickShopInBrovary();
    }

    @Test
    public void addProductToBin() {

        HomePage homePage = new HomePage(getDriver());
        homePage.sendKeysToSearchField("dog\n");
        SearchPage searchPage = new SearchPage(getDriver());
        try {
            searchPage.clickBinButton();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    @Test
    public void doOrder() {
        HomePage homePage = new HomePage(getDriver());
        homePage.sendKeysToSearchField("dog\n");

        SearchPage searchPage = new SearchPage(getDriver());
        Assert.assertEquals(searchPage.SearchPageUrl,getDriver().getCurrentUrl());
        searchPage.clickBinButton();

        BasketPage basketpage = new BasketPage(getDriver());
        Assert.assertTrue(basketpage.ElementOnBasketPage().isDisplayed());
        basketpage.clickDoOrder();

        MakeOrderPage makeOrderPage = new MakeOrderPage(getDriver());
        Assert.assertEquals(makeOrderPage.MakeOrderPageURL, getDriver().getCurrentUrl());
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


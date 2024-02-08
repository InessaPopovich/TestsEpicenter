package Tests;


import Pages.AuthorizationPage;
import Pages.HomePage;
import Pages.LocationPage;
import Pages.SearchPage;
import org.testng.annotations.Test;

import javax.swing.table.TableRowSorter;


@Test
public class MyFirstTests extends TestInit {

    HomePage homePage = new HomePage(getDriver());
    AuthorizationPage authorizationPage = new AuthorizationPage(getDriver());
    LocationPage locationPage = new LocationPage(getDriver());
    SearchPage searchPage = new SearchPage(getDriver());

    @Test
    public void successfulLogIn() {
        homePage.clickToLoginButton().click();
        authorizationPage.textLoginInput().click();
        authorizationPage.textLoginInput().sendKeys("958925913");
        authorizationPage.textPasswordInput().click();
        authorizationPage.textPasswordInput().sendKeys("Bytccf17?");
        authorizationPage.clickDoAuthorization().click();
    }


    @Test
    public void findElements() {
        homePage.clickSearchField().click();
        homePage.clickSearchField().sendKeys("dog\n");

    }


    @Test
    public void selectLocation() {
        locationPage.clickLocationButton().click();
        locationPage.clickSearchLocation().click();
        locationPage.clickSearchLocation().sendKeys("Бровари");
        locationPage.clickBrovaryLocation().click();
        locationPage.ChooseShopInBrovary().click();
    }


    @Test
    public void addProductToBin() {
        homePage.clickSearchField().click();
        homePage.clickSearchField().sendKeys("dog\n");
        searchPage.clickBinButton();

    }


}

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
        homePage.clickToLoginButton();
        authorizationPage.textLoginInput();
        authorizationPage.textPasswordInput();
        authorizationPage.clickDoAuthorization();
    }

    @Test
    public void findElements() {
        homePage.clickSearchField();
        homePage.writeSearchField();
        //not done test
    }

    @Test
    public void selectLocation() {
        locationPage.clickLocationButton();
        locationPage.writeSearchLocation();
        locationPage.clickBrovaryLocation();
        locationPage.ChooseShopInBrovary();
    }


    @Test
    public void addProductToBin() {
        homePage.clickSearchField();
        homePage.writeSearchField();
        searchPage.clickBinButton();
        //assert?
    }


}

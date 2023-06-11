package ui.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class pageTest {

    @BeforeAll
    public static void setup() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://allegro.pl";
//        Configuration.headless = true;
    }

    @Test
    public void openAndAcceptCookies() throws InterruptedException {
        new GeneralMethods().open().acceptCookies();
        Thread.sleep(10000);
    }

    @Test
    public void searchForSpecificGooseProductAddToCart() throws InterruptedException {
//        new GeneralMethods().open().acceptCookies();

        new AllegroHomePageSearchingForProductAndCart().searchOnMainPageForGooseBackpack();
        new AllegroHomePageSearchingForProductAndCart().clickingOnProduct();
        new GeneralMethods().addToCart();
    }

    @Test
    public void sortAndFilterSearchingForTheProduct() throws InterruptedException {
        new AllegroSortAndFilter().searchingForTheProduct();
        new AllegroSortAndFilter().changeSortingSettings();
        new AllegroSortAndFilter().changeFilterSettings();
        new AllegroSortAndFilter().clickOnProduct();
        new GeneralMethods().addToCart();
    }


    @Test
    public void goToStoreAndChooseCategory() throws InterruptedException {
        new AllegroStore().searchForAStore();
        new AllegroStore().choosingACategory();
        new AllegroStore().choosingAmongMultipleProductsOnOnePage();
        new GeneralMethods().addToCart();

    }

    @Test
    public void buyFromACartAndChangeLanguage() throws InterruptedException {
        new AllegroBuyingFromACart().deleteSomeProductsFromTheCart();
        new AllegroBuyingFromACart().changeTheLanguage();
        new GeneralMethods().buyProductsFromTheCart();

    }


}

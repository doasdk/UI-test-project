package ui.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class pageTest {

    @BeforeAll
    public static void setup() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://allegro.pl";
//        Configuration.headless = true;
    }


    @Test
    @Order(1)
    public void openAndAcceptCookies() throws InterruptedException {
        new GeneralMethods().open().acceptCookies();
        Thread.sleep(3000);
    }

    @Test
    @Order(2)
    public void searchForSpecificGooseProductAddToCart() throws InterruptedException {
//        new GeneralMethods().open().acceptCookies();

        new AllegroHomePageSearchingForProductAndCart().searchOnMainPageForGooseBackpack();
        new AllegroHomePageSearchingForProductAndCart().clickingOnProduct();
        new GeneralMethods().addToCart();
    }

    @Test
    @Order(3)
    public void sortAndFilterSearchingForTheProduct() throws InterruptedException {
        new AllegroSortAndFilter().searchingForTheProduct();
        new AllegroSortAndFilter().changeFilterSettings();
        new AllegroSortAndFilter().changeSortingSettings();
        new AllegroSortAndFilter().clickOnProduct();
        new GeneralMethods().addToCart();
    }


    @Test
    @Order(4)
    public void goToStoreAndChooseCategory() throws InterruptedException {
        new AllegroStore().searchForAStore();
        new AllegroStore().choosingACategory();
        new AllegroStore().choosingAmongMultipleProductsOnOnePage();
        new GeneralMethods().addToCart();

    }

    @Test
    @Order(5)
    public void changeCartAndLanguage() throws InterruptedException {
        new AllegroChangeACartAndLanguage().deleteSomeProductsFromTheCart();
        new AllegroChangeACartAndLanguage().changeTheLanguage();
        new GeneralMethods().buyProductsFromTheCart();

    }


}

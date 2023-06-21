package ui.tests;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AllegroChangeACartAndLanguage {

    public void deleteSomeProductsFromTheCart() throws InterruptedException {
        Thread.sleep(2000);

        //un-check product 1
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/div/div/section/sellers-offers/div/div[1]/checkbox/label/span")).click();
        Thread.sleep(900);
        //un-check product 2
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/div/div/section[2]/sellers-offers/div/div[1]/checkbox/label/span")).click();
        Thread.sleep(1000);

        //and then delete all checked

        //delete
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/div/cart-header/section/delete-offers/div/button")).click();
        Thread.sleep(900);

        //delete all checked
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/div/cart-header/section/delete-offers/div/div/button[2]")).click();
        Thread.sleep(2000);

        //confirm deleting
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/div/modal/div/div/div/div/div/delete-offers-confirm/div/button[2]")).click();
        Thread.sleep(4000);

        //check all products to buy (again)
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/div/cart-header/section/checkbox/label/span")).click();
        Thread.sleep(1000);
    }

    public void changeTheLanguage() throws InterruptedException {
        //click on the poland flag
        $(byXpath("/html/body/div[2]/div[1]/header/div/nav/div[1]/div/div/a/img")).click();
        Thread.sleep(250);

        //change the language to eng
        $(byXpath("//*[@id=\"language-select\"]/option[2]")).click();
        Thread.sleep(1060);

        //confirm changes
        $(byXpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div/form/button")).click();
        Thread.sleep(1900);
    }



}

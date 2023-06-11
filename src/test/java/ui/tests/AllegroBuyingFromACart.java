package ui.tests;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AllegroBuyingFromACart {

    public void deleteSomeProductsFromTheCart() throws InterruptedException {
        Thread.sleep(10000);
        //decrease amount of backpacks
//        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/div/section[3]/sellers-offers/div/div[2]/div/item/div/div/offer-row/div/div[3]/number-picker/div/div/div/button[1]")).click();

        //un-check products to buy
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/div/section[1]/sellers-offers/div/div[1]/checkbox/label/input")).click();
        Thread.sleep(900);

        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/div/section[2]/sellers-offers/div/div[1]/checkbox/label/input")).click();
        //and then delete all checked
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/cart-header/section/delete-offers/div/div/button[2]")).click();
        Thread.sleep(4000);

        //check all products to buy (again)
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/cart-header/section/checkbox/label/span")).click();
        Thread.sleep(1000);

        //delete backpacks
//        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/div/div[1]/div[1]/app-root/cart/div/div[2]/div/div/section[3]/sellers-offers/div/div[2]/div/item/div/div/offer-row/div/div[2]/button/i")).click();

    }

    public void changeTheLanguage(){
        //click on the poland flag
        $(byXpath("/html/body/div[2]/div[1]/header/div/nav/div[1]/div/div/a/img")).click();

        //change the language to eng
        $(byXpath("//*[@id=\"language-select\"]/option[2]")).click();

        //confirm changes
        $(byXpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div/div/div/form/button")).click();

    }



}

package ui.tests;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GeneralMethods {

    public GeneralMethods open() throws InterruptedException {
        Selenide.open("/");
        Thread.sleep(3000);
        return this;
    }

    public GeneralMethods acceptCookies() throws InterruptedException {
        $(byText("Ok, zgadzam się")).click();
        Thread.sleep(1000);
        return this;
    }

    public void addToCart() throws InterruptedException {
//        $(byXpath("//*[@id='add-to-cart-button']")).click();
//        Thread.sleep(100);
//        //+1
//        $(byXpath("//*[@id=\"transaction-buttons-section\"]/div[1]/div[2]/div[1]/button[2]/img")).click();
//        Thread.sleep(100);
        //add to cart
        $(byXpath("//*[@id=\"add-to-cart-button\"]")).click();
        Thread.sleep(100);
        // "idz do koszyka"
        $(byXpath("/html/body/div[3]/div/div/div[2]/div/div/div[3]/a")).click();
        Thread.sleep(4000);
    }


    public void buyProductsFromTheCart() throws InterruptedException {
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[1]/div/div/div/app-root/cart/div/div[2]/aside/div/div/cart-footer/div/sticky-buttons/div/div/div/submit-button/button")).click();
        Thread.sleep(2000);
    }


}

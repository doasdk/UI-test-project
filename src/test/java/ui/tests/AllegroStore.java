package ui.tests;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class AllegroStore {

    public void searchForAStore() throws InterruptedException {
        //choosing option "store"
        $(byXpath("/html/body/div[2]/div[1]/header/div/div/div/div/form/div[3]/div/select/optgroup[2]/option[3]")).click();
        Thread.sleep(900);
        //searching for RGFK_PL store
        $(byXpath("//input[@placeholder='czego szukasz?']")).setValue("RGFK_PL").pressEnter();
        Thread.sleep(1000);
        //click on "sklep"
        $(byXpath("/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/nav/div[3]/a")).click();
        Thread.sleep(900);
    }

    public void choosingACategory() throws InterruptedException {
        //arrow for categories
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/button/img")).click();
        Thread.sleep(2000);
        //choosing "Akcesoria"
        $(byXpath("/html/body/div[2]/div[4]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[1]/a")).click();
        Thread.sleep(1000);
        //go to a specific product
        $(byXpath("//*[@id=\"search-results\"]/div[5]/div/div/div/div/div/section[2]/article[1]/div/div/div[2]/div[1]/h2/a")).click();
        Thread.sleep(1500);
        //amount of product to buy
        $(byXpath("//*[@id=\"transaction-buttons-section\"]/div[1]/div[2]/div[1]/input")).setValue("6");
        Thread.sleep(3000);

    }

    public void choosingAmongMultipleProductsOnOnePage(){
        //go to the product
        $(byXpath("/html/body/div[2]/div[6]/div/div/div[1]/div/div/div/nav/ol/li[6]/a/span")).click();

        //click on another options
        $(byXpath("/html/body/div[2]/div[6]/div/div/div[7]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[5]/div/div/div/div/div/div/div[10]/div/a/span")).click();



    }



}

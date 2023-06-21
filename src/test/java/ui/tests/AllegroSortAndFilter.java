package ui.tests;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AllegroSortAndFilter {

    public void searchingForTheProduct() throws InterruptedException {
        Thread.sleep(1000);

        //changing category manually
//        $(byXpath("/html/body/div[2]/div[1]/header/div[1]/div/div/div/form/div[3]/div/select/option[2]")).click();

        //searching for a lamp
        $(byXpath("/html/body/div[2]/div[1]/header/div[1]/div/div/div/form/input")).setValue("lampka nocna kotek").pressEnter();

//        clicking on a button "szukaj"
//        $(byXpath("/html/body/div[2]/div[3]/header/div[1]/div/div/div/form/button")).click();
    }

    public void changeSortingSettings() throws InterruptedException {
        //sort by the cheapest
        $(byXpath("/html/body/div[2]/div[6]/div/div[2]/div/div/div/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div[1]/select/option[2]")).click();
        Thread.sleep(800);
    }

    public void changeFilterSettings() throws InterruptedException {
        //setting a filter "nowe"
        $(byXpath("//*[@id=\"filters\"]/div[2]/div/div/div/div/div/fieldset[4]/div/ul/li[1]/label/span")).click();
        //to 50 pln
        $(byXpath("//input[@placeholder='do']")).setValue("50").pressEnter();
        Thread.sleep(1300);
        //from 20 pln
        $(byXpath("//*[@id=\"price_from\"]")).setValue("20").pressEnter();
        Thread.sleep(900);

    }

    public void clickOnProduct() throws InterruptedException {
        $(byXpath("/html/body/div[2]/div[6]/div/div[2]/div/div/div/div/div/div[3]/div[1]/div[5]/div/div/div[1]/div/div/section[2]/article[1]/div/div/div[2]/div[1]/h2/a")).click();
        Thread.sleep(5000);
    }




}

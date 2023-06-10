package ui.tests;
//import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AllegroHomePageSearchingForProductAndCart {


    public void searchOnMainPageForGooseBackpack() throws InterruptedException {
        $(byXpath("//input[@placeholder='czego szukasz?']")).setValue("untitled goose game plecak").pressEnter();
        Thread.sleep(5000);
    }

    public void clickingOnProduct() throws InterruptedException {
        $(byXpath("/html/body/div[2]/div[6]/div/div[2]/div/div/div/div/div/div[3]/div[1]/div[5]/div/div/div[1]/div/div/section[1]/article[1]/div/div/div[2]/div[1]/h2/a")).click();
        Thread.sleep(3000);
    }


}

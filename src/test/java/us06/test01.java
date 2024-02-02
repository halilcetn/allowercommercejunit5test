package us06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class test01 extends TestBase {
    //Test Objective :Kullanıcı serach box tan istediği bir ürünü arayabilmeli
    //Pre-Condition  : Kullanıcı siteye kayıt olmuş olmalı

    /*Senaryo
    1.Kullanıcı kayıt olduğu bilgilerle siteye Sign in ile giriş yapar
    2.Search butonuna tıklar
    3.Aramak istediği ürünün ismini yazar
    4.Ürün ile ilgili seçenekler ekranda görünür
    5.Kullanıcının istediği ürünü arayabildiği doğrulanmalı
     */

    //https://allovercommerce.com/


    @Test
    public void test01() {
        //https://allovercommerce.com adresine gidiniz
        driver.get("https://allovercommerce.com");

        //1.Kullanıcı kayıt olduğu bilgilerle siteye Sign in ile giriş yapar
        signIn(); // TestBase classında tüm adımları içeren signIn methodu oluşturuldu

        //2.Search butonuna tıklar
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='search']"));
        Assertions.assertTrue(searchButton.isEnabled());
        waitForSecond(2);
        WebElement searchButtonClick = driver.findElement(By.xpath("//input[@type='search']"));
        searchButtonClick.click();

        //3.Aramak istediği ürünün ismini yazar
        WebElement searchButton1 = driver.findElement(By.xpath("//input[@type='search']"));
        searchButton1.sendKeys("Television");

        //4.Enter a basar Ürün ile ilgili seçenekler ekranda görünür
        searchButton1.sendKeys(Keys.ENTER);

        //5.Kullanıcının istediği ürünü arayabildiği doğrulanmalı (Television)
        String expectedSearchText="HD Television";
        String actualSearchText = driver.findElement(By.xpath("//h1")).getText();
        Assertions.assertEquals(expectedSearchText, actualSearchText);

    }
}
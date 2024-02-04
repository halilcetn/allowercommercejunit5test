package us06;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class test04 extends TestBase{
    //Test Objective : Kullanıcı sepete (Cart) eklediği ürünleri görebilmeli
    //Pre-Condition  : Kullanıcı sepete ürün eklemiş olmalı
    //Pozitif Senaryo

    //https://allovercommerce.com

    /*Senaryo
    1.Kullanıcı kayıt olduğu bilgilerle siteye Sign in ile giriş yapar
    2.Sağ üstteki Cart simgesine tıklar
    3.Shopping Cart kısmı açılır
    4.Kullanıcının sepete eklediği ürünü gördüğü doğrulanmalı
    */

    @Test
    public void test01() throws InterruptedException {
        //https://allovercommerce.com adresine gidiniz
        driver.get("https://allovercommerce.com");

        //1.Kullanıcı kayıt olduğu bilgilerle siteye Sign in ile giriş yapar
        signIn(); // TestBase classında tüm adımları içeren signIn methodu oluşturuldu

        //Search butonuna tıklar
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='search']"));
        Assertions.assertTrue(searchButton.isEnabled());
        waitForSecond(2);
        WebElement searchButtonClick = driver.findElement(By.xpath("//input[@type='search']"));
        searchButtonClick.click();

        //Aramak istediği ürünün ismini yazar
        WebElement searchButton1 = driver.findElement(By.xpath("//input[@type='search']"));
        searchButton1.sendKeys("Television");

        //Enter a basar Ürün ile ilgili seçenekler ekranda görünür
        searchButton1.sendKeys(Keys.ENTER);

        //Kullanıcının istediği ürünü arayabildiği doğrulanmalı (Television)
        String expectedSearchText="HD Television";
        String actualSearchText = driver.findElement(By.xpath("//h1")).getText();
        Assertions.assertEquals(expectedSearchText, actualSearchText);

        //Add To Cart butonuna tıklar
        driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();

        //Ekranda ürünün eklendiği uyarısı geldiği doğrulanmalı
        String expectedResult ="VIEW CART “HD Television” has been added to your cart.";
        String actualResult = driver.findElement(By.xpath("//div[@role='alert']")).getText();
        System.out.println("actualResult = " + actualResult);
        Assertions.assertEquals(expectedResult,actualResult);

        //2.Sağ üstteki Cart simgesine tıklar
        WebElement cartButton = driver.findElement(By.xpath("//i[@class='w-icon-cart']"));
        cartButton = driver.findElement(By.xpath("//i[@class='w-icon-cart']")); // Yeniden bul
        waitForSecond(3);
        cartButton.click();

        //3.Shopping Cart kısmı açılır
        String expectedShoppingCart="SHOPPING CART";
        String actualShoppingCart=driver.findElement(By.xpath("//h4[@class='cart-title']")).getText();
        Assertions.assertEquals(expectedShoppingCart,actualShoppingCart);

        //4.Kullanıcının sepete eklediği ürünü gördüğü doğrulanmalı
        String expectedResultShoppingCart="HD Television";
        String actualResultShoppingCart =driver.findElement(By.xpath("//span[text()='HD Television']")).getText();
        Assertions.assertEquals(expectedResultShoppingCart,actualResultShoppingCart);


    }
}

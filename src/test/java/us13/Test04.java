package us13;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test04 extends Utilities13 {


    @Test
    void Test01() {
        //1	 Web sitesine gider
        driver.get("https://allovercommerce.com/");
        //2	 Sign in butonuna tiklar
        WebElement registerBox = driver.findElement(By.xpath("//*[text()='Sign In']"));
        registerBox.click();

        //3	 Vendor gecerli verilerle siteye gidebilmeli
        WebElement giris = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        giris.sendKeys("oli.isahi@farmoaks.com", Keys.TAB, "oli.isahi2024", Keys.TAB, Keys.ENTER);
        waitForSecond(2);

        //4	 My Account bağlantisina gidebilmeli
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        waitForSecond(3);
        driver.findElement(By.linkText("My Account")).click();

        //5	 Addresses butonuna tiklayabilmeli
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[text()='Addresses']")).click();
        waitForSecond(2);

        //6	 Shipping Address eklemek için Add tıklayabilmeli
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitForSecond(2);
        driver.findElement(By.xpath("(//*[text()='Add'])[2]")).click();
        waitForSecond(2);

        //7	 First name gecerli bir veri girebilmeli
        //8	 Last name gecerli bir veri girebilmeli
        //9	 Company name'e gecrli bir veri girebilmeli
        driver.findElement(By.cssSelector("#shipping_first_name")).sendKeys("Zafer", Keys.TAB,"Aydin",Keys.TAB, "ZA");
        waitForSecond(2);

        //10 Country / Region boş birakilmali


        //11 Street address'e gecerli bir veri girebilmeli
        driver.findElement(By.cssSelector("#shipping_address_1")).sendKeys("Huzur");

        //12 Town / City gecerli bir veri girilebilmeli
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys("Miami");

        //13 State gecerli verilerle girilebilmeli
        WebElement stateBox = driver.findElement(By.xpath("(//span[@aria-expanded='false'])[2]"));
        stateBox.sendKeys("Arizona", Keys.ENTER);

        //14 ZIP Code gecerli veri girebilmeli
        //15 SAVE ADDRESS butonuna tiklanabilmeli
        driver.findElement(By.xpath("//input[@id='shipping_postcode']")).sendKeys("32025",Keys.TAB,Keys.ENTER);
        waitForSecond(2);

        //16 "Country / Region is a required field." yazisi gozükür
    }
}
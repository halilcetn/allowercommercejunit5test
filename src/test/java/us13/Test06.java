package us13;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test06 extends Utilities13{

    @Test
    void test01() {



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

        //7	 First name'e gecerli bir veri girebilmeli
        //8	 Last name'e gecerli bir veri girebilmeli
        //9	 Company name'e gecrli bir veri girebilmeli
        driver.findElement(By.cssSelector("#shipping_first_name")).sendKeys("Zafer", Keys.TAB,"Aydin",Keys.TAB, "ZA");
        waitForSecond(2);

        //10 Country / Region butonundan ulke secebilmeli
        WebElement countryBox = driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
        countryBox.sendKeys("Turkey", Keys.ENTER);
        waitForSecond(2);

        //11 Street address'e gecerli bir veri girebilmeli
        driver.findElement(By.cssSelector("#shipping_address_1")).sendKeys("Huzur");

        //12 "Apartment,suite,unit bir gecerli veri girebilmeli
        //13 Postcode / ZIP kutusu boş birakilmali
        //14 Town / City gecerli bir veri girilebilmeli
        driver.findElement(By.name("shipping_address_2")).sendKeys("No:13, D:5", Keys.TAB,  Keys.TAB, "Pendik");
        waitForSecond(2);

        //15 Province butonundan gecerli bir veri secilebilmeli
        WebElement provinceBox = driver.findElement(By.xpath("(//span[@aria-haspopup='true'])[2]"));
        provinceBox.sendKeys("İstanbul", Keys.ENTER);
        waitForSecond(5);

        //16 SAVE ADDRESS butonuna tiklanabilmeli
        driver.findElement(By.name("save_address")).click();

        //17 "Postcode / ZIP is a required field." yazisi gozükür
    }
}

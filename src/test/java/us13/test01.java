package us13;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;

public class test01 extends Utilities13 {

    @Test
    void Test01() {
        //1	 Web sitesine gider
        driver.get("https://allovercommerce.com/");

        //2	 Sign in butonuna tiklar
        WebElement registerBox= driver.findElement(By.xpath("//*[text()='Sign In']"));
        registerBox.click();

        //3	 Vendor gecerli verilerle siteye gidebilmeli
        WebElement giris= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        giris.sendKeys("romey.moroni@farmoaks.com", Keys.TAB,"romey.moroni2024",Keys.TAB,Keys.ENTER);

        //4	 My Account bağlantisina gidebilmeli
        //5	 Addresses butonuna tiklayabilmeli
        //6	 Shipping Address eklemek için Add tıklayabilmeli
        //7	 First name'e gecerli bir veri girebilmeli
        //8	 Last name'e gecerli bir veri girebilmeli
        //9	 Company name'e gecrli bir veri girebilmeli
        //10 Country / Region butonundan ulke secebilmeli
        //11 Street address'e gecerli bir veri girebilmeli
        //12 "Apartment,suite,unit bir gecerli veri girebilmeli
        //13 Postcode / ZIP gecerli verilerle girilebilmeli
        //14 Town / City gecerli bir veri girilebilmeli
        //15 Province butonundan gecerli bir veri secilebilmeli
        //16 SAVE ADDRESS butonuna tiklanabilmeli
        //17 Address changed successfully yazisi gozükür
    }
}

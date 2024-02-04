package us03;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class test01 {
    @Test
    public void testus3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Alışveriş sitesine gidilir - https://allovercommerce.com/
        driver.get("https://allovercommerce.com/");

        //Sign In butonuna tıklanır
        driver.findElement(By.partialLinkText("Sign In")).click();

        // Sign in ile sisteme kullanıcı girişi yapılır (username:jaeden, password:1234Abc.
        driver.findElement(By.id("username")).sendKeys("jaeden");
        driver.findElement(By.id("password")).sendKeys("1234Abc.");
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // My Account-Addresses sayfasına gidilir
        driver.findElement(By.linkText("Sign Out")).click();
        driver.findElement(By.linkText("Addresses")).click();

        // Billing-Add butonuna tıklanarak fatura ekleme sayfasına gidilir
        driver.findElement(By.xpath("(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")).click();

        // First name girilir - "Jaeden"
        driver.findElement(By.id("billing_first_name")).sendKeys("Jaeden");

        // Last name girilir - "Sanai"
        driver.findElement(By.id("billing_last_name")).sendKeys("Sanai");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 200).perform();

        //  !!! BURADA HATA VAR !!!  .....

        // Country/Region seçilir - "Turkey"
        //  driver.findElement(By.xpath("(//*[@class='select2-selection__placeholder'])[1]")).click();
        //  Select select=new Select(driver.findElement(By.xpath("(//*[@class='select2-selection__placeholder'])[1]")));
        //  select.selectByIndex(11);

        //WebElement country =driver.findElement(By.xpath("(//*[@class='select2-selection__placeholder'])[1]"));
        //Select select=new Select(country);
        //select.selectByValue("Turkey");

        // Street Address girilir - "Samsun"
        driver.findElement(By.xpath("//input[@name='billing_address_1']")).sendKeys("Samsun");

        actions.scrollByAmount(0, 200).perform();

        // Town/City girilir - "Samsun"
        driver.findElement(By.xpath("//input[@autocomplete='address-level2']")).sendKeys("Samsun");

        // State seçilir
        //Select select2=new Select(driver.findElement(By.xpath("(//*[@class='select2-selection__placeholder'])[2]")));
        //select2.selectByIndex(11);

        // ZIP Code girilir - "55000"
        driver.findElement(By.id("billing_postcode")).sendKeys("55000");

        // Phone girilir - "55500000"
        driver.findElement(By.id("billing_phone")).sendKeys("555000000");

        actions.scrollByAmount(0, 200).perform();

        // Kayıtlı email adresinin çıktığı görülür "jaeden.sanai@farmoaks.com"

        // Save Address butonuna tıklanır

        // Açılan sayfada "Address changed successfully." yazısı görülür


    }
}

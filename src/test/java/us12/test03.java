package us12;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class test03 {
    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jhoniel.viliami@farmoaks.com");
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Yakup.1461");
        driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.xpath("//button[@name='login']")).submit();

        Actions actions = new Actions(driver);
        for (int i = 0; i < 4; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(1000);
        }
        WebElement accountList = driver.findElement(By.xpath("//li[@id='menu-item-1079']"));
        actions.moveToElement(accountList).perform();
        accountList.click();
        driver.findElement(By.xpath("(//div[@class='icon-box text-center'])[3]")).click();
        driver.findElement(By.xpath("(//a[text()='Add'])[1]")).click();
        driver.findElement(By.id("billing_first_name")).sendKeys("Yakup");
        driver.findElement(By.id("billing_last_name")).sendKeys("Jacob");
        driver.findElement(By.id("billing_company")).sendKeys("Amazon",Keys.TAB,"Turkey",Keys.ENTER);









    }
}
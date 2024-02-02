package us12;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test02 {
    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//a[.='Sign Up']")).click();
        driver.findElement(By.id("reg_username")).sendKeys("jhoniel.viliami");
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("jhoniel.viliami@farmoaks.com\n");
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Yakup.1461");
        driver.findElement(By.xpath("//a[.='Signup as a vendor?']")).click();




    }



}

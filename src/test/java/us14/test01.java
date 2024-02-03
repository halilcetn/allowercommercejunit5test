package us14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {
    public static void main(String[] args) {


        // WebDriver'ı başlat
        WebDriver driver = new ChromeDriver();

        // Web sayfasını yükleyin
        driver.get("https://allovercommerce.com");

        System.out.println("aysel yazdı");

        // Tarayıcıyı kapat
        driver.quit();
    }
}


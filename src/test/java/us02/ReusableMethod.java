package us02;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethod {


    public void testbaslangıc() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

}

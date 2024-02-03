package us13;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Utilities13 {

    WebDriver driver;

    @BeforeEach
    void setUp() {
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    public void selectByIndexText(WebElement ddm,int idx){
        Select select=new Select(ddm);
        select.selectByIndex(idx);

    }
    public void selectByValueTest(WebElement ddm,String option){
        Select select=new Select(ddm);
        select.selectByValue(option);
    }
    public void selectByVisibleTextTest(WebElement ddm,String option){
        Select select=new Select(ddm);
        select.selectByVisibleText(option);
    }

    public void vendorGiris(){
        driver.get("https://allovercommerce.com/");
    }

    public void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

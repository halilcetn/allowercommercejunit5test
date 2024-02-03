package us11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class SüleymanTestBase {
    protected WebDriver driver;

    @BeforeEach
   public void setUp() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterEach
    public void tearDown() {
       // driver.quit();


    }

    public void waitForSecond(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void selectVisibleText(WebElement webElement,String text){
        Select select=new Select(webElement);
        select.selectByVisibleText(text);

    }

    public void selectIndex(WebElement webElement,int index){

        Select select=new Select(webElement);
        select.selectByIndex(index);


    }

    public void selectValue(WebElement webElement,String value){

        Select select=new Select(webElement);
        select.selectByValue(value);

    }

    public void switchToWindow(int index){

        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }



}

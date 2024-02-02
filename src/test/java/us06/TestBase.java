package us06;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {

        //driver.quit();
    }

    //Hard wait
    public void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //DDM den visible text ile secim
    public  void  selectVisibleText(WebElement ddm,String option){
        Select select = new Select(ddm);
        select.selectByVisibleText(option);
    }

    //DDM den index ile secim
    public void selectIndex(WebElement ddm,int idx){
        Select select = new Select(ddm);
        select.selectByIndex(idx);
    }

    //index ile windowa gecis yapma
    public void switchToWindow(int index){
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }

    public void signIn() {
        // "Sign In" butonuna tıkla
        driver.findElement(By.xpath("//span[.='Sign In']")).click();

        // Kullanıcı adı ve şifre girme işlemleri
        driver.findElement(By.cssSelector("#username")).sendKeys("tester", Keys.TAB);
        driver.findElement(By.cssSelector("#password")).sendKeys("2024tester", Keys.TAB);

        // "Remember Me" seçeneğini tıkla
        driver.findElement(By.cssSelector("#rememberme")).click();

        // "Login" butonuna tıkla
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }


}
package us11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US_11 extends SüleymanTestBase {
    @Test
    public void tc_01() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.END).perform();


        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        System.out.println(myAccount.getText());
        myAccount.click();

        String actual=driver.findElement(By.xpath("//p[@class='greeting mb-0']")).getText();
        String expected="Hello jaison.minor (not jaison.minor? Log out)";
        Assertions.assertEquals(expected,actual);






    }
    @Test
    public void tc_02() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);


        waitForSecond(5);
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.END).perform();


        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        System.out.println(myAccount.getText());
        myAccount.click();

        String actual=driver.findElement(By.xpath("//p[@class='greeting mb-0']")).getText();
        String expected="Hello jaison.minor (not jaison.minor? Log out)";
        Assertions.assertEquals(expected,actual);





    }
    @Test
    public void tc_03() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.END).perform();



        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        System.out.println(myAccount.getText());
        Assertions.assertTrue(myAccount.isDisplayed());
        Assertions.assertTrue(myAccount.isEnabled());




    }
    @Test
    public void tc_04() {
        driver.get("https://allovercommerce.com/");

        driver.findElement(By.xpath("//span[.='Sign In']")).click();

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(10);
        WebElement actual=driver.findElement(By.xpath("//button[.='Sign In']"));
        System.out.println(actual.getText());

        Assertions.assertTrue(actual.isDisplayed());

    }

    @Test
    public void tc_05() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com",Keys.TAB ,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(10);

        WebElement actual=driver.findElement(By.xpath("//button[.='Sign In']"));
        System.out.println(actual.getText());

        Assertions.assertTrue(actual.isDisplayed());
    }

    @Test
   public void tc_06() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB, "4321Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        String actual=driver.findElement(By.xpath("(//p[@class='submit-status'])[1]")).getText();
        String expected="Wrong username or password.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
   public void tc_07() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor", Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(10);

        WebElement actual=driver.findElement(By.xpath("//button[.='Sign In']"));
        System.out.println(actual.getText());

        Assertions.assertTrue(actual.isDisplayed());




    }

    @Test
    public void tc_08() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor", Keys.TAB, "4321Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        String actual=driver.findElement(By.xpath("(//p[@class='submit-status'])[1]")).getText();
        String expected="Wrong username or password.";

        Assertions.assertEquals(expected,actual);


    }

    @Test
    public void tc_09() {
        driver.get("https://allovercommerce.com/");
        WebElement register =driver.findElement(By.xpath("//span[text()='Register']"));
        register.click();
        driver.findElement(By.id("reg_username")).sendKeys("jaison.minor",Keys.TAB,"jaison.minor@falkcia.com",Keys.TAB,"1234Sa.");

        driver.findElement(By.id("register-policy")).click();

        driver.findElement(By.xpath("//button[@value='Sign Up']")).click();

        String actual=driver.findElement(By.xpath("(//p[@class='submit-status'])[2]")).getText();
        String expected="An account is already registered with your email address. Please log in.";

        Assertions.assertEquals(expected,actual);
    }

    @Test
   public void tc_10() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement storeManager=driver.findElement(By.linkText("Store Manager"));

        Assertions.assertTrue(storeManager.isDisplayed());
        Assertions.assertTrue(storeManager.isEnabled());


    }

    @Test
   public void tc_11() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement orders=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/orders/'])[1]"));

        Assertions.assertTrue(orders.isDisplayed());
        Assertions.assertTrue(orders.isEnabled());

    }

    @Test
    void tc_12() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement downloads=driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/downloads/']"));

        Assertions.assertTrue(downloads.isDisplayed());
        Assertions.assertTrue(downloads.isEnabled());


    }
    @Test
    void tc_13() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement address=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/edit-address/'])[1]"));

        Assertions.assertTrue(address.isDisplayed());
        Assertions.assertTrue(address.isEnabled());


    }
    @Test
    void tc_14() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement account=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/edit-account/'])[1]"));

        Assertions.assertTrue(account.isDisplayed());
        Assertions.assertTrue(account.isEnabled());


    }
    @Test
    void tc_15() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement wishlist=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/wishlist/'])[2]"));

        Assertions.assertTrue(wishlist.isDisplayed());
        Assertions.assertTrue(wishlist.isEnabled());


    }
    @Test
    void tc_16() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement supportTickets =driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/support-tickets/']"));

        Assertions.assertTrue(supportTickets.isDisplayed());
        Assertions.assertTrue(supportTickets.isEnabled());


    }

    @Test
    void tc_17() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement followings=driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/followings/']"));

        Assertions.assertTrue(followings.isDisplayed());
        Assertions.assertTrue(followings.isEnabled());


    }
    @Test
    void tc_18() {
        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//span[.='Sign In']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaison.minor@falkcia.com", Keys.TAB,"1234Sa.",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        waitForSecond(5);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        WebElement myAccount=driver.findElement(By.xpath("(//a[@href='https://allovercommerce.com/my-account-2/'])[1]"));
        myAccount.click();

        WebElement logout=driver.findElement(By.xpath("//a[.='Logout']"));

        Assertions.assertTrue(logout.isDisplayed());
        Assertions.assertTrue(logout.isEnabled());


    }





}

package us04;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class AtakanTestBase {
    protected WebDriver driver;
    Actions actions;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    void tearDown() {
        waitForSecond(3);
        driver.quit();
    }

    //register to AllowerCommerce

    public  void registerToAllower(){

        driver.get("https://allovercommerce.com/");
        driver.findElement(By.xpath("//a[@class='register inline-type']")).click();
        WebElement userNameBox =driver.findElement(By.xpath("//input[@id='reg_username']"));
        Faker faker =new Faker();
        String userNameString=faker.name().username();
        String userNameNumber=faker.number().digits(4);
        String fullUserName=userNameString+userNameNumber;
        String pw =faker.number().digits(8);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.fakemail.net/");
        String fakeEmail=driver.findElement(By.xpath("//span[@id='email']")).getText();
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        userNameBox.sendKeys(fullUserName, Keys.TAB,fakeEmail,Keys.TAB,pw);
        WebElement agreePolicyBox=driver.findElement(By.xpath("//input[@id='register-policy']"));
        if (!agreePolicyBox.isSelected()){
            agreePolicyBox.click();
        }
        waitForSecond(1);
        driver.findElement(By.xpath("//button[.='Sign Up']")).click();
        waitForSecond(8);

    }

    public void openMyAccountAddress(){
        actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        waitForSecond(1);
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//span[@class='icon-box-icon icon-addresses']")).click();

    }
    public void clickAddShippingAddress(){
        driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-address/shipping/']")).click();
    }

    public void dataInputForAddress(String userName,String lastName,String companyName,String countryRegion, String streetAddress,String optStreetAddress,String townCity,String state,String zipCode){
        driver.findElement(By.xpath("//input[@id='shipping_first_name']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='shipping_last_name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='shipping_company']")).sendKeys(companyName,Keys.TAB,countryRegion,Keys.ENTER);


        //driver.findElement(By.xpath("//span[@id='select2-shipping_country-container']")).sendKeys(Keys.ENTER,countryRegion);
        //WebElement countryLocation =driver.findElement(By.xpath("//*[@id='select2-shipping_country-container']"));
        //Select selectCounty = new Select(countryLocation);
        //selectCounty.selectByVisibleText(countryRegion);
        driver.findElement(By.xpath("//input[@id='shipping_address_1']")).sendKeys(streetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_address_2']")).sendKeys(optStreetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys(townCity,Keys.TAB,state,Keys.ENTER);
        //driver.findElement(By.xpath("//span[@id='select2-shipping_state-container']")).sendKeys(state);
        //WebElement stateLocation=driver.findElement(By.xpath("//*[@id='select2-shipping_state-container']"));
        //Select selectState = new Select(stateLocation);
        //selectState.selectByVisibleText(state);
        driver.findElement(By.xpath("//input[@id='shipping_postcode']")).sendKeys(zipCode);

        waitForSecond(1);
        actions = new Actions(driver);
        WebElement saveButton=driver.findElement(By.xpath("//button[@name='save_address']"));
        actions.scrollByAmount(0, saveButton.getLocation().getY()).perform();
        waitForSecond(1);
        saveButton.click();


        /*waitForSecond(3);
        WebElement saveButton=driver.findElement(By.xpath("//button[@name='save_address']"));
        saveButton.click();

         */

    }

    public void dataInputForAddressWithoutCountry(String userName,String lastName,String companyName, String streetAddress,String optStreetAddress,String townCity,String state,String zipCode){
        driver.findElement(By.xpath("//input[@id='shipping_first_name']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='shipping_last_name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='shipping_company']")).sendKeys(companyName);


        //driver.findElement(By.xpath("//span[@id='select2-shipping_country-container']")).sendKeys(Keys.ENTER,countryRegion);
        //WebElement countryLocation =driver.findElement(By.xpath("//*[@id='select2-shipping_country-container']"));
        //Select selectCounty = new Select(countryLocation);
        //selectCounty.selectByVisibleText(countryRegion);
        driver.findElement(By.xpath("//input[@id='shipping_address_1']")).sendKeys(streetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_address_2']")).sendKeys(optStreetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys(townCity,Keys.TAB,state,Keys.ENTER);
        //driver.findElement(By.xpath("//span[@id='select2-shipping_state-container']")).sendKeys(state);
        //WebElement stateLocation=driver.findElement(By.xpath("//*[@id='select2-shipping_state-container']"));
        //Select selectState = new Select(stateLocation);
        //selectState.selectByVisibleText(state);
        driver.findElement(By.xpath("//input[@id='shipping_postcode']")).sendKeys(zipCode,Keys.TAB,Keys.ENTER);


        /*waitForSecond(3);
        WebElement saveButton=driver.findElement(By.xpath("//button[@name='save_address']"));
        saveButton.click();

         */

    }

    public void dataInputForAddressWithoutState(String userName,String lastName,String companyName,String countryRegion, String streetAddress,String optStreetAddress,String townCity,String zipCode){
        driver.findElement(By.xpath("//input[@id='shipping_first_name']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='shipping_last_name']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='shipping_company']")).sendKeys(companyName,Keys.TAB,countryRegion,Keys.ENTER);


        //driver.findElement(By.xpath("//span[@id='select2-shipping_country-container']")).sendKeys(Keys.ENTER,countryRegion);
        //WebElement countryLocation =driver.findElement(By.xpath("//*[@id='select2-shipping_country-container']"));
        //Select selectCounty = new Select(countryLocation);
        //selectCounty.selectByVisibleText(countryRegion);
        driver.findElement(By.xpath("//input[@id='shipping_address_1']")).sendKeys(streetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_address_2']")).sendKeys(optStreetAddress);
        driver.findElement(By.xpath("//input[@id='shipping_city']")).sendKeys(townCity);
        //driver.findElement(By.xpath("//span[@id='select2-shipping_state-container']")).sendKeys(state);
        //WebElement stateLocation=driver.findElement(By.xpath("//*[@id='select2-shipping_state-container']"));
        //Select selectState = new Select(stateLocation);
        //selectState.selectByVisibleText(state);
        driver.findElement(By.xpath("//input[@id='shipping_postcode']")).sendKeys(zipCode,Keys.TAB,Keys.ENTER);


        /*waitForSecond(3);
        WebElement saveButton=driver.findElement(By.xpath("//button[@name='save_address']"));
        saveButton.click();

         */

    }




    //Hard wait
    public void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Select VisiableText DDM
    public void selectVisible(WebElement ddm, String option){
        Select select = new Select(ddm);
        select.selectByVisibleText(option);
    }

    //DDM den index ile secim
    public void selectIndex(WebElement ddm,int idx){
        Select select = new Select(ddm);
        select.selectByIndex(idx);

    }

    //index ile windowa geciş yapma
    public void switchToWindow(int index){
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }




}

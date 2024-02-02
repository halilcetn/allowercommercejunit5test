package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase03 extends AtakanTestBase {
    @Test
    void addAddressWithoutFirstName() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("","US04","US04","United States","US04","US04","US04","Washington","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_first_name']")).getText();
        String expectedText="First name is a required field.";
        Assertions.assertEquals(actualText,expectedText);











    }

}

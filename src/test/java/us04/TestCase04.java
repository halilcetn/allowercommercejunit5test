package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase04 extends AtakanTestBase{
    @Test
    void addAddressWithoutLastName() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("US04","","US04","United States","US04","US04","US04","Washington","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_last_name']")).getText();
        String expectedText="Last name is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase06 extends AtakanTestBase{
    @Test
    void addAddressWithoutStreetAddress() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("US04","US04","US04","United States","","US04","US04","Washington","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_address_1']")).getText();
        String expectedText="Street address is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

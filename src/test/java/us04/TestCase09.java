package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase09 extends AtakanTestBase{
    @Test
    void addAddressWithoutZipCode() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("US04","US04","US04","United States","US04","US04","US04","Washington","");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_postcode']")).getText();
        String expectedText="ZIP Code is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

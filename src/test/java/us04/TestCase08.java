package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase08 extends AtakanTestBase {
    @Test
    void addAddressWithoutState() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddressWithoutState("US04","US04","US04","United States","US04","US04","US04","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_state']")).getText();
        String expectedText="State is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

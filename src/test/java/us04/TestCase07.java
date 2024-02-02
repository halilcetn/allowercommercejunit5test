package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase07 extends AtakanTestBase{
    @Test
    void addAddressWithoutTownCity() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("US04","US04","US04","United States","US04","US04","","Washington","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_city']")).getText();
        String expectedText="Town / City is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

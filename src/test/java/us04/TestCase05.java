package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase05 extends AtakanTestBase{
    @Test
    void addAddressWithoutCountryRegion() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddressWithoutCountry("US04","US04","US04","US04","US04","US04","Washington","12345");
        String actualText=driver.findElement(By.xpath("//li[@data-id='shipping_country']")).getText();
        String expectedText="Country / Region is a required field.";
        Assertions.assertEquals(expectedText,actualText);

    }
}

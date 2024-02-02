package us04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class TestCase02 extends AtakanTestBase{
    @Test
    void addSuccessfullyAddressWithoutOptionals() {
        registerToAllower();
        openMyAccountAddress();
        clickAddShippingAddress();
        dataInputForAddress("US04","US04","","United States","US04","","US04","Washington","12345");
        String actualText=driver.findElement(By.xpath("//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")).getText();
        String expectedText="Address changed successfully.";
        Assertions.assertEquals(expectedText,actualText);











    }
}

package us09;

public class TestCase_02 extends TestBase {
    /*
     Vendor (Satıcı) olarak, siteye kayıtlı email adresiyle kayıt yapılamamalı.
     (Vendor Registration)
     */
    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar. "marshaun.berlin@farmoaks.com"
    // 6)"Verification code sent to your email: "marshaun.berlin@farmoaks.com." mesajını görür.
    // 7)Maile gelen geçerli kodu "Verification code" kutusuna yazar.
    // 8)"Good" seviyesinde bir password girer  "Ay123?"
    // 9)"Confirm Password" kutusuna aynı passwordu bilgilerini girer.  "Ay123?"
    // 10)"Registir" linkini tıklar ve "This Email already exists. Please login to the site and apply as vendor."
    // mesajı görüldüğünü test der.
    //Actual Result:"This Email already exists. Please login to the site and apply as vendor."
    //Expected Result:"This Email already exists. Please login to the site and apply as vendor."
}

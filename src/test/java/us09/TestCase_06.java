package us09;

public class TestCase_06 extends TestBase {
    /*
    Vendor (Satıcı) olarak, siteye "Confirm Password" kutusuna aynı
    password bilgilerini girmeden kayıt yapılamamalı.
    (Vendor Registration)
     */


    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar. "arnez.brecker@falkcia.com"
    // 6)"Verification code sent to your email: arnez.brecker@falkcia.com." mesajını görür.
    // 7)Maile gelen geçerli kodu "Verification code" kutusuna yazar.
    // 8)"Good" seviyesinde bir password girer "Ay123?"
    // 9)"Confirm Password" kutusuna aynı passwordu bilgilerini girer.
    // 10)"Registir" linkini tıklar ve "Confirm Password" kutusuna aynı password bilgilerini girmeden kayıt işleminin gerçekleşmediğini test eder.
    // Actual Result: "Confirm Password: This field is required.."
    //Expected Result: "Confirm Password: This field is required.."
}

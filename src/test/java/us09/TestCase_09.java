package us09;

public class TestCase_09 extends TestBase {
     /*
    Vendor (Satıcı) olarak, siteye "Rakam ve özel karakter  içermeyen Password" ile kayıt yapılamamalı.
   (Vendor Registration)
     */

    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar. "jaxan.gavinn@farmoaks.com"
    // 6)"Verification code sent to your email: jaxan.gavinn@farmoaks.com." mesajını görür.
    // 7)Maile gelen geçerli kodu "Verification code" kutusuna yazar.
    // 8)"Good" seviyesinde bir password girer  "Abcdefgh"
    // 9)"Confirm Password" kutusuna aynı passwordu bilgilerini girer.  "Abcdefgh"
    // 10)"Registir" linkini tıklar ve kayıt işleminin gerçekleşmediğini test eder.
    //Actual Result: "Registration Successfully Completed"
    //Expected Result: Password strength should be atleast "Good".
}

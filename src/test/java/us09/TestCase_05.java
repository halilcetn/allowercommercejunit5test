package us09;

public class TestCase_05 extends TestBase{
    /*

    Vendor (Satıcı) olarak, siteye "Good" seviyesinde bir password girmeden kayıt yapılamamalı.
    (Vendor Registration)
     */


    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar.    "arnez.brecker@falkcia.com"
    // 6)"Verification code sent to your email: arnez.brecker@falkcia.com." mesajını görür.
    // 7)Maile gelen geçerli kodu "Verification code" kutusuna yazar.
    // 8)"Good" seviyesinden altta bir password girer  "Ays67"
    // 9)"Confirm Password" kutusuna aynı passwordu bilgilerini girer.  "Ays67"
    // 10)"Registir" linkini tıklar ve "Good" seviyesinde bir password girmeden kayıt işleminin gerçekleşmediğini test eder.
    //Actual Result:"Password strength should be atleast 'Good'."
    //Expected Result: "Password strength should be atleast 'Good'."
}

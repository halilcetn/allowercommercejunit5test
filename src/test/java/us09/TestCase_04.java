package us09;

public class TestCase_04 extends  TestBase{
 /*
    Vendor (Satıcı) olarak, siteye email adresine gelen kodu "Verification code"
    kutusuna girmeden kayıt yapılamamalı.
  (Vendor Registration)
     */

    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar. "arnez.brecker@falkcia.com"
    // 6)"Verification code sent to your email: arnez.brecker@falkcia.com." mesajını görür.
    // 7)"Good" seviyesinde bir password girer "Ay123?"
    // 8)"Confirm Password" kutusuna aynı passwordu bilgilerini girer.   "Ay123?"
    // 9)"Registir" linkini tıklar ve  email adresine gelen kodu "Verification code" kutusuna girmeden kayıt işleminin gerçekleşmediğini test eder.
    //Actual Result: "Email Verification Code: This field is required."
    //Expected Result:"Email Verification Code: This field is required."
}

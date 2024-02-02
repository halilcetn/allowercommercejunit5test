package us09;

public class TestCase_08 extends TestBase{
     /*
    Vendor (Satıcı) olarak, siteye "Büyük ve özel karakter içermeyen Password" ile kayıt yapılamamalı.
(Vendor Registration)
     */

    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazar. "nino.teal@farmoaks.com"
    // 6)"Verification code sent to your email: nino.teal@farmoaks.com." mesajını görür.
    // 7)Maile gelen geçerli kodu "Verification code" kutusuna yazar.
    // 8) "Büyük harf ve özel karakter içermeyen" en az 8 karekterli bir password girer  "a1234567"
    // 9)"Confirm Password" kutusuna aynı passwordu bilgilerini girer. "a1234567"
    // 10)"Registir" linkini tıklar ve kayıt işleminin gerçekleşmediğini test eder.
    // Actual Result: "Registration Successfully Completed"
    //Expected Result: Password strength should be atleast "Good".
}

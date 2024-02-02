package us09;

public class TestCase_03 extends TestBase{
    /*
    Vendor (Satıcı) olarak, siteye email adresi girmeden kayıt yapılamamalı.
    (Vendor Registration)
     */

    //NEGATİF SENARYO
    // 1)Web sitesine gidilir "https://allovercommerce.com/"
    // 2)Register In butonunu tıklar
    // 3) Sign Up linkini tıklar
    // 4)"Signup as a vendor?" linkini tıklar
    // 5)Sayfayı down yapar ve geçerli bir e mail adresi yazmaz.
    // 6)"Good" seviyesinde bir password girer "Ay123?"
    // 7)"Confirm Password" kutusuna aynı passwordu bilgilerini girer. "Ay123?"
    // 8)"Registir" linkini tıklar ve e mail adresini girmeden kayıt işleminin gerçekleşmediğini test eder.
    // Actual Result:"Email: This field is required."
    //Expected Result:"Email: This field is required."
}

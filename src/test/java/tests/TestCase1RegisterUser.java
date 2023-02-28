package tests;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase1RegisterUser {
    RegisterPage registerPage;
    @Test
    public void testName() throws InterruptedException {
        registerPage=new RegisterPage();

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexercise_url"));
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("automationexercise"));
        //4. Kaydol / Oturum Aç düğmesine tıklayın
        registerPage.login.click();
        //5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        Assert.assertTrue(registerPage.yeniKullanici.isDisplayed());
        //6. Adınızı ve e-posta adresinizi girin
        registerPage.signup.sendKeys("Göksel CELİK", Keys.TAB,"goksel5255@gmail.com");
        //7. 'Kaydol' düğmesini tıklayın
        ReusableMethods.clickByJS(registerPage.signup);
        //8. 'HESAP BİLGİLERİNİ GİRİN' mesajının görüntülendiğini doğrulayın.
        Assert.assertTrue(registerPage.hesapBilgileri.isDisplayed());
        //9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. Hesap Oluştur düğmesine tıklayın.
        registerPage.radioButon1.click();
        registerPage.kayitName.clear();
        registerPage.kayitName.sendKeys("Göksel ÇELİK",Keys.TAB,
                "Goksel52");
        registerPage.day.sendKeys("1",Keys.ENTER);
        registerPage.months.sendKeys("January",Keys.ENTER);
        registerPage.years.sendKeys("1980",Keys.TAB,Keys.SPACE,
                Keys.TAB,Keys.SPACE,Keys.TAB,"Göksel",
                Keys.TAB,"ÇELİK",Keys.TAB,"Sabanci",Keys.TAB,"Sarıcalı",Keys.TAB,"Çarşamba");
        registerPage.country.sendKeys("Canada",Keys.ENTER);
           registerPage.state.sendKeys("Samsun",Keys.TAB,"Sarıcalı",Keys.TAB,"Samsun",
                Keys.TAB,"55500",Keys.TAB,"555-555-55-55",Keys.ENTER);
        //14. 'HESAP OLUŞTURULDU!' görünür
           Assert.assertTrue(registerPage.hesapOlustu.isDisplayed());
        //15. 'Devam Et' düğmesini tıklayın
        registerPage.devamEt.click();
        Driver.getDriver().navigate().refresh();
        registerPage.devamEt.click();
        //16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        ReusableMethods.waitFor(3);
        Assert.assertTrue(registerPage.kayıtlıKullanıcı.isDisplayed());
        //17. 'Hesabı Sil' düğmesini tıklayın
        //registerPage.deleteAccount.click();
        //18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
        Assert.assertTrue(registerPage.hesapSilindiYazisi.isDisplayed());
        Driver.closeDriver();


    }
}

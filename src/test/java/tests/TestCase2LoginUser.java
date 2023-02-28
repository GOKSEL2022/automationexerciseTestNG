package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase2LoginUser {

    RegisterPage registerPage;
    @Test
    public void testName() {
        registerPage=new RegisterPage();

        //1. Tarayıcıyı başlatın
        //2. 'http://automationexercise.com' URL'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexercise_url"));
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("automationexercise"));
        //4. Kaydol / Oturum Aç düğmesine tıklayın
        registerPage.login.click();
        //5. "Hesabınızda oturum açın"ın göründüğünü doğrulayın
        Assert.assertTrue(registerPage.kayıtlıHesaplaGiris.isDisplayed());
        //6. Doğru e-posta adresini ve şifreyi girin
        registerPage.kayıtlıEmail.sendKeys("goksel5255@gmail.com", Keys.TAB,"Goksel52",Keys.TAB,Keys.ENTER);
        //7. Giriş düğmesine tıklayın
        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        Assert.assertTrue(registerPage.kayıtlıKullanıcı.isDisplayed());
        //9. 'Hesabı Sil' düğmesini tıklayın
        registerPage.deleteAccount.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.waitFor(5);
        //10. 'HESAP SİLİNDİ!' görünür
        //Driver.getDriver().navigate().refresh();
        Assert.assertFalse(registerPage.deleteAccount.isDisplayed());

    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath =" //a[.=' Signup / Login']" ) public WebElement login;
    @FindBy(xpath = "//h2[text()='New User Signup!']") public WebElement yeniKullanici;
    @FindBy(xpath = "//*[@name='name']") public WebElement name;
    @FindBy(xpath = "//*[.='Signup']") public WebElement signup;
    @FindBy(xpath = "(//*[@class='title text-center'])[1]") public WebElement hesapBilgileri;
    @FindBy(xpath = "//*[@id='id_gender1']") public WebElement radioButon1;
    @FindBy(xpath = "//*[@id='name']") public WebElement kayitName;
    @FindBy(xpath = "//*[@id='days']") public WebElement day;
    @FindBy(xpath = "//*[@id='months']") public WebElement months;
    @FindBy(xpath = "//*[@id='years']") public WebElement years;
    @FindBy(xpath = "//*[@id='uniform-optin']") public WebElement checkBox1;
    @FindBy(xpath = "//*[@name='optin']") public WebElement checkBox2;
    @FindBy(xpath = "//*[@id='country']") public WebElement country;
    @FindBy(xpath = "//*[@id='state']") public WebElement state;
    @FindBy(xpath = "(//*[.='Account Created!'])[2]") public WebElement hesapOlustu;
    @FindBy(xpath = "//*[@class='btn btn-primary']") public  WebElement devamEt;
    @FindBy(xpath = "//*[.='Göksel ÇELİK']") public WebElement kayıtlıKullanıcı;
    @FindBy(xpath = "(//*[.=' Delete Account'])[2]") public WebElement deleteAccount;
    @FindBy(xpath = "(//*[.='Account Deleted!'])[2]") public WebElement hesapSilindiYazisi;
    @FindBy(xpath = "//*[.='Login to your account']") public WebElement kayıtlıHesaplaGiris;
    @FindBy(xpath = "(//*[@name='email'])[1]") public WebElement kayıtlıEmail;
    @FindBy(xpath = "//*[@name='password']") public WebElement kayitliPassword;
    @FindBy(xpath = "//*[@id='dismiss-button']") public WebElement alert;


}

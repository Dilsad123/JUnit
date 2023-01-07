package day10_FileInputSitream;

import Utilities.ReusableMethods;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_UploadFile extends TestBase {

    @Test
    public void test01(){
        //1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //2.chooseFile butonuna basalim

        //3.Yuklemek istediginiz dosyayi secelim.
        //4.Upload butonuna basalim.
        //5.“File Uploaded!” textinin goruntulendigini test edelim.



        /*
        Bu gorevi yapabilmek icin chooseFile butonuna basildiginda
        acilan bilgisayaraimizdaki file dosyalarini click yapabilmemiz
        gerekir ancak Selenium bilgisayarimizdaki dosyalari click yapamaz

        Bunun yerine soyle bir cozum uretilmistir
        1- chooseFile butonunu locate edin
        2-Upload edilecek dosyanin dosya yolunu olusturun
         */

        WebElement chooseFileButonu = driver.findElement(By.xpath("//*[@id='file-upload']"));
                String dosyaYolu= System.getProperty("user.home")+"/Desktop/MerhabaJava.docx";
        chooseFileButonu.sendKeys(dosyaYolu);

        //Upload butonuna basalim
        driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

        //"File Uploaded" textinin goruntulendigini test edelim

        WebElement fileUploadedElementi= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedElementi.isDisplayed());

        ReusableMethods.bekle(3);

























    }

















}

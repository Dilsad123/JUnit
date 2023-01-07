package day10_FileInputSitream;

import Utilities.ReusableMethods;
import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDowlandTesti extends TestBase {

    @Test
    public void test01(){

        // 2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        // 3. Facebookd..png dosyasını indirelim

        driver.findElement(By.xpath("//a[text()='Facebookd.png']")).click();
        ReusableMethods.bekle(5);

        // 4. Dosyanın başarıyla indirilip indirilmediğini test edelim


        // Test icin oncelikle dosyanin indirildiginde dosyaYolu ne olacak bunu olusturmaliyiz

        String dosyayOLU = System.getProperty("user.home")+"\\Downloads\\Facebookd.png";

        // Bir dosyanin bilgisayarinizda var oldugunu (exist) test etmek icin
        //Java daki Files classindan yardim alacagiz

        Assert.assertTrue(Files.exists(Paths.get(dosyayOLU)));


    }

    @Test
    public void test02(){
        //Masaustunde MerhaJava.docx dosyasi oldugunu test edin

        //Dinamik dosya yolu olsuturalim

        String dosyaYolu= System.getProperty("user.home")+ "/Desktop/MerhabaJava.docx";

        //Assert edelim

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));











    }


















}

package day10_FileInputSitream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {
    @Test
    public void test01() throws FileNotFoundException {

        String dosyaYolu="C:\\Users\\LEVENT\\Desktop\\MerhabaJava.docx";

        FileInputStream fis= new FileInputStream(dosyaYolu);

        /*
        File testlerinde genellikle downloads'a indirilecek bir dosyanin
        indirildigini test etmek veya masaustundeki bir dosyanin web'e yuklene
        bildigini test etmek isteriz.

        Ancak herkesin bilgisayarinin ismi,kullanici isimleri gibi farkliliklar
        olacagindan testler tek bir bilgisayarda calisacak gibi yazilmak zorundadir.

        Bu karisikligin onune gecebilmek icin Java iki basit kod blogu sunmus
         */

        System.out.println(System.getProperty("user.dir"));
        // o anda calisan dosyanin yolunu verir

        System.out.println(System.getProperty("user.home"));
        //kullanicinin temel path'ini verir.

        // Masa ustune gitmek istersek
        // C:\Users\LEVENT+/Desktop eklememiz yeterlidir

        //Dowloads'a gitmek istersek
        //C:\Users\LEVENT+/Downloads eklememız yeterlidir

        /* Kodlarımızın dınamık olması yani kısının bılgısayarındakı
       kullanıcı adı gibi detaylara takılmaması için
       file testlerinde kullanılacak dosya yolunu "user.home" temel path'ini
       çalıştıgı bılgısayardan alacak sekılde olustururuz
        */
        String dinamikDosyaYolu=System.getProperty("user.home")+"\\Desktop\\MerhabaJava.docx";








    }













}

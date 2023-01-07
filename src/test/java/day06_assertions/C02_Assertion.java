package day06_assertions;

import org.junit.Assert;
import org.junit.Test;

public class C02_Assertion {
    /*
    JUnit framework u calistirilan testlerin passed veye failed olmasini
    raporlar.Ancak raporlamanin dogru sonuc vermesi icin testlerin assert
    clasindaki hazir methodlarla yapilamsi gerekir.Eger assert clasi kullanilmazsa
    JUnit kodlarin sorunsuz olarak calisip bittigini raporlar
    Testler failed olsa da kodlar sorunsuz calistigi icin testler yesil tik olarak
    isaretlendi
     */

    int P1Yas1=60;
    int P2Yas2=66;
    int P3Yas3=70;

    @Test
    public void test01(){
        // emekli yasi 65 olduguna gore
        //P2 nin emekli olabilecegini test edin

        Assert.assertTrue(P2Yas2>65);
    }

    @Test
    public void test02(){
        // emekli yasi 65 olduguna gore
        //P1 in emekli olamayacagini test edin

        Assert.assertFalse(P1Yas1>65);
    }

    @Test
    public void test03(){
        // emekli yasi 65 olduguna gore
        //P3 un emekli olamayacagini test edin

        Assert.assertFalse("Girilen yas 65'den kucuk olmadigindan emekli olabilir",P3Yas3>65);


    }








}

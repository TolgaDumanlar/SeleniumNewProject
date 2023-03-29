package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(20000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teknosaTitle=driver.getTitle();
        System.out.println("TeknosaTitle=" + teknosaTitle);

        String teknosaUrl=driver.getCurrentUrl();
        System.out.println("URL="+ teknosaUrl);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaTitle.contains("Teknoloji")){
            System.out.println("Title Teknoloji içeriyor");
        }else {
            System.out.println("Title Teknoloji içermiyor");
        }


        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaUrl.contains("teknosa")){
            System.out.println("URL teknosa içeriyor");
        }else{
            System.out.println("URL teknosa içermiyor");
        }

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(2000);


        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (driver.getTitle().contains("MEDUNNA")){
            System.out.println("içeriyor");
        }else{
            System.out.println("içermiyor");
        }


        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if(driver.getCurrentUrl().contains("medunna")){
            System.out.println("URL içeriyor");
        }else{
            System.out.println("URL içermiyor");
        }

        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // pencereyi kapat
        driver.close();
    }
}

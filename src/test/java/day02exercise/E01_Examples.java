package day02exercise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E01_Examples {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("https://www.amazon.com/");

//        Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

//        Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//        Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
            driver.get("https://amazon.com");
            driver.get("https://facebook.com");
            driver.get("https://youtube.com");

//        Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();

//        Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test passed");
        }else {
            System.out.println("test failed");
        }

//        Sayfanın konumunu ve boyutunu yazdırın

        System.out.println("Sayfanın boyutu:" + driver.manage().window().getSize());
        System.out.println("Sayfanın konumu:" +driver.manage().window().getPosition());

//        Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(50,50));

        System.out.println("Sayfanın yeni boyutu:" + driver.manage().window().getSize());
        System.out.println("Sayfanın yeni konumu:" +driver.manage().window().getPosition());

//        İstediğiniz şekilde olup olmadığını test edin

        Point actualPosition=driver.manage().window().getPosition();

        if(actualPosition.getX()==50 && actualPosition.getY()==50){
            System.out.println("Konum testi Passed");
        }else{
            System.out.println("Konum testi Failed");
        }

        Dimension actualSize=driver.manage().window().getSize();

        if(actualSize.getHeight()==500 && actualSize.getWidth()==500) {
            System.out.println("Boyut testi Passed");
        }else{
            System.out.println("Boyut testi Failed");
        }

//        Sayfayı kapatın
        driver.close();
    }
}

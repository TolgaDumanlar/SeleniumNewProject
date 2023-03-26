package day03exercise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class E01_ClassWork {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //         “city bike” araması yapın
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        //        Arama sonuç metnini yazdırın
        List<WebElement> aramaSonuc=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonuc.get(0).getText());

        //        Sonuç sayısını yazdırın
           String sonuc=aramaSonuc.get(0).getText().split(" ")[2];
           System.out.println(sonuc);

        //        Sonuc sayısını LAMBDA ile yazdırın


        //        Çıkan ilk sonucun resmine tıklayın.
        List<WebElement>resim=driver.findElements(By.className("s-image"));
        resim.get(0).click();

        //        Sayfayı kapatın
        driver.close();
    }
}

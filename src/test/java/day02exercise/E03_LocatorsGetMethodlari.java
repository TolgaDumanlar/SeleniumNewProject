package day02exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E03_LocatorsGetMethodlari {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //        Amazon sayfasına gidin
            driver.get("https://amazon.com");

        //        Search bölümünü locate edip, "Tablet" aratalım

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("tablet");
        aramaKutusu.submit();
        //        Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın

            WebElement aramaSonucu=driver.findElement(By.className("sg-col-inner"));
            System.out.println(aramaSonucu.getText());
        //        Sayfayı kapatın
            driver.close();
    }
}

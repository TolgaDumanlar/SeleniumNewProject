package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.security.Key;

public class C03_LocatorsGetMethodlari {
        /*
Amazon sayfasına gidin
Search bölümünü locate edip, "Tablet" aratalım
Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
Sayfayı kapatın
        */
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
            WebDriver driver=new EdgeDriver();


            //Amazon sayfasına gidin
            driver.get("https://amazon.com");

            //Search bölümünü locate edip, "Tablet" aratalım

            WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
            aramaKutusu.sendKeys("Tablet");
            aramaKutusu.submit();//Enter'a bas.

            //Arama sonuç yazısında Tablet yazısını locate edip konsola yazdırın
            WebElement aramaSonucu=driver.findElement(By.className("sg-col-inner"));
            System.out.println("AramaSonucu=" + aramaSonucu.getText());

            //Sayfayı kapatın

            driver.close();


        }
}

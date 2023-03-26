package day02exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class E2_WebElementsAndLocators {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Amazon sayfasına gidin

        driver.get("https://amazon.com");

//        Search kutusunu locate edin

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

//        Search kutusunda iphone aratın
        aramaKutusu.sendKeys("iphone");
        aramaKutusu.submit();

//        Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın

        List<WebElement> inputList=driver.findElements(By.tagName("input"));
        System.out.println("Input Sayısı:"+ inputList.size());

        List<WebElement>aList=driver.findElements(By.tagName("a"));
        System.out.println("a Tag Sayısı:" + aList.size());

//        Sayfayı kapatınız

        driver.close();

    }
}

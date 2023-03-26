package day04exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E01_Xpath {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com/");

        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        WebElement hypridike=driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        hypridike.click();

        //Sadece sonuc sayısını yazdıralım

        WebElement sonuc=driver.findElement(By.xpath("//*[text()='15 results for']"));
        String regex=sonuc.getText().split(" ")[0];
        System.out.println(regex);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement s1=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
        s1.click();

        //Sayfayı kapatınız
        driver.close();
    }
}

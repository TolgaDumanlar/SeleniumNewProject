package day03exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E02_Xpath {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ sayfasına gidin.

        driver.get("https://www.amazon.com/");

        //        “city bike” araması yapın

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //        "Under 200" olanı tıklayın

        WebElement under200=driver.findElement(By.xpath("//span[.='Under $200']"));
        under200.click();

        driver.close();
    }
}

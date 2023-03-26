package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_Xpath {

    /*
        https://www.amazon.com/ sayfasına gidin.
        “city bike” araması yapın
        Under 200 olanı tıklayın
        Sayfayı kapatın
     */

    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        https://www.amazon.com/ sayfasına gidin.

        driver.get("https://www.amazon.com/");

        //        “city bike” araması yapın

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);

        //        "Under 200" olanı tıklayın

        WebElement under200=driver.findElement(By.xpath("//span[.='Under $200']"));//attribute ismi yoksa nokta koyunuz.
        under200.click();

        driver.close();
    }
}

package day01exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class E03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops) ;

        //Amazon sayfasına gidelim:
        //driver.get("https://amazon.com");
        driver.navigate().to("https://amazon.com");

        //google sayfasına gidelim.
        Thread.sleep(1000);
        driver.navigate().to("https://google.com");

        //Amazon sayfasına geri dönelim.
        Thread.sleep(1000);
        driver.navigate().back();

        //google sayfasına tekrar gidelim.
        Thread.sleep(1000);
        driver.navigate().forward();

        //Sayfayı yenileyelim (refresh)
        Thread.sleep(1000);
        driver.navigate().refresh();

        //Sayfayı kapatalım
        Thread.sleep(1000);
        driver.close();
    }

}

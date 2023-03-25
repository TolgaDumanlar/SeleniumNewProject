package day01exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E04_Manage {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops) ;

        //techproeducation sayfasına gidelim
        //driver.navigate().to("https://techproeducation.com");
        driver.get("https://techproeducation.com");

        //Sayanın konumu ve boyutlarını yazdırın.
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //Sayfayı minimaze (simge durumu) yapalım.
//        Thread.sleep(1000);
//        driver.manage().window().maximize();
//        Thread.sleep(1000);
//        driver.manage().window().minimize();

        //Sayfayı fullscrean yapalım.
        Thread.sleep(1000);
        driver.manage().window().fullscreen();

        Thread.sleep(1000);
        driver.navigate().refresh();

        Thread.sleep(1000);
        driver.close();
    }
}

package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04_Manage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver=new EdgeDriver();

        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Sayanın konumu ve boyutlarını yazdırın.
        System.out.println("Sayfanın konumu" +driver.manage().window().getPosition());
        System.out.println("Sayfanın konumu" +driver.manage().window().getSize());

        //Sayfayı minimaze (simge durumu) yapalım.
        Thread.sleep(2000);
        driver.manage().window().minimize();

        //Sayfayı maximize (büyütme) yapalım.
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //Sayfanın konumu ve boyutlarını yazdırın.
        System.out.println("Sayfanın konumu" +driver.manage().window().getPosition());
        System.out.println("Sayfanın konumu" +driver.manage().window().getSize());

        //Sayfayı fullscrean yapalım.
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        //Sayfayı kapatalım.
        Thread.sleep(2000);
        driver.close();
    }
}

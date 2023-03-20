package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Selenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        /*
        En temel haliyle otomasyon yapmak için Class'ımıza gerekli olan webdriver'ın yerini belirtiyoruz.
        Java kütüphanesindeki System.setProperty() methoduyla driver'ı yazıp fiziki yerini belirtiyoruz.
         */

        WebDriver driver=new EdgeDriver();
        driver.get("https://google.com");


    }
}

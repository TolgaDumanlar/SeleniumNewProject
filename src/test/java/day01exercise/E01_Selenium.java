package day01exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E01_Selenium {
    public static void main(String[] args) {

        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops) ;

        driver.get("https://www.techproeducation.com");
    }
}


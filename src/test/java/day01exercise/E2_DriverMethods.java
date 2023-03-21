package day01exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E2_DriverMethods {
    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();

        ops.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(ops) ;

        driver.get("https://www.google.com");

        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        //System.out.println(driver.getWindowHandle());
    }
}

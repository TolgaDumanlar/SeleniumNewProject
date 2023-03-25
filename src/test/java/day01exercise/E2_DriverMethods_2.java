package day01exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class E2_DriverMethods_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver=new EdgeDriver();//Boş bir browser açtık
        driver.get("https://www.techproeducation.com");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());

    }
}

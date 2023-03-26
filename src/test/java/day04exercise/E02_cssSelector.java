package day04exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E02_cssSelector {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin

        driver.findElement(By.cssSelector("div="));
        //Delete butonu’nun gorunur oldugunu test edin
        //Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
    }
}

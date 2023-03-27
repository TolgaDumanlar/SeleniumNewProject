package day04exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E02_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin

        WebElement addElement=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        addElement.click();
        Thread.sleep(2000);


        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteElement=driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        System.out.println(deleteElement.isDisplayed());


        //Delete tusuna basin
        Thread.sleep(3000);
        deleteElement.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("//h3"));
        System.out.println(addRemoveElement.isDisplayed());

        driver.close();

    }
}

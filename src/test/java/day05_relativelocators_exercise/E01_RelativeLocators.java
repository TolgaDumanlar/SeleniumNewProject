package day05_relativelocators_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class E01_RelativeLocators {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //city bike aratalım

        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        WebElement hybridBike = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement roadBikes = driver.findElement(with(By.tagName("a")).below(hybridBike));
        roadBikes.click();

    }
}

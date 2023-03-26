package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”

        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        //Hyprid Bikes bölümüne tıklayınız

        /*
        (//*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
        //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
        metin varsa bu şekilde locate edebiliriz
         */
        WebElement hybridBike= driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        System.out.println(hybridBike.isDisplayed());//WebElement görünüteleniyor mu?-->Görüntülünebiliyor True
        System.out.println(hybridBike.isEnabled());//WE erişibiliyor mu?-->Erişilebiliyor True
        System.out.println(hybridBike.isSelected());//WE seçilebiliyor mu?-->Seçilemiyor False
        hybridBike.click();

        //Sadece sonuc sayısını yazdıralım
        /*
        //*[text()='15 results for']
        (//*[@class='a-section a-spacing-small a-spacing-top-small'])[1] --> 15 results for "city bike"
         */
        WebElement sonucSayisi = driver.findElement(By.xpath("//*[text()='15 results for']"));
        String [] sonuc = sonucSayisi.getText().split(" ");
        System.out.println(sonuc[0]);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@class='a-link-normal s-no-outline'])[1]")).click();

        //Sayfayı kapatınız
        driver.close();
    }
}

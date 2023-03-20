package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/Drivers/chromedriver.exe");
        WebDriver driver=new EdgeDriver();//Boş bir browser açtık

        driver.get("https://google.com");//Gitmek istediğimiz sayfayı belirtiriz.

        System.out.println("Sayfa başlığı"  + driver.getTitle());// driver.getTitle()Sayfa başlığını bize verir.

        System.out.println("Sayfa adresi(URL)" + driver.getCurrentUrl());//driver.getCurrentUrl() sayfa adresini getirir.

        System.out.println("Sayfa html code'ları"+ driver.getPageSource());  //getPageSource() sayfanın kaynak code'larını getirir.
                                                                             //yani html code'larını bize verir.

        System.out.println("Hash değeri"  + driver.getWindowHandle());  //Sayfanın (Window) hash değerini verir. Bu hash
                                                        //değerleri ile başka sayfadan bu sayfaya direk dönebilmeyi sağlar.
                                                        //(Sayfalar arasını geçiş.)
    }
}

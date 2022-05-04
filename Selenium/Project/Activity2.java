package HRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Activity2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        String url = "http://alchemy.hguy.co:8080/orangehrm/symfony/web/webres_5d69118beeec64.10301452/themes/default/images/login/logo.png";

        System.out.println("URL of the image is: " +url);

        driver.close();
    }
}

package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, 30);

        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        //Thread.sleep(4000);

        String title = driver.getTitle();

        System.out.println("title is: " +title.toString());


        if(title.equals("OrangeHRM")){
            System.out.println("title matched");
        }

        else
            System.out.println("title not matched");

        driver.close();
    }
}

package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Activity3 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.close();

    }

}

package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver = new ChromeDriver();
    //WebDriverWait wait = new WebDriverWait(driver, 20);

    @BeforeClass
    public void newOne(){
        driver.navigate().to("https://training-support.net/selenium/simple-form");
        String t = driver.getTitle();
        System.out.println("Title of page is: " +t);
    }

    @Test
    public void misOne(){

        driver.findElement(By.id("firstName")).sendKeys("Ishita");
        driver.findElement(By.id("lastName")).sendKeys("Tyagi");
        driver.findElement(By.id("email")).sendKeys("ishi@gmail.com");
        driver.findElement(By.id("number")).sendKeys("1234567899");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
    }

    @AfterClass
    public void lastOne(){
        driver.close();
    }
}

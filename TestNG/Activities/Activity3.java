package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Activity3 {
    WebDriver driver;

    @BeforeTest
    public void newOne(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.training-support.net/selenium/login-form");

    }

    @Test
    public void testcase1(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();
        String s = driver.findElement(By.id("action-confirmation")).getText();
        assertEquals(s, "Welcome Back, admin");

    }

    @AfterTest
    public void lastOme(){
        driver.close();
    }


}

package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Activity1 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void newOne(){

        driver = new ChromeDriver();

    }

    @Test
    public void module(){
        driver.navigate().to("https://www.training-support.net");
        driver.manage().window().maximize();
        String s = driver.getTitle();
        assertEquals(s, "Training Support");
        driver.findElement(By.id("about-link")).click();
        String s1 = driver.getTitle();
        System.out.println("new Title is: " +s1 );

    }

    @AfterClass
    public void lastOne(){
        driver.close();
    }

}

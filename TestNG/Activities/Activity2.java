package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Activity2 {
    WebDriver driver;

    @BeforeTest
    public void startOne(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.training-support.net/selenium/target-practice");

    }

    @Test
    public void testcase1(){
        String s = driver.getTitle();
        assertEquals(s, "Target Practice");

    }

    @Test
    public void testcase2(){
        String s1 = driver.findElement(By.cssSelector("button.black")).getText();
        assertEquals(s1, "Black");

    }

    @Test(enabled = false)
    public void testcase3(){
        String s2 = driver.findElement(By.id("third-header")).getText();
        System.out.println("clack: " +s2);
    }

    @Test
    public void testcase4(){
        throw new SkipException("Skipping this testcase");
    }

    @AfterTest
    public void lastOne(){
        driver.close();
    }




}

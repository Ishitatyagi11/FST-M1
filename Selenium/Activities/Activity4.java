package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void firstOne(){
        driver.navigate().to("https://www.training-support.net");
        String s = driver.getTitle();
        System.out.println("title is: " +s);
    }

    @Test
    public void misOneProg(){
        driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
        String s1 = driver.getTitle();
        System.out.println("new page title is: " +s1);
    }

    @AfterClass
    public void lastOneProg(){
        driver.close();
    }

}

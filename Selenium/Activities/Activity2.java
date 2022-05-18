package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        @BeforeClass
        public void newBrowserOpen(){
            driver.navigate().to("https://www.training-support.net");
            driver.manage().window().maximize();
        }

        @Test
        public void openBrowser(){
            String title = driver.getTitle();
            System.out.println("Title of the page is: " +title);

            //String s1 = driver.findElement(By.id("about-link")).getText();
            //String s2 = driver.findElement(By.className("green")).getText();
            String s3 = driver.findElement(By.linkText("About Us")).getText();
            System.out.println("text is: " +s3);

        }

        @AfterClass
        public void closeCurrentBrowser(){
            driver.close();
        }
}


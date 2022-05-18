package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {

    //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    //WebDriverWait wait = new WebDriverWait(driver, 20);

    @BeforeClass
    public void startBrowser(){
        driver.navigate().to("https://www.training-support.net");

        driver.manage().window().maximize();

    }

    @Test
    public void closeBrowser(){
        driver.close();
    }

}

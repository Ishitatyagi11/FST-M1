package HRMProject;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Activity9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebElement header;

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a")).click();

        String s = driver.findElement(By.id("emgcontact_list")).getText();

        System.out.println("Table is: " +s);

        driver.close();



    }
}

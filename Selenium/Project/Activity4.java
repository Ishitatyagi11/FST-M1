package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        driver.findElement(By.id("menu_pim_addEmployee")).click();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        WebElement f = driver.findElement(By.id("firstName"));

        f.sendKeys("Ishita");

        WebElement l = driver.findElement(By.id("lastName"));

        l.sendKeys("Tyagi");

        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        WebElement e = driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));

        e.sendKeys("Ishita Tyagi");

        e.sendKeys(Keys.ENTER);

        driver.findElement(By.id("searchBtn")).click();

        driver.close();



    }
}

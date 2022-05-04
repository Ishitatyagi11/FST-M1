package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Activity5 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        driver.findElement(By.id("btnSave")).click();

        driver.findElement(By.id("personal_txtEmpFirstName")).clear();

        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Vishank");

        driver.findElement(By.id("personal_txtEmpLastName")).clear();

        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Tyagi");

        WebElement r = driver.findElement(By.id("personal_optGender_1"));
        r.click();

        Select s = new Select(driver.findElement(By.id("personal_cmbNation")));
        s.selectByVisibleText("Indian");

        WebElement d = driver.findElement(By.xpath("//*[@id=\"personal_DOB\"]"));
        d.clear();
        d.sendKeys("1996-08-08");

        driver.findElement(By.id("btnSave")).click();

        driver.close();


    }
}

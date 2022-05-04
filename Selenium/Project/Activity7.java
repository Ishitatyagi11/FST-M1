package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {
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

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();

        driver.findElement(By.id("addWorkExperience")).click();

        driver.findElement(By.id("experience_employer")).sendKeys("IBM");

        driver.findElement(By.id("experience_jobtitle")).sendKeys("Automation Tester");

        WebElement f = driver.findElement(By.id("experience_from_date"));
        f.clear();
        f.sendKeys("2022-10-02");

        WebElement t = driver.findElement(By.id("experience_to_date"));
        t.clear();
        t.sendKeys("2022-10-07");

        driver.findElement(By.id("btnWorkExpSave")).click();

        driver.close();



    }
}

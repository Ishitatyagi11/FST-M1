package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity8 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_dashboard_index")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[4]/div/a/img")).click();

        Select s = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        s.selectByVisibleText("DayOff");

        WebElement f = driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]"));
        f.clear();
        f.sendKeys("2022-10-02");

        WebElement t = driver.findElement(By.id("applyleave_txtToDate"));
        t.clear();
        t.sendKeys("2022-10-07");

        driver.findElement(By.id("applyBtn")).click();

        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();

        WebElement f1 = driver.findElement(By.id("calFromDate"));
        f1.clear();
        f1.sendKeys("2022-10-02");

        WebElement t1 = driver.findElement(By.id("calToDate"));
        t1.clear();
        t1.sendKeys("2022-10-07");

        driver.findElement(By.id("btnSearch")).click();

        driver.close();


    }
}

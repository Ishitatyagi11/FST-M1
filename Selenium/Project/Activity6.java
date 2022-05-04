package HRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity6 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //WebDriverWait wait = new WebDriverWait(driver,30);

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");

        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("orange");

        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_directory_viewDirectory")).click();


        WebElement pp = driver.findElement(By.className("head"));
        String value =  pp.findElement(By.tagName("h1")).getText().toString();
        System.out.println("title of page is: " +value);

        if(value.equals("Search Directory")){
            System.out.println("title matched");
        }

        else
            System.out.println("title not matched");

    }
}

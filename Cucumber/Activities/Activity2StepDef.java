package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2StepDef {

    WebDriver driver = new ChromeDriver();

    @Given("^User is on Login Page$")
    public void loginPage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        driver.navigate().to("https://www.training-support.net/selenium/login-form");
    }

    @When("^User enters username and pass$")
    public void credentials(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();

    }

    @Then("^Read the page title and confirmation message$")
    public void titlePage(){
        String s = driver.getTitle();
        System.out.println("Title is : " +s);

        if(s.equals("Login Form")){
            System.out.println("title matched");
        }
        else
            System.out.println("title not matched");
    }

    @And("^Close the browser of Login page$")
    public void closeBrowsernow(){
        driver.close();
    }
}

package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1StepDef {

    WebDriver driver = new ChromeDriver();

    @Given("^User is on google home page$")
    public void openChrome() {
        System.setProperty("webDriver.chrome.driver","C:\\Users\\Ishita\\New folder\\chromedriver_win32(2)\\chromedriver.exe");

        driver.navigate().to("https://www.google.com/");

    }

    @When("User types in Cheese and hit Enter")
    public void typeOnChrome() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Cheese");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);

    }

    @Then("^Show how many search results$")
    public void resultsOnChrome() {
        String r = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Results are: " +r);
    }

    @And("^Close the browser$")
    public void closeBrowser(){
        driver.close();
    }
}

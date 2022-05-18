package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTasksActivity1 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "1effd614");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

        wait = new WebDriverWait(driver, 10);

    }

    @Test
    public void tasks(){
        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Ishita is Automating Google Tasks");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("tasks_fab")));

        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("Ishita added tasks");
        driver.findElementById("add_task_done").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("tasks_fab")));

        driver.findElementById("tasks_fab").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title")));
        driver.findElementById("add_task_title").sendKeys("This is third task");
        driver.findElementById("add_task_done").click();

        String s1 = driver.findElementByXPath("//android.widget.TextView[@text='Ishita is Automating Google Tasks']").getText();
        String s2 = driver.findElementByXPath("//android.widget.TextView[@text='Ishita added tasks']").getText();
        String s3 = driver.findElementByXPath("//android.widget.TextView[@text='This is third task']").getText();

        Assert.assertEquals(s1, "Ishita is Automating Google Tasks");
        Assert.assertEquals(s2, "Ishita added tasks");
        Assert.assertEquals(s3, "This is third task");

    }
}

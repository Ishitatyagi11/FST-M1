package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class GoogleChromeActivity1 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void settingUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceName","1effd614");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer,caps);

        wait = new WebDriverWait(driver,10);

        driver.get("https://www.training-support.net/selenium");

    }

    @Test
    public void chromeActivity() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(10).scrollIntoView(text(\"To-Do List\"))")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.widget.EditText")));
        driver.findElementByClassName("android.widget.EditText").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Ishita is automating selenium website");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();

        driver.findElementByClassName("android.widget.EditText").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Ishita is good in automation now");
        driver.findElementByXPath("//android.widget.Button[@text='Add Task']").click();

        //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.className("android.view.Button"))).click();
        //driver.findElementByClassName("android.view.View").click();

        driver.findElementByXPath("/android.view.View[2][@text='Add more tasks to this list.']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Ishita is automating selenium website']").click();




    }

}

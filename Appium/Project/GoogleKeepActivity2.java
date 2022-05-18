package LiveProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeepActivity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setsUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "1effd614");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);

        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void googleKeep(){
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("background_theme_image_view")));
        driver.findElementById("editable_title").sendKeys("My Notes");
        driver.findElementById("edit_note_text").sendKeys("This is my first note in Goggle Keep App.");

        driver.findElementByAccessibilityId("Open navigation drawer").click();

        String s1 = driver.findElementByXPath("//android.widget.TextView[1][@text='My Notes']").getText();
        String s2 = driver.findElementByXPath("//android.widget.TextView[2][@text='This is my first note in Goggle Keep App.']").getText();

        Assert.assertEquals(s1, "My Notes");
        Assert.assertEquals(s2, "This is my first note in Goggle Keep App.");
    }

}

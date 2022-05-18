package LiveProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeepBonusAvtivity1 {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void firstOne() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceNmae","1effd614");
        caps.setCapability("platformNmae","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("appPackage","com.google.android.keep");
        caps.setCapability("appActivity",".activities.BrowseActivity");
        caps.setCapability("noReset",true);

        URL appServer = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(appServer,caps);
    }

    @Test
    public void midOne(){
        driver.findElementById("new_note_button").click();
        driver.findElementById("background_theme_image_view").sendKeys("New Notes");
        driver.findElementById("")

    }
}

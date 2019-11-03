import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSampleTest {

    public AndroidDriver driver;

    @BeforeTest
    public void setUp()throws MalformedURLException {
        String appiumServerURL = "https://127.0.0.1:4723/wd/hub";
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "8.0");
        dc.setCapability("app", "C:\\Users\\RogerSouke\\IdeaProjects\\FirstMobileAppTest");
        dc.setCapability("deviceName", "c4e3f3cd");
        dc.setCapability("automationName", "UiAutomator2");

        driver = new AndroidDriver(new URL(appiumServerURL), dc);

    }
        @Test
                public void firstTest() throws InterruptedException{
            driver.findElement(By.id("Login Screen")).click();
        }
        }


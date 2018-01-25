import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseSafariTest

{

    private static IOSDriver driver;


    public static void main(String[] args) throws MalformedURLException {
        try

        {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "11.0");
            //capabilities.setCapability("platform", "Mac");
            capabilities.setCapability("deviceName", "iPhone 8 Plus");
            capabilities.setCapability("udid", "udid");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("browserName", "Safari");

            //Connecting to Appium Server

            driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

            driver.get("www.google.com");

            driver.findElement(By.id("")).sendKeys("");
            driver.findElement(By.id("")).click();

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            driver.quit();
        }

        catch (Exception ex)
        {

        }


    }
}
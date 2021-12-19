package capabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LuloCapabilities {
    public  static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver<MobileElement> driver;

   File f = new File("\\src\\main\\resources\\apk\\TrianguloApp.apk");

    public static void capabilities() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3a API 28");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
        capabilities.setCapability(MobileCapabilityType.APP,"\\APK\\TrianguloApp.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES,true);
        capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        capabilities.setCapability("waitForQuiescence", false);
        capabilities.setCapability("useNewWDA",false);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}

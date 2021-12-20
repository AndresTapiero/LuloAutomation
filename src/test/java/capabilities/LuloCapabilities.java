package capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utils.Resources.*;

public class LuloCapabilities {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AndroidDriver androidDriver;
    public static IOSDriver iosDriver;
    public static String SO = System.getProperty(OS_NAME);
    public static final String APK_LOCATION_W = System.getProperty(USER_DIR) + "\\src\\test\\resources\\apk\\TrianguloApp.apk";
    public static final String APK_LOCATION_M = System.getProperty(USER_DIR) + "/src/test/resources/apk/TrianguloApp.apk";

    public static void capabilities(String platformType, String deviceName, String platformVersion, String systemPort) throws MalformedURLException {
        url = new URL("http://127.0.0.1:" + systemPort + "/wd/hub");
        capabilities = new DesiredCapabilities();
        if (platformType.equalsIgnoreCase(ANDROID)) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            if (SO.contains(WINDOWS)) capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_W); else capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_M);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_AUTOMATION);
            capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
            capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
            androidDriver = new AndroidDriver(url, capabilities);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            if (SO.contains(WINDOWS)) capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_W); else capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_M);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, iOS_AUTOMATION);
            capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
            iosDriver = new IOSDriver(url, capabilities);
            iosDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }
}

package capabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
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
    public static String SO = System.getProperty("os.name");
    public static final String APK_LOCATION_W = System.getProperty(USER_DIR) + "\\src\\test\\resources\\apk\\TrianguloApp.apk";
    public static final String APK_LOCATION_M = System.getProperty(USER_DIR) + "/src/test/resources/apk/TrianguloApp.apk";

    public static String platformType = ANDROID;

    //TODO: Fix capabilities iOS and run parallel test
    public static void capabilities() throws MalformedURLException {
        url = new URL(URL_STRING);
        capabilities = new DesiredCapabilities();
        if (platformType.equalsIgnoreCase(ANDROID)) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ANDROID_DEVICE);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROID_VERSION);
            if (SO.contains(WINDOWS)) capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_W); else capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_M);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_AUTOMATION);
            capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
            androidDriver = new AndroidDriver(url, capabilities);
            androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        } else if (platformType.equalsIgnoreCase(IOS)) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, iOS_DEVICE);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, iOS_VERSION);
            if (SO.contains(WINDOWS)) capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_W); else capabilities.setCapability(MobileCapabilityType.APP, APK_LOCATION_M);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_AUTOMATION);
            capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
            iosDriver = new IOSDriver(url, capabilities);
            iosDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
}

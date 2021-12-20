import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.TriangleSteps;

import static capabilities.LuloCapabilities.capabilities;
import static utils.GenericActions.closeApp;

public class LuloRunner {

    final TriangleSteps steps = new TriangleSteps();

    @BeforeTest(alwaysRun = true)
    @Parameters({"platformType", "deviceName", "platformVersion", "systemPort"})
    public void setup(String platformType, String deviceName, String platformVersion, String systemPort) throws Exception {
        capabilities(platformType, deviceName, platformVersion, systemPort);
    }

    @Test(priority = 1)
    public void fillEmptyTriangle() {
        steps.validateEmptyFields();
    }

    @Test(priority = 2)
    public void fillScaleneTriangle() {
        steps.scaleneTrianqle();
    }

    @Test(priority = 3)
    public void appState() {
        steps.appState();
    }

    @AfterTest
    public void close() {
        closeApp();
    }
}

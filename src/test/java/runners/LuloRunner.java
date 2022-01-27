package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import steps.TriangleSteps;

import static capabilities.LuloCapabilities.capabilities;
import static utils.GenericActions.closeApp;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\Ejemplo.feature",
        glue = "steps",
        tags = "",
        snippets = SnippetType.CAMELCASE
)
public class LuloRunner {
    
  /*  final TriangleSteps steps = new TriangleSteps();

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
    }*/
}

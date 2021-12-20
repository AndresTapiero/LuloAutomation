import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import steps.TriangleSteps;

import java.net.MalformedURLException;

import static capabilities.LuloCapabilities.capabilities;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LuloRunner {

    final TriangleSteps steps = new TriangleSteps();

    @Before
    public void setupAppium() throws MalformedURLException {
        capabilities();
    }

    @Test
    public void firstTest() {
        steps.validateEmptyFields();
    }

    @Test
    public void fillScaleneTriangle() {
        steps.scaleneTrianqle();
    }

    @After
    public void close() {

    }
}

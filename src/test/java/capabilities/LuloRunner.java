package capabilities;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.net.MalformedURLException;

import static capabilities.LuloCapabilities.capabilities;
import static utils.GenericActions.waitById;
import static utils.GenericActions.writeElementId;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LuloRunner {


    @Before
    public void setupAppium() throws MalformedURLException {
        capabilities();
    }

    @Test
    public void firstTest(){
        waitById("com.eliasnogueira.trianguloapp:id/txtLado1");
        writeElementId("com.eliasnogueira.trianguloapp:id/txtLado1","5.0");
        System.out.println("This is a success test");
    }


    @After
    public void close(){

    }
}

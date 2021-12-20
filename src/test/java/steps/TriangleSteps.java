package steps;

import org.junit.Assert;

import static ui.UserInterface.*;
import static utils.GenericActions.*;

public class TriangleSteps {

    public void validateEmptyFields() {
        Assert.assertTrue(validateTextTitles());
        waitById(INPUT_FIELD_SIDE_1);

        getAttributeValueById(INPUT_FIELD_SIDE_1);
        getAttributeValueById(INPUT_FIELD_SIDE_2);
        getAttributeValueById(INPUT_FIELD_SIDE_3);
        clickBtn(BTN_CALCULATE);
        //TODO: Validate Empty Title
        Assert.assertEquals(getAttributeValueById(RESULT),"Preencha todos os campos");
    }

    public void scaleneTrianqle(){
        waitById(INPUT_FIELD_SIDE_1);
        writeElementId(INPUT_FIELD_SIDE_1, "5");
        writeElementId(INPUT_FIELD_SIDE_2, "4");
        writeElementId(INPUT_FIELD_SIDE_3, "2");
        clickBtn(BTN_CALCULATE);
        Assert.assertEquals(getAttributeValueById(RESULT),"O triângulo é Escaleno");
    }


    public boolean validateTextTitles() {
        return checkDisplayToId(TITLE_SIDE_1) && checkDisplayToId(TITLE_SIDE_2) && checkDisplayToId(TITLE_SIDE_3);
    }

}

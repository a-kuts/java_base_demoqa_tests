package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static tests.testdata.TestData.*;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();


    @Test
    void successfulFillFormTest() {
        textBoxPage
                .openPage()
                .typeUserName(userName)
                .typeUserEmail(userEmail)
                .typeCurrentAddress(currentAddress)
                .typePermanentAddress(permanentAddress)
                .submitForm()

                .checkField("name", userName)
                .checkField("email", userEmail)
                .checkField("currentAddress", currentAddress)
                .checkField("permanentAddress", permanentAddress);
    }

    @Test
    void successfulFillFormWithoutAddressTest() {
        textBoxPage.openPage();
        textBoxPage.typeUserName(userName);
        textBoxPage.typeUserEmail(userEmail);
        textBoxPage.submitForm();

        textBoxPage.checkField("name", userName);
        textBoxPage.checkField("email", userEmail);
    }
}


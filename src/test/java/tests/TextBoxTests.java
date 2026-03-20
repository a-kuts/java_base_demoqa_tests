package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.testdata.TestData.*;

public class TextBoxTests extends TestBase {

//    String userName;
//    String userEmail;
//    String currentAddress;
//    String permanentAddress;
//
//    @BeforeEach
//    public void setup() {
//        userName - getRandomString(10);
//
//        userName = "ivan ivanov";
//        userEmail = "ivan@ivanov.com";
//        currentAddress = "true address";
//        permanentAddress = "very true address";
//   }

    @Test
    void successfulFillFormTest() {
//        String userName = "ivan ivanov";
//        String userEmail = "ivan@ivanov.com";
//        String currentAddress = "true address";
//        String permanentAddress = "very true address";


        open("/text-box");
        $("[id=userName]").setValue(userName);
        $("[id=userEmail]").setValue(userEmail);
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=permanentAddress]").setValue(permanentAddress);
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text(userName));
        $("[id=output] [id=email]").shouldHave(text(userEmail));
        $("[id=output] [id=currentAddress]").shouldHave(text(currentAddress));
        $("[id=output] [id=permanentAddress]").shouldHave(text(permanentAddress));
    }

    @Test
    void successfulFillFormWithoutAddressTest() {
//        String userName = "ivan ivanov";
//        String userEmail = "ivan@ivanov.com";
//        String currentAddress = "true address";
//        String permanentAddress = "very true address";


        open("/text-box");
        $("[id=userName]").setValue(userName);
        $("[id=userEmail]").setValue(userEmail);
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text(userName));
        $("[id=output] [id=email]").shouldHave(text(userEmail));
    }
}


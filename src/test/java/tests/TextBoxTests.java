package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/text-box");
        $("[id=userName]").setValue("ivan ivanov");
        $("[id=userEmail]").setValue("ivan@ivanov.com");
        $("[id=currentAddress]").setValue("true address");
        $("[id=permanentAddress]").setValue("very true address");
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text("ivan ivanov"));
        $("[id=output] [id=email]").shouldHave(text("ivan@ivanov.com"));
        $("[id=output] [id=currentAddress]").shouldHave(text("true address"));
        $("[id=output] [id=permanentAddress]").shouldHave(text("very true address"));
    }

}

package pages.mts;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class JobsPage {
    private SelenideElement element = $("h1");

    public void checkTextHeader(String text) {
        element.shouldHave(text(text));
    }
}

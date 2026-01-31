package pages.mts;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MtsMainPage {
    ElementsCollection headers = $$("a[class*='NavMenuItem_navMenuItem']");

    public JobsPage clickHeader(String textField) {
        headers.findBy(text(textField)).click();
        return new JobsPage();
    }

}

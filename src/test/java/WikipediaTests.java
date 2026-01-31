

import org.junit.jupiter.api.Test;
import pages.google.WikipediaMainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikipediaTests extends BaseTest {



    @Test
    void firstXpathTest() {
        WikipediaMainPage mainPage = new WikipediaMainPage();

        open("/");
         mainPage.searchFor("Java")
                 .openResultByText("Модель памяти Java");
        $("#firstHeading").shouldHave(text("Модель памяти Java"));
//        $("#firstHeading").shouldBe(visible);
//        $("#firstHeading").shouldHave(text("Java"));
    }
}
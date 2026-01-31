package pages.google;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WikipediaMainPage {


    private SelenideElement searchInput = $(By.xpath("//input[@type = 'search']"));

    public SearchResultPage searchFor(String text) {
        searchInput.setValue(text).pressEnter();
        return new SearchResultPage();
    }
}

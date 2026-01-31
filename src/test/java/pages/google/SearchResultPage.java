package pages.google;


import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

     private ElementsCollection result = $$(".mw-search-results li a");

     public void openResultByText(String targetText) {
         result.findBy(text(targetText)).click();
     }
}

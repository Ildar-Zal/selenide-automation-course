import org.junit.jupiter.api.Test;
import pages.mts.MtsMainPage;

import static com.codeborne.selenide.Selenide.open;

public class MtsTests extends BaseTest {

    @Test
    public void searchTest() {
        MtsMainPage mainPage = new MtsMainPage();
        open("https://job.mtsbank.ru/");
        mainPage.clickHeader("Вакансии")
                .checkTextHeader("ВАКАНСИИ В МТС ФИНТЕХ");
    }

}

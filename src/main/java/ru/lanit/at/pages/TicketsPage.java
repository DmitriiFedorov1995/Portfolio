package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;
 import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
@Name("список тикетов")
public class TicketsPage extends WebPage {

    @Name("Save query")
    private SelenideElement saveQueryBut = $x("//*[@id=\"headingTwo\"]/h5/button");

    @Name("Query Name")
    private SelenideElement inputQuerSp = $x("//input[@id=\"id_title\"]");

    @Name("Check Box Share")
    private SelenideElement sheckBoxShare = $x("//input[@name=\"shared\"]");


    @Name("Кнопка Save Query")
    private SelenideElement subQueryBut = $x("//input[@value=\"Save Query\"]");

    @Name("Use Saved Query")
    private SelenideElement useSaveQuery = $x("//*[@id=\"headingThree\"]/h5/button");

    @FindBy(xpath = "//div[@class='tickettitle']/a")
    private static List <WebElement> ticketsHref;

   @Name("Query Href")
   private static SelenideElement queryHref = $x("//select[@id=\"id_query_selector\"]");

   @Name("Run Query")
   private SelenideElement runQueryBut = $x("//input[@value=\"Run Query\"]");

    public static List<WebElement> getTicketsHref() {
        return ticketsHref;
    }

    public static void choiseSavedQuery(String queryName) {
       queryHref.selectOption(queryName);
    }

    public static void openTicket(String id) {
        ticketsHref.stream()
                .filter(WebElement::isDisplayed)
                .filter(ticketHref -> ticketHref.getText().startsWith(id))
                .findFirst()
                .orElseThrow(() -> new AssertionError("Не найден тикет с id " + id))
                .click();
    }

}

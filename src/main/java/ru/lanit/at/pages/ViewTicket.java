package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "вид тикета")
public class ViewTicket extends WebPage {
    @Name("Description")
    private SelenideElement description = $x("//td[@colspan=\"2\"]");


    @Name("id и название")
    private SelenideElement title = $x("//caption");
}

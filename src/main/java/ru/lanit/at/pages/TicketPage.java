package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name("страница тикета")
public class TicketPage extends WebPage {
    @Name("Attache Files")
    private SelenideElement attacheFiles = $x("//button[@id=\"ShowFileUpload\"]");

    @Name("Browse")
    private static SelenideElement browse = $x("//label[@class=\"btn btn-primary btn-sm btn-file\"]");

    @Name("input")
    private static SelenideElement input = $x("//input[@id=\"file0\"]");

    @Name("Update This Ticket")
    private static SelenideElement updateThisTicket = $x("//button[@class=\"btn btn-primary float-right\"]");

    @Name("loaded file")
    private static SelenideElement loadedFile = $x("//span[@id=\"selectedfilename0\"]");

    public static SelenideElement getInput() {
        return input;
    }
}

package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Новый тикет")
public class CreateTicketPage extends WebPage {
    @Name("Summary Problem")
    private SelenideElement inputProblem = $x("//input[@name=\"title\"]");

    @Name("Queue")
    private SelenideElement selectQueue = $x("//select[@name=\"queue\"]");

    @Name("Description of your issue")
    private SelenideElement describe = $x("//textarea[@id=\"id_body\"]");

    @Name("Priority")
    private SelenideElement priority = $x("//select[@name=\"priority\"]");

    @Name("Submitter E-Mail Address")
    private SelenideElement emailAdress = $x("//input[@name=\"submitter_email\"]");

    @Name("Submit Ticket")
    private SelenideElement submitTicketButton = $x("//button[@type=\"submit\"]");

}

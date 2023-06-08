package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "главное меню")
public class MainMenu extends WebPage {
    @Name("новый тикет")
    private SelenideElement newTicketButton = $x("//span[contains(text(),'New Ticket')]");;

    @Name("логин")
    private SelenideElement logInButton = $((By.id("userDropdown")));

    @Name("поле поиска")
    private SelenideElement inputSearch = $x("//input[@id='search_query']");

    @Name("кнопка Go")
    private SelenideElement goButton = $x("//nav//button[@type='submit']");


}

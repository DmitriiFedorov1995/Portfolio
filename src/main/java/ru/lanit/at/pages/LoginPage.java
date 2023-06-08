package ru.lanit.at.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.utils.web.annotations.Name;
import ru.lanit.at.utils.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "страница авторизации")
public class LoginPage extends WebPage {
    @Name("имя пользователя")
    private SelenideElement user = $x("//input[@id='username']");


    @Name("пароль")
    private SelenideElement password = $(By.id("password"));

    @Name("Login")
    private SelenideElement loginButton = $(By.cssSelector("[type='submit']"));

}

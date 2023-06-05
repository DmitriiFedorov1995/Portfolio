package web;

import elements.MainMenu;
import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelpdeskUITest {

    private WebDriver driver;
    private Ticket ticket;



    @BeforeClass
    public void setup() throws IOException {
        loadProperties();
        setupDriver();
        System.setProperty("web-driver.chrome.driver", System.getProperty("webdriver.chrome.driver"));
        driver.get(System.getProperty("site.url"));


    }

    @Step("Загрузить конфигурацилнные файлы")
    private void loadProperties() throws IOException {
        // Читаем конфигурационные файлы в System.properties
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("user.properties"));
    }

    @Step("Создать экземпляр драйвера")
    private void setupDriver() {
        // Создание экземпляра драйвера
        driver = new ChromeDriver();

        // Устанавливаем размер окна браузера, как максимально возможный
        driver.manage().window().maximize();
        // Установим время ожидания для поиска элементов
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Установить созданный драйвер для поиска в веб-страницах
        AbstractPage.setDriver(driver);
    }

    @Test
    public void createTicketTest() {
        // todo: шаги тест-кейса
        String user = System.getProperty("user");
        String password = System.getProperty("password");
        MainMenu mainMenu = new MainMenu(driver);
        TicketsPage ticketsPage = new TicketsPage();
        new MainMenu(driver).clickOnNewTicketButton();
        // ...
        ticket = buildNewTicket();
        // ...
        new CreateTicketPage().createTicket(ticket);
        new ViewPage().saveId(ticket);
        mainMenu.clickOnLogInButton();
        new LoginPage().login(user, password);
        mainMenu.setInputSearch(ticket.getTitle()); //поиск по тайтлу
        mainMenu.clickOnGoButton();                //кнопка го
        ticketsPage.openTicket(ticket);
        new TicketPage().checkTicket(ticket);//открыть тикет
    }

    private Ticket buildNewTicket() {

        Ticket ticket = new Ticket();
        // todo: заполнить поля тикета
        ticket.setTitle("Немануальный тест2");
        ticket.setDescription("Тестовый текст");
        ticket.setDue_date("1232-08-23 14:45:22");
        ticket.setSubmitter_email("erre@rere.trt");
        return ticket;
    }

  // @AfterTest
    public void close() {
        if (driver != null) {
            // Закрываем одно текущее окно браузера
            driver.close();
            // Закрываем все открытые окна браузера, завершаем работу браузера, освобождаем ресурсы
            driver.quit();
        }
    }
}

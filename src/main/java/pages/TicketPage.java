package pages;

import io.qameta.allure.Step;
import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/** Страница отдельного тикета (авторизированный пользователь) */
public class TicketPage extends HelpdeskBasePage {

    /* Верстка страницы может измениться, поэтому для таблиц вместо индексов строк и столбцов лучше использовать
       более универсальные локаторы, например поиск по тексту + parent, following-sibling и другие.

       Текст тоже может измениться, но в этом случае элемент не будет найден и тест упадет,
       а ошибку можно будет легко локализовать и исправить.
       В случае изменений ячеек таблицы, локатор будет продолжать работать, но будет указывать на другой элемент,
       поведение теста при этом изменится непредсказуемым образом и ошибку будет сложно найти. */
    private WebElement dueDate = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/table/tbody/tr[1]/td[1]"));  //th[text()='Due Date']/following-sibling::td[1]"));

    // todo: проинициализировать элементы через driver.findElement

    private WebElement title= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/table/thead/tr/th/h3"));
  //  private WebElement queue = driver.findElement(By.xpath("//th[@colspan=\"4\"]/h3/text()/following::text()"));
    private WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/table/thead/tr/th"));
    private WebElement priority = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div[1]/div/div/table/tbody/tr[3]/td[1]"));
    private WebElement description = driver.findElement(By.xpath("//*[@id=\"ticket-description\"]/p"));
    //th[@colspan="4"]/h3/text()/text()
    @Step("Проверить значение полей на странице тикета")
    public void checkTicket(Ticket ticket) {
        //Assert.assertTrue(dueDate.getText().contains(ticket.getDue_date()));
        Assert.assertTrue(title.getText().contains(ticket.getTitle()));
       // Assert.assertTrue(queue.getText().contains(String.valueOf(ticket.getQueue())));
        //Assert.assertTrue(email.getText().contains(ticket.getSubmitter_email()));
        Assert.assertTrue(priority.getText().contains(String.valueOf(ticket.getPriority())));
        Assert.assertTrue(description.getText().contains(ticket.getDescription()));
        // todo: добавить реализацию метода
    }
}

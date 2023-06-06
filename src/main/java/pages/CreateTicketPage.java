package pages;

import elements.MainMenu;
import io.qameta.allure.Step;
//import models.Dictionaries;
import models.Ticket;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/** Страница создания тикета */
public class CreateTicketPage extends HelpdeskBasePage {

    // todo: добавить элементам локтаоры через @FindBy
    @FindBy(xpath = "//select[@name=\"queue\"]")
    private WebElement selectQueue;
    @FindBy(xpath = "//input[@name=\"title\"]")
    private WebElement inputProblem;
    @FindBy(xpath = "//textarea[@id=\"id_body\"]")
    private  WebElement describe;
    @FindBy(xpath = "//select[@name=\"priority\"]")
    private WebElement priority;
    @FindBy(xpath = "//input[@name=\"due_date\"]")
    private WebElement dueOnButton;
    @FindBy(xpath = "//input[@name=\"submitter_email\"]")
    private WebElement emailAdress;

    //private WebElement getId = driver.findElement(By.xpath("/html/body/div/div/div/table/caption"));


    // todo: добавить остальные поля формы
    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement submitTicketButton;
    // todo: проинициализировать элементы


    public void setSelectQueue(WebElement selectQueue) {
        this.selectQueue = selectQueue;
    }

    public void setInputProblem(WebElement inputProblem) {
        this.inputProblem = inputProblem;
    }

    public void setDescribe(WebElement describe) {
        this.describe = describe;
    }

    public void setPriority(WebElement priority) {
        this.priority = priority;
    }

    public void setDueOnButton(WebElement dueOnButton) {
        this.dueOnButton = dueOnButton;
    }

    public void setEmailAdress(WebElement emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setSubmitTicketButton(WebElement submitTicketButton) {
        this.submitTicketButton = submitTicketButton;
    }

    public WebElement getSelectQueue() {
        return selectQueue;
    }

    public WebElement getInputProblem() {
        return inputProblem;
    }

    public WebElement getDescribe() {
        return describe;
    }

    public WebElement getPriority() {
        return priority;
    }

    public WebElement getDueOnButton() {
        return dueOnButton;
    }

    public WebElement getEmailAdress() {
        return emailAdress;
    }

    public WebElement getSubmitTicketButton() {
        return submitTicketButton;
    }

    public CreateTicketPage() {
        PageFactory.initElements(driver, this);
    }

    @Step("Создать тикет")
    public CreateTicketPage createTicket(Ticket ticket) {
        // todo: заполнить остальные поля формы
        //new MainMenu(driver).clickOnNewTicketButton();//нажали на кнопку создания нового тикет, перешли на вкладку создания нового тикета//
       setInputProblem(ticket.getTitle());
       new Select(selectQueue).selectByIndex(ticket.getQueue());
        describe.sendKeys(ticket.getDescription());
        new Select(priority).selectByIndex(ticket.getPriority()-1);
        dueOnButton.sendKeys(ticket.getDue_date());
        emailAdress.sendKeys(ticket.getSubmitter_email());
        clickOnSubmitButton();

        return this;
    }

    @Step("Ввести имя проблемы: {text}")
    public void setInputProblem(String text) {
        inputProblem.sendKeys(text);
    }

    @Step("Нажать на кнопку создания тикета")
    public void clickOnSubmitButton() {
        submitTicketButton.click();
    }
}

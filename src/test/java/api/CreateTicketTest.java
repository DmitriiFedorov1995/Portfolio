package api;
//import io.restassured.http.ContentType;
//import model.AuthToken;
//import org.json.*;
import model.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
import model.Ticket;
//import io.restassured.*;

import java.io.IOException;

import static io.restassured.RestAssured.given;

/** Создание и проверка тикета */
public class CreateTicketTest extends BaseTest {

    @Test
    public void createTicketTest() throws IOException {
        // todo: создать тикет и проверить, что он находится в системе
        Ticket ticket = buildNewTicket(Status.OPEN, Integer.parseInt(System.getProperty("priority")));
        Ticket newTicket = createTicket(ticket);
        Assert.assertEquals(ticket, getTicket(newTicket.getId()));
    }

    protected Ticket getTicket(int id) throws IOException{
        // todo: отправить HTTP запрос на получение тикета по его id
        return given()
                    .header("Authorization", "Token "+login().getToken())
                    .pathParam("ticketID", id)
                .when()
                    .get("api/tickets/{ticketID}")
                .then()
                    .statusCode(200)
                    .extract().body()
                    .as(Ticket.class);
    }
}

package api;
//import io.restassured.http.ContentType;
//import model.AuthToken;
//import org.json.*;
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
        Ticket ticket = buildNewTicket(null, null);
        Ticket newTicket = createTicket(ticket);

        Assert.assertEquals(ticket, getTicket(newTicket.getId())); //eqTicket.getTitle()
    }

    protected Ticket getTicket(int id) {
        // todo: отправить HTTP запрос на получение тикета по его id
        return given()
                    .pathParam("ticketID", id)
                .when()
                    .get("/api/tickets/{ticketID}")
                .then()
                    .statusCode(200)
                    .extract().body()
                    .as(Ticket.class);
    }
}

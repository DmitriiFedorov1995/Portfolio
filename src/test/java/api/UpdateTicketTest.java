package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.Status;
import model.Ticket;
import org.testng.annotations.Test;

import java.io.IOException;

/** Обновление тикета */
public class UpdateTicketTest extends BaseTest {

    @Test
    public void updateTicketTest() throws IOException {
        // todo: создать тикет со статусом Closed, затем обновить тикет и проверить сообщение об ошибке (негативный сценарий)
        Ticket testTicket = createTicket(buildNewTicket(Status.CLOSED, null));
        testTicket.setStatus(Status.OPEN.getCode());
        updateTicketNegative(testTicket);
    }

    private void updateTicketNegative(Ticket ticket) {
        // todo: отправить HTTP запрос для обновления данных тикета и сразу же проверить статус код (должен соответствовать ошибке)
        RestAssured.given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(ticket)
                .pathParam("ticketID", ticket.getId())
                .when()
                .put("/api/tickets/{ticketID}")
                .then()
                .statusCode(200);
    }
}
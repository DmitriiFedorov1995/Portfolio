package api;

//import java.io.FileInputStream;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
//import io.restassured.mapper.ObjectMapper;
//import io.restassured.specification.RequestSpecification;
import model.AuthToken;
import model.Status;
import model.Ticket;
//import org.json.*;
import org.testng.annotations.BeforeClass;
import java.io.*;
//import org.junit.*;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
    @BeforeClass
    public void prepare() throws IOException {
        // todo: загрузить в системные переменные "base.uri" из "config.properties"
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties")); //read conf.file
            String baseUri = System.getProperty("base.uri");
            if (baseUri == null || baseUri.isEmpty()) {
                throw new RuntimeException("В файле \"config.properties\" отсутствует значение \"base.uri\"");
            }
            // todo: подготовить глобальные преднастройки для запросов
            RestAssured.requestSpecification = new RequestSpecBuilder()
                    .setBaseUri(baseUri)
                    .addHeader("Authorization", "Token "+login().getToken())
                    .setAccept(ContentType.JSON)
                    .setContentType(ContentType.JSON)
                    .log(LogDetail.ALL)
                    .build();
    }

    protected AuthToken login() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
                 // todo: отправить запрос на получения токена, используя учетные данные из "config.properties"
        AuthToken authToken = new AuthToken(System.getProperty("username"), System.getProperty("password"));
        return given()
                .contentType(ContentType.JSON)
                .baseUri(System.getProperty("base.uri"))
                .when()
                .body(authToken)
                //.baseUri(System.getProperty("base.uri"))
                .post("/api/login")
                .then()
                .statusCode(200)
                .extract().body()
                .as(AuthToken.class);
    }

    protected Ticket buildNewTicket(Status status, Integer[] priority) throws IOException{
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("config.properties"));
        // todo: создать объект с тестовыми данными
        return new Ticket(System.getProperty("title"), Integer.valueOf(System.getProperty("queue")),
               status.getCode(), priority);
    }

    protected Ticket createTicket(Ticket ticket) {
        // todo: отправить HTTP запрос для создания тикета
        return given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(ticket)
                .post("/api/tickets")
                .then()
                .statusCode(201)
                .extract().body()
                .as(Ticket.class);
        }
    }


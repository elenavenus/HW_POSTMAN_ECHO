import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    public void postmanEchoTest(){
        String body = "Hello, postman";
        given()
                .baseUri("https://postman-echo.com")
                .body(body) // отправляемые данные (заголовки и query можно выставлять аналогично)
                .contentType("text/plain; charset=UTF-8")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .log().all()
                .statusCode(200)
                .body("data",equalTo(body + " echo"));
    }




}

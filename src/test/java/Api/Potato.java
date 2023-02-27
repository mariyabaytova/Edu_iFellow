package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.File;
import java.net.URI;

//import static com.sun.glass.ui.Application.application;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;
import static org.hamcrest.core.StringContains.containsString;

public class Potato {

    public static void uriCreate() {
        URI uri = URI.create("http://example.com/my/path?name=tomato&job=Eat_maket");
    }
    public static void PotatoVSTomato() {

        File f = new File("potato.json");
        // URI u = f.toURI();
        // RestAssured.baseURI = "http://example.com/my/path?name=potato&job=Eat_maket/";
        JSONObject requestBody = new JSONObject()
                .put("name", "Tomato")
                .put("job", "Eat maket");
        Response updateTomato = given()
                .body(requestBody.toString())
                .body(f)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                //.contentType("text/html; charset=UTF-8")
                //  .contentType("application/json")
                .contentType(ContentType.JSON)
                .extract().
                response();

        updateTomato.prettyPrint();

    }
}


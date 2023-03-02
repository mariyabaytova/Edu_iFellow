package ApiSteps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class Potato {
    public static String param1;
    public static String param2;

    public static void PotatoVSTomato() throws IOException {

        RestAssured.baseURI = "https://reqres.in/";

        JSONObject requestBody = new JSONObject(Files.readAllBytes(Paths.get("src/test/resources/potato.json")));
        requestBody.put("name", "Tomato");
        requestBody.put("job", "Eat maket");
        Response updateTomato = given()
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .when()
                .put("/api/users/")
                .then()
                .statusCode(200)
                .extract().
                response();

        updateTomato.prettyPrint();
        param1 = new JSONObject(updateTomato.getBody().asString()).get("name").toString();
        param2 = new JSONObject(updateTomato.getBody().asString()).get("job").toString();
        Assert.assertEquals(requestBody.get("name"), param1);
        Assert.assertEquals(requestBody.get("job"), param2);

    }
}

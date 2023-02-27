package Api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class JsonTest {
    @Test
    public void createUser() {
        RestAssured.baseURI = "https://reqres.in/";

        JSONObject requestBody = new JSONObject()
                .put ("name", "morpheus")
                .put("job", "leader");
        Response createUs = given()
                .body(requestBody.toString())
                .when()
                .post("/api/users/")
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract().
                response();

        createUs.prettyPrint();

    }

    @Test
    public void getInfo() {
        RestAssured.baseURI = "https://reqres.in/";

        Response Info = given()
                .param("name", "first_name")
                .param("email", "email").
                when()
                .get("/api/users/2").
                then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract().
                response();

        Info.prettyPrint();
    }
}




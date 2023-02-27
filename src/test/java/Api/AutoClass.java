package Api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

// cookie: JSESSIONID=1413A97CFE4B81EA959B3BF4116AEEBA;
// atlassian.xsrf.token=B2UA-2NV2-5DBH-LD1W_9e9ad600372d4213a652251d4f514a3db8f0a879_lin
// Request URL: https://edujira.ifellow.ru/rest/webResources/1.0/resources
public class AutoClass {
    static String URL = "https://edujira.ifellow.ru/";

    public static void authorizationTest() {


        RestAssured.baseURI = URL;
        JSONObject requestBody = new JSONObject()
                .put("login", "mbaitova")
                .put("password", "Qwerty123");
        Response author = given()
                .body(requestBody.toString())
                .when()
                .post("/rest/webResources/1.0/resources/")
                .then()
                .statusCode(200)
                .contentType("application/json; charset=UTF-8")
                .extract()
                .response();

        author.prettyPrint();

    }


    }


package ApiSteps;

import WebHooks.Hooks;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization extends Hooks {

   @Step
    public static void Authorized() {

        Response auth = RestAssured.given()
                //.spec(help)
                .auth()
                .preemptive()
                .basic("mbaitova", "Qwerty123")
                .get("https://edujira.ifellow.ru/secure/Dashboard.jspa")
                .then()
                .log() .all()
                .statusCode(200)
                // .contentType("application/json; charset=UTF-8")
                .extract()
                .response();

    }
}

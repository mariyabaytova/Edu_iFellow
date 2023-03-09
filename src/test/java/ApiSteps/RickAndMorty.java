package ApiSteps;

import WebHooks.Hooks;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class RickAndMorty extends Hooks {

    public static String charId;
    public static int lastEpisode;
    public static int episode;
    public static int LastCharacter;
    public static int lastCharacterNumber;
    public static String locationMorti;
    public static String speciesMorti;

    public static String locationBlim;
    public static  String speciesBlim;

    static RequestSpecification help = new RequestSpecBuilder()
            .setBaseUri("https://rickandmortyapi.com/api")
            .build();
    @Step ("Получение персонажа")
    public static void getCharacter(String id) {

        Response getChar = given()
                .filter(new AllureRestAssured()).filter(new RequestLoggingFilter())
                .spec(help)
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        charId = new JSONObject(getChar.getBody().asString()).get("id").toString();
        locationMorti = new JSONObject(getChar.getBody().asString()).get("location").toString();
        speciesMorti = new JSONObject(getChar.getBody().asString()).get("species").toString();
        System.out.println(charId + "\nГде :\n" + locationMorti + "\nТип:\n" + speciesMorti);
    }
    @Step ("Получение эпизода")
    public static void getEpisode() {

        Response gettingEpisode = given()
                .filter(new AllureRestAssured()).filter(new RequestLoggingFilter())
                .spec(help)
                .when()
                .get("/character/" + charId)
                .then()
                .extract()
                .response();
        episode = (new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").length() - 1);
        lastEpisode = Integer.parseInt(new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println(lastEpisode);
    }
    @Step("Получение последнего персонажа")
    public static void lastChar() {

        Response gettingEpisode = given()
                .filter(new AllureRestAssured()).filter(new RequestLoggingFilter())
                .spec(help)
                .when()
                .get("/episode/" + lastEpisode)
                .then()
                .extract()
                .response();
        System.out.println(gettingEpisode.asString());
        LastCharacter = new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("characters").length()-1;
        lastCharacterNumber = Integer.parseInt(new JSONObject(gettingEpisode.getBody().asString())
                .getJSONArray("characters")
                .get(LastCharacter).toString().replaceAll("[^0-9]", ""));
        System.out.println(lastCharacterNumber);
    }
    @Step ("Получение результата")
    public static void local() {

        Response gettinglocal = given()
                .filter(new AllureRestAssured()).filter(new RequestLoggingFilter())
                .spec(help)
                .when()
                .get("/character/" + lastCharacterNumber)
                .then()
                .extract()
                .response();
        locationBlim = (new JSONObject(gettinglocal.getBody().asString()).get("location").toString());
        speciesBlim = (new JSONObject(gettinglocal.getBody().asString()).get("species").toString());
        System.out.println("\nГде:\n" + locationBlim + "\nТип\n" + speciesBlim);


    }
}


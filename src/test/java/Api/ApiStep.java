package Api;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;



public class ApiStep {

    public static String charId;
    public static int lastEpisode;
    public static int episode;
    public static String locationMorti;
    public static String speciesMorti;

    public static String locationBlim;
    public static  String speciesBlim;
    public static void getCharacter(String id) {
        Response getChar = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        charId = new JSONObject(getChar.getBody().asString()).get("id").toString();
        locationMorti = new JSONObject(getChar.getBody().asString()).get("location").toString();
        speciesMorti = new JSONObject(getChar.getBody().asString()).get("species").toString();
        System.out.println(charId + "\nГде Морти:\n" + locationMorti + "\nТип Морти:\n" + speciesMorti);
    }

    public static void getEpisode() {
        Response gettingEpisode = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + charId)
                .then()
                .extract()
                .response();
        episode = (new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").length() - 1);
        lastEpisode = Integer.parseInt(new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println(lastEpisode);
    }

    public static void lastChar() {
        Response gettingEpisode = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + episode)
                .then()
                .extract()
                .response();
        System.out.println(gettingEpisode.asString());
    }

    public static void local(String id) {
        Response gettinglocal = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .extract()
                .response();
        locationBlim = (new JSONObject(gettinglocal.getBody().asString()).get("location").toString());
        speciesBlim = (new JSONObject(gettinglocal.getBody().asString()).get("species").toString());
        //    int lastEpisode = Integer.parseInt(new JSONObject(gettingEpisode.getBody().asString()).getJSONArray("episode").get(episode).toString().replaceAll("[^0-9]", ""));
        System.out.println("\nГде Blim Blam:\n" + locationBlim + "\nТип Blim Blam\n" + speciesBlim);


    }
}

package ApiTests;

import ApiSteps.Authorization;
import ApiSteps.RickAndMorty;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class ApiTest {

    @Test
    @DisplayName("Получаем информацию от Рика и Морти")
    public void getCh() throws JSONException {
        RickAndMorty.getCharacter("2");
        RickAndMorty.getEpisode();
        RickAndMorty.lastChar();
        RickAndMorty.local();

        Assert.assertEquals(RickAndMorty.locationMorti, RickAndMorty.locationBlim);
        Assert.assertEquals(RickAndMorty.speciesMorti, RickAndMorty.speciesBlim);
    }

    @Test
    @DisplayName("JSON тест")
    public void Test() throws IOException, JSONException {
        ApiSteps.Potato.PotatoVSTomato();
    }

    @Test
    @DisplayName("Авторизация Jira")
    public void authorTest_1() throws IOException {
        Authorization.Authorized();
    }

}

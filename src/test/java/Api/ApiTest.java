package Api;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.codehaus.httpcache4j.uri.URIBuilder;

public class ApiTest {
    @Test
    public void getCh() {
        Api.ApiStep.getCharacter("2");
        Api.ApiStep.getEpisode();
        Api.ApiStep.lastChar();
        Api.ApiStep.local("50");

        Assert.assertEquals(Api.ApiStep.locationMorti, Api.ApiStep.locationBlim);
        Assert.assertEquals(Api.ApiStep.speciesMorti, Api.ApiStep.speciesBlim);
    }

    @Test
    public void Test() {
        Api.Potato.uriCreate();
        Api.Potato.PotatoVSTomato();
    }

    @Test
    public void authorTest() {
        Api.AutoClass.authorizationTest();
    }
}




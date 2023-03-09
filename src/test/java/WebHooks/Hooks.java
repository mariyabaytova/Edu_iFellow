package WebHooks;

import io.qameta.allure.restassured.AllureRestAssured;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class Hooks {
    @BeforeEach
    public void allures() {

        RestAssured.filters(new AllureRestAssured());


    }
}

package JiraStep;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Steps {
    @Step
    public static SelenideElement author (String text) {
        return $x("//input[text()='"+text+"']");
    }

}



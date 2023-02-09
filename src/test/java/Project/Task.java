package Project;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Task {
    public static void main(String[] args) {
        SelenideElement taskClick = $x("//a[@id=\"find_link\"]").as("Клик задачи");
        SelenideElement taskSearchClick = $x("//a[@id=\"issues_new_search_link_lnk\"]").as("Поиск задач");
        SelenideElement quantityTask = $x("//span[text()=\"1 из 8372\"]").as("Количество задач");
        String s = quantityTask.getText();

        Assert.assertEquals("8372", s);

    }
}
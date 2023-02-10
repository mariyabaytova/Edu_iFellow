package Project;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class TestProject {
    public static void main(String[] args) {
        SelenideElement projectsClick = $x("//a[@id=browse_link]").as("Клик проекты");
        SelenideElement testProjectsClick = $x("//a[@id=admin_main_proj_link_lnk]").as("Клик проект Тест");
        SelenideElement name = $x("//a[@id=project-name-val]").as("Имя проекта Тест");

        String s = name.getText();
        Assert.assertEquals("TEST", s);
    }
}
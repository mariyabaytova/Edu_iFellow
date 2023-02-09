package Project;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Bug {
    public static void main(String[] args) {
        SelenideElement Create = $x("//a[@class=\"aui-button aui-button-primary aui-style create-issue \"]").as("Создать");
        SelenideElement clickArrow = $x("//div[@class=\"aui-ss issuetype-ss aui-ss-select aui-ss-has-entity-icon\"]//span[@class=\"icon aui-ss-icon noloading drop-menu\"]").as("Клик стрелки");
        //нет пути к ошибке + проверить путь к стрелке
        SelenideElement subject = $x("//input[@class=\"text long-field\"]").as("Клик строки Тема");
        subject.sendKeys("TestSelenium");
        SelenideElement Text = $x("//button[@class=\"aui-button\" and @aria-pressed=\"true\"]").as("Клик Текст");
        SelenideElement description = $x("//SelenideElement description = $x(\"//button[@class=\\\"aui-button\\\" and @aria-pressed=\\\"true\\\"]\").as(\"Клик Описание\");").as("Клик Описание");
        description.sendKeys("Шаги: 1. Перейти к задача \"TestSelenium\" 2. Посмотреть привязанную версию");
        //выше строчка не тот путь
        SelenideElement ClickArrow = $x(" //span[@class=\"icon noloading drop-menu\"]/span").as("Клик развернуть доступные метки");
        SelenideElement ClickLabel = $x("//textarea[@class=\"text long-field\" and @id=\"labels-textarea\" ]").as("Клик метки");
        SelenideElement affectedVersion = $x("//select[@id=\"versions\"]//optgroup[@label=\"Невыпущенные версии\"]//option[@value=\"10001\"]").as("Затронутые версии Version2.0");
        SelenideElement environment = $x("//textarea[@class=\"textarea long-field wiki-textfield wiki-editor-initialised wiki-edit-wrapped\"]").as("Клик Окружение");
        environment.sendKeys("Windows, Intel(R) Core(TM) i5-8265U CPU @ 1.60GHz   1.80 GHz, ОС 16ГБ");
        //Selenide.switchTo()
        SelenideElement VersionCorrect = $x("//select[@id=\"fixVersions\"]//optgroup[@label=\"Невыпущенные версии\"]//option[@value=\"10001\"]").as("Исправить в версии Version2.0");
        SelenideElement InProzess = $x("//a[@id=\"action_id_21\"]//span[@class=\"trigger-label\"]").as("В работе");
        SelenideElement BusinessProz = $x("//a[@id=\"opsbar-transitions_more\"]//span[@class=\"dropdown-text\"]").as("Бизнесс процессы");
        SelenideElement Done  = $x(" //aui-item-link[@id=\"action_id_31\"]//a[@role=\"menuitem\"]").as("Выполнено");
        SelenideElement Dones  = $x("//span[text()=\"Готово\"]").as("Готово");

        String ss = Dones.getText();
        Assert.assertEquals("Готово", ss);


    }
}

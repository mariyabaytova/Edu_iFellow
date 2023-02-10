package Project;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class StatusAndVersion {
    public static void main(String[] args) {
        SelenideElement containsText = $x("//input[@class=search-entry text medium-field ajs-dirty-warning-exempt]").as("Содержит текст");
        containsText.sendKeys("TestSelenium");
        SelenideElement Search = $x("//button[@class=aui-button aui-button-primary search-button]").as("Поиск");
        SelenideElement Status = $x("//span[@class=//span[@id=status-val]//span[text()=Сделать]]").as("Статус задачи Сделать");
        SelenideElement Version = $x("//a[@title=Version 2.0 ]").as("Привязанная версия");

        String s = Version.getText();
        Assert.assertEquals("Version 2.0", s);

        String ss = Status.getText();
        Assert.assertEquals("Сделать", ss);



    }
}

package Autorization;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;
import org.junit.Assert;
import com.codeborne.selenide.conditions.Visible;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;
public class Autorization {
    public static void main(String[] args) {
        open("edujira.ifellow.ru");

        sleep(1000);
        SelenideElement loginInput = $x("//input[@id=login-form-username]").as("Ввод логина");
        loginInput.sendKeys("mbaitova");
        SelenideElement passwordInput = $x("//input[@id=login-form-password]").as("Ввод пароля");
        passwordInput.sendKeys("Qwerty123");
        SelenideElement rememberMe = $x("//label[@id=remembermelabel]").as("Запомнить меня");
        SelenideElement entranceButton = $x("//input[@value=Войти]").as("Войти");

        SelenideElement entrance = $x("//h1[text()=System Dashboard]").as("System Dashboard");
        String s = entrance.getText();

        Assert.assertEquals("System Dashboard", s);



    }
}

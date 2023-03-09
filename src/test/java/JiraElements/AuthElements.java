package JiraElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthElements {
    public static SelenideElement loginInput = $x("//input[@name='os_username']").as("Ввод логина");
    public static SelenideElement passwordInput = $x("//input[@name='os_password']").as("Ввод пароля");
    public static SelenideElement rememberMe = $x("//label[@id='remembermelabel']").as("Запомнить меня");
    public static  SelenideElement entranceButton = $x("//input[@value='Войти']").as("Войти");
    public static  SelenideElement entrance = $x("//div[@class='aui-page-header-main']//h1[text()='System Dashboard']").as("System Dashboard");
}


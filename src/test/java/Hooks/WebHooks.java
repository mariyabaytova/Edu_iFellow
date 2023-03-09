package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WebHooks {
   // private static SelenideDriver browser;
   // private static SelenideConfig browserConfig;
   // public WebDriver driver;
   private static SelenideDriver browser;
    private static SelenideConfig browserConfig;
    public WebDriver driver;




    @BeforeEach
    @Step
    public  void Open() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }
    @BeforeAll
    @Step
    public static void  allures(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).
                savePageSource(false)
        );
    }


    @AfterEach
    @Step
    public void close(){
        Selenide.closeWebDriver();
    }


}

package Hooks;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class WebHooks {
    private static SelenideDriver browser;
    private static SelenideConfig browserConfig;
    public WebDriver driver;
    @Before
    public  void Open() {
        Configuration.startMaximized = true;
        open("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }

   @After
   public void close(){
        closeWebDriver();
   }

    @AfterClass
    public static void End (){

    }

}

package Test;

import Hooks.WebHooks;
import com.codeborne.selenide.Condition;
//import org.junit.;
import org.junit.jupiter.api.DisplayName;

import java.time.Duration;

import static JiraElements.AuthElements.*;
import static JiraElements.BugElements.*;
import static JiraElements.TaskElements.*;
import static JiraElements.TestProjectElements.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Test extends WebHooks {


    @org.junit.jupiter.api.Test
    @DisplayName("Проходит авторизация")
    public void AuthorizationTest() {

        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.setValue("mbaitova");
        // loginInput.sendKeys("mbaitova");
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue("Qwerty123");
        rememberMe.click();
        entranceButton.click();

      //  String s = entrance.getText();
     //   Assert.assertEquals("System Dashboard", s);
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Выбор проекта")
    public void ProjectTest() {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.sendKeys("mbaitova");
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue("Qwerty123");
        rememberMe.click();
        entranceButton.click();
        sleep(3000);
        projectsClick.click();
        testProjectsClick.click();
        name.click();

        // String s = name.getText();
        // Assert.assertEquals(name.getText(), s);

        taskClick.click();
        searchClick.click();

       // String ss = quantityTask.getText();
      //  Assert.assertEquals(quantityTask.getText(), ss);
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Проверка версии")
    public void TaskTest() {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.sendKeys("mbaitova");
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue("Qwerty123");
        rememberMe.click();
        entranceButton.click();

        containsText.click();
        containsText.sendKeys("TestSelenium");
        search1.click();

      //  String v = version1.getText();
      //  Assert.assertEquals("Version 2.0", v);

      //  String sss = status1.getText();
      //  Assert.assertEquals("В РАБОТЕ", sss);
    }


    @org.junit.jupiter.api.Test
    @DisplayName("Создание задачи")
    public void BugTest () {
        loginInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        loginInput.sendKeys("mbaitova");
        passwordInput.shouldBe(Condition.visible, Duration.ofSeconds(20));
        passwordInput.setValue("Qwerty123");
        rememberMe.click();
        entranceButton.click();

        projectsClick.click();
        testProjectsClick.click();
        name.click();

        Create.click();
        subject.click();
        subject.sendKeys("TestSelenium");
        description.click();
        description.sendKeys("Шаги: 1. Перейти к задача TestSelenium 2. Посмотреть привязанную версию");
        VersionCorrect.click();
        ClickArrow.click();
        ClickArrow.sendKeys("Метка");
        createBug.click();
        taskClick.click();
        searchClick.click();
        MyTasks.click();
        Num.click();
        BusinessProz.click();
        sleep(6000);
        Done.click();


      //  String d = Dones.getText();
      //  Assert.assertEquals("ГОТОВО", d);


        //environment.click();
        //  environment.sendKeys("Windows, Intel(R) Core(TM) i5-8265U CPU @ 1.60GHz   1.80 GHz, ОС 16ГБ");

    }
}

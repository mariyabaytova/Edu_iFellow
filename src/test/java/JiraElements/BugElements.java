package JiraElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BugElements {
    public static SelenideElement Create = $x("//a[@id='create_link']").as("Создать");
    public static SelenideElement subject = $x("//input[@id='summary']").as("Клик строки Тема");
    public static SelenideElement description = $x("//textarea[@id='description']").as("Клик Описание");
    public static SelenideElement ClickArrow = $x("//textarea[@id='labels-textarea']").as("Клик  метки");
    public static SelenideElement affectedVersion = $x("//select[@id=versions]//optgroup[@label=Невыпущенные версии]//option[@value=10001]").as("Затронутые версии Version2.0");
    public static SelenideElement environment = $x("//textarea[@name='environment']").as("Клик Окружение");
    public static SelenideElement VersionCorrect = $x("//select[@id='fixVersions']//optgroup[@label='Невыпущенные версии']//option[@value=10001]").as("Исправить в версии Version2.0");
    public static SelenideElement MyTasks = $x(" //a[@title='Сообщенные мной']").as("Исправить в версии Version2.0");
    public static SelenideElement Num = $x("//span[text()='TEST-26373']").as("Исправить в версии Version2.0");
    public static SelenideElement createBug = $x("//input[@value='Создать' and @title='Нажмите Alt + S, чтобы отправить эту форму']").as("Клик Окружение");
    public static SelenideElement InProzess = $x("//a[@id=action_id_21]//span[@class=trigger-label]").as("В работе");
    public static    SelenideElement BusinessProz = $x("//a[@id='opsbar-transitions_more']//span[@class='dropdown-text']").as("Бизнесс процессы");
    public static  SelenideElement Done  = $x(" //aui-item-link[@id='action_id_31']//a[@role='menuitem']").as("Выполнено");
    public static  SelenideElement Dones  = $x("//span[text()='Готово']").as("Готово");
}

package JiraElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskElements {
    public static SelenideElement containsText = $x("//input[@id=\"quickSearchInput\"]").as("Поиск");
    public static SelenideElement search1 = $x("//span[@aria-tooltip=\"TestSelenium\"]").as("TestSelenium");
    public static  SelenideElement status1 = $x("//span[@class=' jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-yellow jira-issue-status-lozenge-indeterminate jira-issue-status-lozenge-max-width-medium']").as("Статус задачи Сделать");
    public static  SelenideElement version1 = $x("//a[@title='Version 2.0 ']").as("Привязанная версия");
}

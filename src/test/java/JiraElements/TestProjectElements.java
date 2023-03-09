package JiraElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestProjectElements {
    public static SelenideElement projectsClick = $x("//a[@title='Просмотр недавних проектов или списка всех проектов']").as("Клик проекты");
    public static SelenideElement testProjectsClick = $x("//a[@id='admin_main_proj_link_lnk']").as("Клик проект Тест");
    public static SelenideElement name = $x("//a[@id='project-name-val']").as("Имя проекта Тест");
    public static SelenideElement taskClick = $x("//a[@id='find_link']").as("Клик задачи");
    public static SelenideElement searchClick = $x("//a[text()='Поиск задач']").as("Поиск задач");
    public static SelenideElement quantityTask = $x("//span[contains(text(),'1 из')]").as("Количество задач");
}

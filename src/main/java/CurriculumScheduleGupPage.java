// График учебного процесса
//  /ru/tko/control/curriculum-schedule

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CurriculumScheduleGupPage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Учебный план')]"));

    // Табы на странице
    private SelenideElement curriculumPlanTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Учебный план')]/.."));    // 'Учебный план'
    private SelenideElement annualCurriculumTab = $(byXpath("//a/span[contains(text(),'ГУП')]/.."));                                                         // 'ГУП'

    // Список Начало обучения (год)
    private SelenideElement selectYearAriaDropdown = $(byXpath("//span[@aria-labelledby='select2-year-0y-container']"));

    // Получение списока Начало обучения (год)
    private ElementsCollection selectAnnualCurriculumFromList = $$(byXpath("//ul[@id='select2-year-0y-results']/li"));


    // Или

    // 2019
    private SelenideElement select2019Year = $(byXpath("//ul[@id='select2-year-0y-results']/li[2]"));

    // 2020
    private SelenideElement select2020Year = $(byXpath("//ul[@id='select2-year-0y-results']/li[3]"));

    // Кнопка "Помиотреть"
    private SelenideElement viewButton = $(byXpath("//button[contains(text(),'Посмотреть')]"));      // 'Посмотреть'




}

// Статистика
//  /ru/tko/statistics

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class StatisticsPage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Статистика')]"));

    // Таблицы
    private SelenideElement applicationsByCollegeTitle = $(byXpath("//div[contains(text(),'Заявки в разбивке по колледжам')]"));
    private SelenideElement applicationsByTypeOfServiceTitle = $(byXpath("//div[contains(text(),'Заявки по виду услуг')]"));
    private SelenideElement numberOfStaffByCollegeTitle = $(byXpath("//div[contains(text(),'Количество персонала в разрезе по колледжам')]"));
    private SelenideElement numberOfStudentsByCollegeTitle = $(byXpath("//div[contains(text(),'Количество студентов в разрезе по колледжам')]"));
    private SelenideElement ageAndGenderOfTheContingentTitle = $(byXpath("//div[4]//div[contains(text(),'Возраст и пол контингента')]"));
    private SelenideElement ageAndGenderOfTheStudentsTitle = $(byXpath("//div[contains(text(),'Возраст и пол контингента студентов')]"));

}

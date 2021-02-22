package pages;// Статистика
//  /ru/tko/statistics

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatisticsPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Статистика')]");

    // Таблицы
    private SelenideElement applicationsByCollegeTitle = $x("//div[contains(text(),'Заявки в разбивке по колледжам')]");
    private SelenideElement applicationsByTypeOfServiceTitle = $x("//div[contains(text(),'Заявки по виду услуг')]");
    private SelenideElement numberOfStaffByCollegeTitle = $x("//div[contains(text(),'Количество персонала в разрезе по колледжам')]");
    private SelenideElement numberOfStudentsByCollegeTitle = $x("//div[contains(text(),'Количество студентов в разрезе по колледжам')]");
    private SelenideElement ageAndGenderOfTheContingentTitle = $x("//div[4]//div[contains(text(),'Возраст и пол контингента')]");
    private SelenideElement ageAndGenderOfTheStudentsTitle = $x("//div[contains(text(),'Возраст и пол контингента студентов')]");

}

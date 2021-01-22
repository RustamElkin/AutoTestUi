//Колледжи
//  /ru/tko/colleges

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CollegesPage {

    private SelenideElement titleToPage = $(byXpath("//div[@class=\"s-title-head\"][contains(text(),'Колледжи')]"));

    private SelenideElement applyFilterBtn = $(byXpath("//div[contains(text(),'Применить фильтр')]/../.."));
    private SelenideElement resetFilterBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));

    private SelenideElement collegesSearchBtn = $(byXpath("//*[@id=\"v-catalog-list-view-app\"]//div[2]/button"));
    private SelenideElement SearchByOrganizationNameInput = $(byXpath("//input[@placeholder=\"Поиск по названию организации\"]"));

    private SelenideElement selectCollegeAfterFilter = $(byXpath("//*[@id=\"v-catalog-list-view-app\"]//div[2]/a[1]"));

    // Multiselect input, мультиселект инпуты, фильтр
    private SelenideElement selectAreaInput = $(byXpath("//div[contains(text(),'Выберите область')]/..//div[@class=\"sn-field__inner\"]"));
    private SelenideElement selectDistrictInput = $(byXpath("//div[contains(text(),'Выберите район: ')]/..//div[@class=\"sn-field__inner\"]"));

    // CheckBox
    private SelenideElement languageOfEducationRussianCheckBox = $(byXpath("//div[contains(text(),'Русский')]/preceding-sibling::div"));
    private SelenideElement languageOfEducationKazakhCheckBox = $(byXpath("//div[contains(text(),'Казахский')]/preceding-sibling::div"));
    private SelenideElement languageOfEducationEnglishCheckBox = $(byXpath("//div[contains(text(),'Английский')]/preceding-sibling::div"));
    private SelenideElement languageOfEducationUzbekCheckBox = $(byXpath("//div[contains(text(),'Узбекский')]/preceding-sibling::div"));

    private SelenideElement organizationTypeCollegeCheckBox = $(byXpath("//div[contains(text(),'колледж')]/preceding-sibling::div/input[1]"));
    private SelenideElement SpecializedSchoolCheckBox = $(byXpath("//div[contains(text(),'училище')]/preceding-sibling::div/input"));
    private SelenideElement VocationalTrainingCenterCheckBox = $(byXpath("//div[contains(text(),'учебный центр профессиональной подготовки')]/preceding-sibling::div/input[1]"));
    private SelenideElement collegeForSpecialEducationalNeedsCheckBox = $(byXpath("//div[contains(text(),'колледж для детей с особыми образовательными потребностями')]/preceding-sibling::div/input"));
    private SelenideElement correctionalVocationalTrainingCenterCheckBox = $(byXpath("//div[contains(text(),'учебный центр профессиональной подготовки при исправительном учреждении')]/preceding-sibling::div/input"));
    private SelenideElement correctionalCollegeCheckBox = $(byXpath("//div[contains(text(),'колледж при исправительном учреждении')]/preceding-sibling::div/input"));
    private SelenideElement militaryTechnicalCollegeCheckBox = $(byXpath("//div[contains(text(),'военно-технический колледж')]/preceding-sibling::div/input"));
    private SelenideElement highCollegeCheckBox = $(byXpath("//div[contains(text(),'высший колледж')]/preceding-sibling::div/input"));

    private SelenideElement seatAvailabilityCheckBox = $(byXpath("//div[contains(text(),'Показать только с открытыми приемными комиссиями')]/preceding-sibling::div/input"));

}

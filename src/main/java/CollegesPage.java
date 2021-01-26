//Колледжи
//  /ru/tko/colleges

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CollegesPage {

    private SelenideElement titleToPage = $x("//div[@class=\"s-title-head\"][contains(text(),'Колледжи')]");

    private SelenideElement applyFilterBtn = $x("//div[contains(text(),'Применить фильтр')]/../..");
    private SelenideElement resetFilterBtn = $x("//span[contains(text(),'Сбросить')]/..");

    private SelenideElement collegesSearchBtn = $x("//*[@id=\"v-catalog-list-view-app\"]//div[2]/button");
    private SelenideElement searchByOrganizationNameInput = $x("//input[@placeholder=\"Поиск по названию организации\"]");

    private SelenideElement selectCollegeAfterFilter = $x("//*[@id=\"v-catalog-list-view-app\"]//div[2]/a[1]");

    // Multiselect input, мультиселект инпуты, фильтр
    private SelenideElement selectAreaInput = $x("//div[contains(text(),'Выберите область')]/..//div[@class=\"sn-field__inner\"]");
    private SelenideElement selectDistrictInput = $x("//div[contains(text(),'Выберите район: ')]/..//div[@class=\"sn-field__inner\"]");

    // CheckBox
    private SelenideElement languageOfEducationRussianCheckBox = $x("//div[contains(text(),'Русский')]/preceding-sibling::div");
    private SelenideElement languageOfEducationKazakhCheckBox = $x("//div[contains(text(),'Казахский')]/preceding-sibling::div");
    private SelenideElement languageOfEducationEnglishCheckBox = $x("//div[contains(text(),'Английский')]/preceding-sibling::div");
    private SelenideElement languageOfEducationUzbekCheckBox = $x("//div[contains(text(),'Узбекский')]/preceding-sibling::div");

    private SelenideElement organizationTypeCollegeCheckBox = $x("//div[contains(text(),'колледж')]/preceding-sibling::div/input[1]");
    private SelenideElement specializedSchoolCheckBox = $x("//div[contains(text(),'училище')]/preceding-sibling::div/input");
    private SelenideElement vocationalTrainingCenterCheckBox = $x("//div[contains(text(),'учебный центр профессиональной подготовки')]/preceding-sibling::div/input[1]");
    private SelenideElement collegeForSpecialEducationalNeedsCheckBox = $x("//div[contains(text(),'колледж для детей с особыми образовательными потребностями')]/preceding-sibling::div/input");
    private SelenideElement correctionalVocationalTrainingCenterCheckBox = $x("//div[contains(text(),'учебный центр профессиональной подготовки при исправительном учреждении')]/preceding-sibling::div/input");
    private SelenideElement correctionalCollegeCheckBox = $x("//div[contains(text(),'колледж при исправительном учреждении')]/preceding-sibling::div/input");
    private SelenideElement militaryTechnicalCollegeCheckBox = $x("//div[contains(text(),'военно-технический колледж')]/preceding-sibling::div/input");
    private SelenideElement highCollegeCheckBox = $x("//div[contains(text(),'высший колледж')]/preceding-sibling::div/input");

    private SelenideElement seatAvailabilityCheckBox = $x("//div[contains(text(),'Показать только с открытыми приемными комиссиями')]/preceding-sibling::div/input");

}

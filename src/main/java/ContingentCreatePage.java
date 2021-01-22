// Добавление в контингент
//  /ru/tko/control/contingent/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContingentCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));


    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Полный список')]/.."));                    // 'Полный список'
    private SelenideElement groupsTab = $(byXpath("//span[contains(text(),'Группы')]/.."));                             // 'Группы'
    private SelenideElement subgroupsTab = $(byXpath("//span[contains(text(),'Подгруппы')]/.."));                       // 'Подгруппы'
    private SelenideElement cathedraTab = $(byXpath("//span[contains(text(),'Кафедры')]/.."));                          // 'Кафедры'
    private SelenideElement archiveTab = $(byXpath("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/.."));   //'Архив'

    private SelenideElement IINInput = $(byXpath("//label[contains(text(),'ИИН: ')]/following-sibling::input"));       // Инпут ИИН


    // Кнопка Проверить
    private SelenideElement verifyBtn = $(byXpath("//button[contains(text(),'Проверить')]"));


    // Dropdown's elements
    private SelenideElement citizenshipDropdown = $(byXpath("//label[contains(text(),'Гражданство: ')]/following-sibling::div/div[@class=\"multiselect__tags\"]"));
    private SelenideElement nationalityDropdown = $(byXpath("//label[contains(text(),'Национальность: ')]/following-sibling::div/div[@class=\"multiselect__tags\"]"));
    private SelenideElement informationOnMigrationStatusDropdown = $(byXpath("//label[contains(text(),'Сведения о миграционном статусе: ')]/following-sibling::div/div[@class=\"multiselect__tags\"]"));
    private SelenideElement regionDropdown = $(byXpath("//label[contains(text(),'Область: ')]/following-sibling::div[1]"));
    private SelenideElement typeOfResidenceDropdown = $(byXpath("//label[contains(text(),'Тип местности проживания: ')]/following-sibling::div[1]"));
    private SelenideElement acceptedGraduatedFromDropdown = $(byXpath("//label[contains(text(),'Из числа принятых, окончил: ')]/following-sibling::div[1]"));
    private SelenideElement cathedraDropdown = $(byXpath("//label[contains(text(),'Кафедры: ')]/following-sibling::div[1]"));
    private SelenideElement specialtyAndClassifierMainDropdown = $(byXpath("//label[contains(text(),'Специальность и классификатор (основной): ')]/following-sibling::div[1]"));
    private SelenideElement placementDropdown = $(byXpath("//label[contains(text(),'Трудоустройство: ')]/following-sibling::div[1]"));
    private SelenideElement educationAtTheExpenseOfDropdown = $(byXpath("//label[contains(text(),'Обучение за счет средств: ')]/following-sibling::div[1]"));
    private SelenideElement arrivedDropdown = $(byXpath("//label[contains(text(),'Прибыл(-а): ')]/following-sibling::div[1]"));
    private SelenideElement educationPeriodDropdown = $(byXpath("//label[contains(text(),'Срок обучения: ')]/following-sibling::div[1]"));
    private SelenideElement leftForASecondCourseDropdown = $(byXpath("//label[contains(text(),'Оставлен на повторный курс: ')]/following-sibling::div[1]"));
    private SelenideElement onAcademicLeaveDropdown = $(byXpath("//label[contains(text(),'Находится в академическом отпуске: ')]/following-sibling::div[1]"));


    // error-message
    private SelenideElement citizenshipErrorMessage  = $(byXpath("//div[contains(text(),'Поле \"Гражданство\" обязательно для заполнения.')]"));
    private SelenideElement nationalityErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Национальность\" обязательно для заполнения.')]"));
    private SelenideElement informationOnMigrationStatusErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Сведения о миграционном статусе\" обязательно')]"));
    private SelenideElement contactNumberErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Контактный телефон\" обязательно для заполнен')]"));
    private SelenideElement regionErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Область\" обязательно для заполнения.')]"));
    private SelenideElement typeOfResidenceErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Тип местности проживания\" обязательно для за')]"));
    private SelenideElement acceptedGraduatedErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Из числа принятых, окончил\" обязательно для ')]"));
    private SelenideElement cathedraErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Кафедра\" обязательно для заполнения.')]"));
    private SelenideElement specialtyAndClassifierMainErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Специальность и классификатор (основной)\" об')]"));
    private SelenideElement placementErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Трудоустройство\" обязательно для заполнения.')]"));
    private SelenideElement educationAtTheExpenseOfErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Обучение за счет средств\" обязательно для за')]"));
    private SelenideElement arrivalAndEnrollmentDateErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Дата прибытия/зачисления\" обязательно для за')]"));
    private SelenideElement arrivalOrderNumberErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Номер приказа прибытия\" обязательно для запо')]"));
    private SelenideElement arrivedErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Прибыл(-а)\" обязательно для заполнения.')]"));
    private SelenideElement educationPeriodErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Срок обучения\" обязательно для заполнения.')]"));
    private SelenideElement leftForASecondCourseErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Оставлен на повторный курс\" обязательно для ')]"));
    private SelenideElement onAcademicLeaveErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Находится в академическом отпуске\" обязатель')]"));


    // Input's elements
    private SelenideElement contactNumberInput = $(byXpath("//label[contains(text(),'Контактный телефон: ')]/following-sibling::input"));
    private SelenideElement arrivalAndEnrollmentDateInput = $(byXpath("//label[contains(text(),'Дата прибытия/зачисления: ')]/following-sibling::input"));
    private SelenideElement arrivalOrderNumberInput = $(byXpath("//label[contains(text(),'Номер приказа прибытия: ')]/following-sibling::input"));


    // Btn
    private SelenideElement cancelBtn = $(byXpath("//span[contains(text(),'Отмена')]/.."));
    private SelenideElement submitBtn = $(byXpath("//span[contains(text(),'Сохранить')]/.."));

}

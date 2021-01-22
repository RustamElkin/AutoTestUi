// Контингент_редактирование
//  /ru/tko/control/contingent/edit/8072

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContingentEditPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]"));


    // Табы на странице
    private SelenideElement backToTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                              // Таб "Назад"


    // Dropdown's elements
    private SelenideElement typeOfResidenceDropdown = $(byXpath("//label[contains(text(),'Тип местности проживания: ')]/following-sibling::div[1]"));
    private SelenideElement cathedraDropdown = $(byXpath("//label[contains(text(),'Кафедры: ')]/following-sibling::div[1]"));
    private SelenideElement specialtyAndClassifierMainDropdown = $(byXpath("//label[contains(text(),'Специальность и классификатор (основной): ')]/following-sibling::div[1]"));
    private SelenideElement placementDropdown = $(byXpath("//label[contains(text(),'Трудоустройство: ')]/following-sibling::div[1]"));
    private SelenideElement educationAtTheExpenseOfDropdown = $(byXpath("//label[contains(text(),'Обучение за счет средств: ')]/following-sibling::div[1]"));
    private SelenideElement arrivedDropdown = $(byXpath("//label[contains(text(),'Прибыл(-а): ')]/following-sibling::div[1]"));
    private SelenideElement educationPeriodDropdown = $(byXpath("//label[contains(text(),'Срок обучения: ')]/following-sibling::div[1]"));
    private SelenideElement leftForASecondCourseDropdown = $(byXpath("//label[contains(text(),'Оставлен на повторный курс: ')]/following-sibling::div[1]"));
    private SelenideElement onAcademicLeaveDropdown = $(byXpath("//label[contains(text(),'Находится в академическом отпуске: ')]/following-sibling::div[1]"));
    private SelenideElement moreAboutEducationDropdown = $(byXpath("//label[contains(text(),'Дополнительно об обучении: ')]/following-sibling::div[1]"));


    // Input's elements
    private SelenideElement arrivalAndEnrollmentDateInput = $(byXpath("//label[contains(text(),'Дата прибытия/зачисления: ')]/following-sibling::input"));

    // error-message
    private SelenideElement typeOfResidenceErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Тип местности проживания\" обязательно для за')]"));
    private SelenideElement cathedraErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Кафедра\" обязательно для заполнения.')]"));
    private SelenideElement specialtyAndClassifierMainErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Специальность и классификатор (основной)\" об')]"));
    private SelenideElement placementErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Трудоустройство\" обязательно для заполнения.')]"));
    private SelenideElement educationAtTheExpenseOfErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Обучение за счет средств\" обязательно для за')]"));
    private SelenideElement arrivalAndEnrollmentDateErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Дата прибытия/зачисления\" обязательно для за')]"));
    private SelenideElement arrivedErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Прибыл(-а)\" обязательно для заполнения.')]"));
    private SelenideElement educationPeriodErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Срок обучения\" обязательно для заполнения.')]"));
    private SelenideElement leftForASecondCourseErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Оставлен на повторный курс\" обязательно для ')]"));
    private SelenideElement onAcademicLeaveErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Находится в академическом отпуске\" обязатель')]"));
    private SelenideElement moreAboutEducationErrorMessage = $(byXpath("//div[contains(text(),'Поле \"Дополнительно об обучении\" обязательно для з')]"));

    // Btn
    private SelenideElement cancelBtn = $(byXpath("//span[contains(text(),'Отмена')]/.."));
    private SelenideElement submitBtn = $(byXpath("//span[contains(text(),'Сохранить')]/.."));


}

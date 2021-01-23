// Контингент_редактирование
//  /ru/tko/control/contingent/edit/8072

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ContingentEditPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class=\"s-title-head\"][contains(text(),'Контингент')]");


    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                              // Таб "Назад"


    // Dropdown's elements
    private SelenideElement typeOfResidenceDropdown = $x("//label[contains(text(),'Тип местности проживания: ')]/following-sibling::div[1]");
    private SelenideElement cathedraDropdown = $x("//label[contains(text(),'Кафедры: ')]/following-sibling::div[1]");
    private SelenideElement specialtyAndClassifierMainDropdown = $x("//label[contains(text(),'Специальность и классификатор (основной): ')]/following-sibling::div[1]");
    private SelenideElement placementDropdown = $x("//label[contains(text(),'Трудоустройство: ')]/following-sibling::div[1]");
    private SelenideElement educationAtTheExpenseOfDropdown = $x("//label[contains(text(),'Обучение за счет средств: ')]/following-sibling::div[1]");
    private SelenideElement arrivedDropdown = $x("//label[contains(text(),'Прибыл(-а): ')]/following-sibling::div[1]");
    private SelenideElement educationPeriodDropdown = $x("//label[contains(text(),'Срок обучения: ')]/following-sibling::div[1]");
    private SelenideElement leftForASecondCourseDropdown = $x("//label[contains(text(),'Оставлен на повторный курс: ')]/following-sibling::div[1]");
    private SelenideElement onAcademicLeaveDropdown = $x("//label[contains(text(),'Находится в академическом отпуске: ')]/following-sibling::div[1]");
    private SelenideElement moreAboutEducationDropdown = $x("//label[contains(text(),'Дополнительно об обучении: ')]/following-sibling::div[1]");


    // Input's elements
    private SelenideElement arrivalAndEnrollmentDateInput = $x("//label[contains(text(),'Дата прибытия/зачисления: ')]/following-sibling::input");

    // error-message
    private SelenideElement typeOfResidenceErrorMessage = $x("//div[contains(text(),'Поле \"Тип местности проживания\" обязательно для за')]");
    private SelenideElement cathedraErrorMessage = $x("//div[contains(text(),'Поле \"Кафедра\" обязательно для заполнения.')]");
    private SelenideElement specialtyAndClassifierMainErrorMessage = $x("//div[contains(text(),'Поле \"Специальность и классификатор (основной)\" об')]");
    private SelenideElement placementErrorMessage = $x("//div[contains(text(),'Поле \"Трудоустройство\" обязательно для заполнения.')]");
    private SelenideElement educationAtTheExpenseOfErrorMessage = $x("//div[contains(text(),'Поле \"Обучение за счет средств\" обязательно для за')]");
    private SelenideElement arrivalAndEnrollmentDateErrorMessage = $x("//div[contains(text(),'Поле \"Дата прибытия/зачисления\" обязательно для за')]");
    private SelenideElement arrivedErrorMessage = $x("//div[contains(text(),'Поле \"Прибыл(-а)\" обязательно для заполнения.')]");
    private SelenideElement educationPeriodErrorMessage = $x("//div[contains(text(),'Поле \"Срок обучения\" обязательно для заполнения.')]");
    private SelenideElement leftForASecondCourseErrorMessage = $x("//div[contains(text(),'Поле \"Оставлен на повторный курс\" обязательно для ')]");
    private SelenideElement onAcademicLeaveErrorMessage = $x("//div[contains(text(),'Поле \"Находится в академическом отпуске\" обязатель')]");
    private SelenideElement moreAboutEducationErrorMessage = $x("//div[contains(text(),'Поле \"Дополнительно об обучении\" обязательно для з')]");

    // Btn
    private SelenideElement cancelBtn = $x("//span[contains(text(),'Отмена')]/..");
    private SelenideElement submitBtn = $x("//span[contains(text(),'Сохранить')]/..");


}

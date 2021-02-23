package pages;// Добавление в контингент
//  /ru/tko/control/contingent/create

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ContingentCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[@class='s-title-head'][contains(text(),'Контингент')]");


    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

    private SelenideElement iinInput = $x("//label[contains(text(),'ИИН: ')]/following-sibling::input");                                    // 'Инпут ИИН'


    // Кнопка Проверить
    private SelenideElement verifyBtn = $x("//button[contains(text(),'Проверить')]");


    // Dropdown's elements
    private SelenideElement citizenshipDropdown = $x("//label[contains(text(),'Гражданство')]/following-sibling::div/div[@class=\"multiselect__tags\"]");
    private SelenideElement nationalityDropdown = $x("//label[contains(text(),'Национальность')]/following-sibling::div/div[@class=\"multiselect__tags\"]");
    private SelenideElement informationOnMigrationStatusDropdown = $x("//label[contains(text(),'Сведения о миграционном статусе')]/following-sibling::div/div[@class=\"multiselect__tags\"]");
    private SelenideElement regionDropdown = $x("//label[contains(text(),'Область: ')]/following-sibling::div[1]");
    private SelenideElement typeOfResidenceDropdown = $x("//label[contains(text(),'Тип местности проживания')]/following-sibling::div[1]");
    private SelenideElement acceptedGraduatedFromDropdown = $x("//label[contains(text(),'Из числа принятых, окончил')]/following-sibling::div[1]");
    private SelenideElement cathedraDropdown = $x("//label[contains(text(),'Кафедры: ')]/following-sibling::div[1]");
    private SelenideElement specialtyAndClassifierMainDropdown = $x("//label[contains(text(),'Специальность и классификатор (основной)')]/following-sibling::div[1]");
    private SelenideElement placementDropdown = $x("//label[contains(text(),'Трудоустройство: ')]/following-sibling::div[1]");
    private SelenideElement educationAtTheExpenseOfDropdown = $x("//label[contains(text(),'Обучение за счет средств')]/following-sibling::div[1]");
    private SelenideElement arrivedDropdown = $x("//label[contains(text(),'Прибыл(-а): ')]/following-sibling::div[1]");
    private SelenideElement educationPeriodDropdown = $x("//label[contains(text(),'Срок обучения')]/following-sibling::div[1]");
    private SelenideElement leftForASecondCourseDropdown = $x("//label[contains(text(),'Оставлен на повторный курс')]/following-sibling::div[1]");
    private SelenideElement onAcademicLeaveDropdown = $x("//label[contains(text(),'Находится в академическом отпуске')]/following-sibling::div[1]");


    // error-message
    private SelenideElement citizenshipErrorMessage  = $x("//div[contains(text(),'Поле \"Гражданство\" обязательно для заполнения')]");
    private SelenideElement nationalityErrorMessage = $x("//div[contains(text(),'Поле \"Национальность\" обязательно для заполнения')]");
    private SelenideElement informationOnMigrationStatusErrorMessage = $x("//div[contains(text(),'Поле \"Сведения о миграционном статусе\" обязательно')]");
    private SelenideElement contactNumberErrorMessage = $x("//div[contains(text(),'Поле \"Контактный телефон\" обязательно для заполнен')]");
    private SelenideElement regionErrorMessage = $x("//div[contains(text(),'Поле \"Область\" обязательно для заполнения')]");
    private SelenideElement typeOfResidenceErrorMessage = $x("//div[contains(text(),'Поле \"Тип местности проживания\" обязательно для за')]");
    private SelenideElement acceptedGraduatedErrorMessage = $x("//div[contains(text(),'Поле \"Из числа принятых, окончил\" обязательно для')]");
    private SelenideElement cathedraErrorMessage = $x("//div[contains(text(),'Поле \"Кафедра\" обязательно для заполнения')]");
    private SelenideElement specialtyAndClassifierMainErrorMessage = $x("//div[contains(text(),'Поле \"Специальность и классификатор (основной)\" об')]");
    private SelenideElement placementErrorMessage = $x("//div[contains(text(),'Поле \"Трудоустройство\" обязательно для заполнения')]");
    private SelenideElement educationAtTheExpenseOfErrorMessage = $x("//div[contains(text(),'Поле \"Обучение за счет средств\" обязательно для за')]");
    private SelenideElement arrivalAndEnrollmentDateErrorMessage = $x("//div[contains(text(),'Поле \"Дата прибытия/зачисления\" обязательно для за')]");
    private SelenideElement arrivalOrderNumberErrorMessage = $x("//div[contains(text(),'Поле \"Номер приказа прибытия\" обязательно для запо')]");
    private SelenideElement arrivedErrorMessage = $x("//div[contains(text(),'Поле \"Прибыл(-а)\" обязательно для заполнения')]");
    private SelenideElement educationPeriodErrorMessage = $x("//div[contains(text(),'Поле \"Срок обучения\" обязательно для заполнения')]");
    private SelenideElement leftForASecondCourseErrorMessage = $x("//div[contains(text(),'Поле \"Оставлен на повторный курс\" обязательно для')]");
    private SelenideElement onAcademicLeaveErrorMessage = $x("//div[contains(text(),'Поле \"Находится в академическом отпуске\" обязатель')]");


    // Input's elements
    private SelenideElement contactNumberInput = $x("//label[contains(text(),'Контактный телефон')]/following-sibling::input");
    private SelenideElement arrivalAndEnrollmentDateInput = $x("//label[contains(text(),'Дата прибытия/зачисления')]/following-sibling::input");
    private SelenideElement arrivalOrderNumberInput = $x("//label[contains(text(),'Номер приказа прибытия')]/following-sibling::input");


    // Btn
    private SelenideElement cancelBtn = $x("//span[contains(text(),'Отмена')]/..");
    private SelenideElement submitBtn = $x("//span[contains(text(),'Сохранить')]/..");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public ContingentCreatePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Контингент"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

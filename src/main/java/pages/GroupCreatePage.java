package pages;// Создание групп
//  /ru/tko/control/group/create


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GroupCreatePage {

    // Тайтл
    private SelenideElement titleToPage                     = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab                     = $x("//span[contains(text(),'Полный список')]/..");                                                  // 'Полный список'
    private SelenideElement groupsTab                       = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab                    = $x("//span[contains(text(),'Подгруппы')]/..");                                                      // 'Подгруппы'
    private SelenideElement cathedraTab                     = $x("//span[contains(text(),'Кафедры')]/..");                                                        // 'Кафедры'
    private SelenideElement archiveTab                      = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");      // 'Архив'

    // Инпуты
    private SelenideElement nameInput                       = $x("//label[contains(text(),'Название')]/following-sibling::input");                                // 'Название'
    private SelenideElement cathedraInput                   = $x("//label[contains(text(),'Кафедра')]/following-sibling::div//input");                            // 'Кафедра'
    private SelenideElement qualificationInput              = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");                       // 'Квалификация'
    private SelenideElement curatorInput                    = $x("//label[contains(text(),'Куратор')]/following-sibling::div//input");                            // 'Куратор'
    private SelenideElement industrialTrainingMasterInput   = $x("//label[contains(text(),'Мастер производственного обучения')]/following-sibling::div//input");  // 'Мастер производственного обучения'
    private SelenideElement languageEducationInput          = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div//input");                      // 'Язык обучения'
    private SelenideElement formOfStudyInput                = $x("//label[contains(text(),'Форма обучения')]/following-sibling::div//input");                     // 'Форма обучения'
    private SelenideElement normativeEducationPeriodInput   = $x("//label[contains(text(),'Нормативный срок обучения')]/following-sibling::div//input");          // 'Нормативный срок обучения'
    private SelenideElement courseInput                     = $x("//label[contains(text(),'Курс')]/following-sibling::div//input");                               // 'Курс'
    private SelenideElement yearOfAdmissionInput            = $x("//label[contains(text(),'Год поступления на первый курс')]/following-sibling::input");          // 'Год поступления на первый курс'

    // Кнопки
    private SelenideElement cancelBtn                       = $x("(//a[contains(text(),'Отмена')])[1]");                                                          // 'Отмена'
    private SelenideElement saveBtn                         = $x("//span[contains(text(),'Сохранить')]/..");                                                      // 'Сохранить'

    // Dropdown list | Выпадающие списки
    private ElementsCollection cathedraList                 = $$x("//label[contains(text(),'Кафедра')]/following-sibling::div//li/span/span");                     // 'Кафедра'
    private ElementsCollection qualificationList            = $$x("//label[contains(text(),'Квалификация')]/following-sibling::div//li/span/span");                // 'Квалификация'
    private ElementsCollection curatorList                  = $$x("//label[contains(text(),'Куратор')]/following-sibling::div//li/span/span");                     // 'Куратор'
    private ElementsCollection industrialTrainingMasterList = $$x("//label[contains(text(),'Мастер производственного')]/following-sibling::div//li/span/span");    // 'Мастер производственного обучения'
    private ElementsCollection languageEducationList        = $$x("//label[contains(text(),'Язык обучения')]/following-sibling::div//li/span/span");               // 'Язык обучения'
    private ElementsCollection formOfStudyList              = $$x("//label[contains(text(),'Форма обучения')]/following-sibling::div//li/span/span");              // 'Форма обучения'
    private ElementsCollection normativeEducationPeriodList = $$x("//label[contains(text(),'Нормативный срок')]/following-sibling::div//li/span/span");            // 'Нормативный срок обучения'
    private ElementsCollection courseList                   = $$x("//label[contains(text(),'Курс')]/following-sibling::div//li/span/span");                        // 'Курс'

    // error-message | Валидация
    private SelenideElement citizenshipErrorMessage         = $x("//div[contains(text(),'\"Название\" обязательно для заполнения')]");
    private SelenideElement nationalityErrorMessage         = $x("//div[contains(text(),'\"Кафедра\" обязательно для заполнения')]");
    private SelenideElement informationOnMigrationStatusErrorMessage = $x("//div[contains(text(),'Поле \"Куратор\" обязательно для заполнения')]");
    private SelenideElement contactNumberErrorMessage       = $x("//div[contains(text(),'\"Язык обучения\" обязательно для заполнения')]");
    private SelenideElement regionErrorMessage              = $x("//div[contains(text(),'\"Форма обучения\" обязательно для заполнения')]");
    private SelenideElement typeOfResidenceErrorMessage     = $x("//div[contains(text(),'\"Нормативный срок обучения\"')]");
    private SelenideElement acceptedGraduatedErrorMessage   = $x("//div[contains(text(),'\"Курс\" обязательно для заполнения.')]");
    private SelenideElement cathedraErrorMessage            = $x("//div[contains(text(),'Поле \"Год поступления ')]");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");

    public GroupCreatePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Контингент"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

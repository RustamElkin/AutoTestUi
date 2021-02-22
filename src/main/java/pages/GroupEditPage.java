package pages;// Редактирование группы
//  /ru/tko/control/group/1456/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GroupEditPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Инпуты. При редактировании нужно очистить перед внесением изменений.
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                                                        // 'Название'
    // 'Кафедра' залочено
    private SelenideElement qualificationInput = $x("//label[contains(text(),'Квалификация')]/following-sibling::div//input");                                      // 'Квалификация'
    private SelenideElement curatorInput = $x("//label[contains(text(),'Куратор')]/following-sibling::div//input");                                                 // 'Куратор'
    private SelenideElement industrialTrainingMasterInput = $x("//label[contains(text(),'Мастер производственного обучения')]/following-sibling::div//input");      // 'Мастер производственного обучения'
    private SelenideElement languageEducationInput = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div//input");                                 // 'Язык обучения'
    // 'Форма обучения' залочено
    // 'Нормативный срок обучения' залочено
    // 'Курс' залочено
    // 'Год поступления на первый курс' залочено

    // Кнопки
    private SelenideElement cancelBtn = $x("(//a[contains(text(),'Отмена')])[1]");                         // 'Отмена'
    private SelenideElement saveBtn = $x("//span[contains(text(),'Сохранить')]/..");                       // 'Сохранить'

    // Dropdown list | Выпадающие списки
    // 'Кафедра' залочено
    private ElementsCollection qualificationList = $$x("//label[contains(text(),'Квалификация')]/following-sibling::div//li/span/span");                            // 'Квалификация'
    private ElementsCollection curatorList = $$x("//label[contains(text(),'Куратор')]/following-sibling::div//li/span/span");                                       // 'Куратор'
    private ElementsCollection industrialTrainingMasterList = $$x("//label[contains(text(),'Мастер производственного')]/following-sibling::div//li/span/span");     // 'Мастер производственного обучения'
    private ElementsCollection languageEducationList = $$x("//label[contains(text(),'Язык обучения')]/following-sibling::div//li/span/span");                       // 'Язык обучения'
    // 'Форма обучения' залочено
    // 'Нормативный срок обучения' залочено
    // 'Курс' залочено
    // 'Год поступления на первый курс' залочено


    // error-message | Валидация
    private SelenideElement emptyNameErrorMessage  = $x("//div[contains(text(),'\"Название\" обязательно для заполнения')]");
    private SelenideElement emptyQualificationErrorMessage  = $x("//div[contains(text(),'Поле \"Квалификация\" обязательно для заполнения.')]");
    private SelenideElement emptyCuratorErrorMessage = $x("//div[contains(text(),'\"Куратор\" обязательно для заполнения')]");
    private SelenideElement emptyLanguageEducationErrorMessage = $x("//div[contains(text(),'\"Язык обучения\" обязательно для заполнения.')]");

}




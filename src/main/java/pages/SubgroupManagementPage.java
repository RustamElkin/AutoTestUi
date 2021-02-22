package pages;// Управление подгруппой
//  /ru/tko/control/subgroup/813/management

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SubgroupManagementPage {

    // Тайтл
    private SelenideElement titleToPage                 = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab                 = $x("//span[contains(text(),'Полный список')]/..");                                                       // 'Полный список'
    private SelenideElement groupsTab                   = $x("//span[contains(text(),'Группы')]/..");                                                              // 'Группы'
    private SelenideElement subgroupsTab                = $x("//span[contains(text(),'Подгруппы')]/..");                                                           // 'Подгруппы'
    private SelenideElement cathedraTab                 = $x("//span[contains(text(),'Кафедры')]/..");                                                             // 'Кафедры'
    private SelenideElement archiveTab                  = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");           // 'Архив'

    // Кнопки
    private SelenideElement moveContingentGroupBtn      = $x("//div/label[contains(text(),'Переместить из группы')]/following-sibling::input[@value='move']");     // Кнопка 'Переместить из группы'
    private SelenideElement deleteContingentGroupBtn    = $x("//div/label[contains(text(),'Удалить из группы')]/following-sibling::input[@value='delete']");       // Кнопка 'Удалить из группы'
    private SelenideElement addContingentFromGroupBtn   = $x("//div/label[contains(text(),'Добавить студентов')]/following-sibling::input[@value='add']");         // Кнопка 'Добавить студентов из группы'
    private SelenideElement approveBtn                  = $x("//div/a[contains(text(),'Подтвердить') and @class='s-btn s-btn--thm-green']");                       // Кнопка 'Подтвердить'

    // Инпуты
    private SelenideElement chooseSubgroupInput         = $x("//input[ @name='subgroups' and @class='multiselect__input']");                                       // 'Название'

    // Dropdown фильтры
    private SelenideElement chooseSubgroupFromList      = $x("//label[contains(text(),'Квалификация')]/following-sibling::div");                                   // 'Квалификация'

    // Список студентов
    private ElementsCollection studentListByName        = $$x("//div[@class='candidate-item__name']");

    // Кнопки success и reject
    private ElementsCollection successBtn               = $$x("//input[@class='__success']");
    private ElementsCollection rejectBtn                = $$x("//input[@class='__reject']");

    // Кнопки в модалке
    private SelenideElement closeBtn                    = $x("//div[@class='s-modal__container']//div[ @class='s-modal__close' and @data-target='#modal-confirm-destroy']");
    private SelenideElement modalApproveBtn             = $x("(//div[@class='s-modal__container']//a[text()='Подтвердить' and contains(@class,'s-btn--thm-green')])[1]");
    private SelenideElement modalCancelBtn              = $x("//div[@class='s-modal__container']//a[text()='Отмена' and @data-target='#modal-confirm-destroy']");



}

package pages;// Управление группой
//  /ru/tko/control/group/183/management

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GroupManagementPage {

    // Тайтл
    private SelenideElement titleToPage        = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab        = $x("//span[contains(text(),'Полный список')]/..");                                                // 'Полный список'
    private SelenideElement groupsTab          = $x("//span[contains(text(),'Группы')]/..");                                                         // 'Группы'
    private SelenideElement subgroupsTab       = $x("//span[contains(text(),'Подгруппы')]/..");                                                   // 'Подгруппы'
    private SelenideElement cathedraTab        = $x("//span[contains(text(),'Кафедры')]/..");                                                      // 'Кафедры'
    private SelenideElement archiveTab         = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   // 'Архив'

    // Кнопки
    // Кнопка 'Переместить из группы' активна по умолчанию и в начале не кликабельна
    private SelenideElement moveFromGroupBtn   = $x("//label[contains(text(),'Переместить из группы')]");                                     // 'Переместить из группы'
    private SelenideElement removeFromGroupBtn = $x("//label[contains(text(),'Удалить из группы')]");                                       // 'Удалить из группы'

    // Кнопка "Подтвердить" | для Перемещения студентов активируется после заполнения инпутов
    //                      | для Удаления студентов из группы активна сразу, но если не выбрать студентов сработает валидация.
    private SelenideElement confirmBtn         = $x("(//a[contains(text(),'Подтвердить')])[1]");

    // Кнопки в модалке
    private SelenideElement modalConfirmBtn    = $x("(//div[@class=\"s-modal__container\"]//a[contains(text(),'Подтвердить')])[1]");
    private SelenideElement modalCancelBtn     = $x("(//div[@class=\"s-modal__container\"]//a[contains(text(),'Отмена')])[1]");

    // error-message | Валидация. Нажать подтвердить в модалке не выбрав студентов
    private SelenideElement emptyStudentsGrowl = $x("//body/div[@id='growls']//div[contains(text(),'Ошибка')]");

    // Список студентов | фильтруем по имени
    private ElementsCollection studentList     = $$x("//div[@class='candidate-list']//div[@class='candidate-item__name']");

    // Выбор студента по индексу
    private SelenideElement studentSelectedBtn = $x("(//div[@class='candidate-list']/div/input[@value='1'])[1]");
    // Отменить выбор студента по индексу
    private SelenideElement takeAwayStudentBtn = $x("(//div[@class='candidate-list']/div/input[@value='1'])[1]");

    // Список кнопок "Посмотреть"  | фильтруем по индексу
    private ElementsCollection viewBtnList     = $$x("//div[@class='candidate-list']//div[@class='candidate-item__name']/a");

    // Инпуты
    private SelenideElement specialtyInput     = $x("//label[contains(text(),'Выберите специальность')]/following-sibling::div//input");        //'Выберите специальность'
    private SelenideElement qualificationInput = $x("//label[contains(text(),'Выберите квалификацию')]/following-sibling::div//input");     //'Выберите квалификацию'
    private SelenideElement groupInput         = $x("//label[contains(text(),'Выберите группу')]/following-sibling::div//input");                   //'Выберите группу'

}

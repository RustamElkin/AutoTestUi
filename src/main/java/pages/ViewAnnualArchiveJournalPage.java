package pages;// Архив_Журнал
//  /ru/tko/control/annual-archive/modules/4/journals/709/show

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewAnnualArchiveJournalPage {

    // Тайтл
    private SelenideElement titleToPage                     = $x("//h1[contains(text(),'Журнал')]");

    // Табы на странице
    private SelenideElement backTab                         = $x("//span[contains(text(),'Назад')]/..");                                                             // 'Назад'
    private SelenideElement recoveryTab                     = $x("//span[contains(text(),'Восстановить')]/..");                                                      // 'Восстановить'

    // Кнопки
    private SelenideElement exportBtn                       = $x("//a[contains(text(),'Экспортировать')]");                                                          // кнопка 'Экспортировать'

    // Dropdown elements | фильтровать по названию или по индексу
    private SelenideElement subjectDropdown                 = $x("//select[@name = 'discipline']/parent::div[@class = 'button-journal-menu']");
    private ElementsCollection subjectList                  = $$x("//select[@name = 'discipline']/option");

    // Модалка появится если нажать на кнопку "Восстановить"
    // Кнопки в модалке
    private SelenideElement closeModalBtn                   = $x("(//div[@data-target = '#modal-control-confirm-js' and @class='s-modal__close'])[1]");              // 'Закрыть модалку'
    private SelenideElement submitBtn                       = $x("(//a[text() ='Отмена' and @data-target='#modal-control-confirm-js']/following-sibling::a)[1]");    // 'Подтвердить'
    private SelenideElement cancelBtn                       = $x("(//a[text() ='Отмена' and @data-target='#modal-control-confirm-js'])[1]");                         // 'Отмена'

    // При поптыке экспортировать пустой журнал, валидация
    private SelenideElement emptyJournalNotificationMessage =$x("//div[@class='s-notification__message' and text() = 'Нет данных']");
}

package pages;// Мониторинг_Дистанционное обучение
//  /ru/tko/control/monitoring/homework/list/19195

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringHomeworkListCollegePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенные задания организации')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                                                                // Таб "Назад"

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");                                             // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                             // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                              // 'Сбросить'

    // Фильтр инпуты
    private SelenideElement surnameFilter = $x("//label[contains(text(),'Название')]/following-sibling::input");                                    // 'Название'
    private SelenideElement nameFilter = $x("//label[contains(text(),'Группа')]/following-sibling::div//input ");                                   // 'Группа'
    private SelenideElement patronymicFilter = $x("//label[contains(text(),'Дисциплина')]/following-sibling::div//input");                          // 'Дисциплина'
    private SelenideElement applicationsTypeFilter = $x("//label[contains(text(),'Ответственный')]/following-sibling::div//input");                 // 'Ответственный'

    // Фильтры с диапазоном
    private SelenideElement dateFromInput = $x("//label[contains(text(),'Дата оценки')]/following-sibling::div//input[@name='filters[date][from]']");       // 'Дата от'
    private SelenideElement dateToInput = $x("//label[contains(text(),'Дата оценки')]/following-sibling::div//input[@name='filters[date][to]']");           // 'Дата до'

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                     // '№ в таблице'
    private SelenideElement nameTable = $x("//th[contains(text(),'Название')]");                                                  // 'Название'
    private SelenideElement groupTable = $x("//th[contains(text(),'Группа')]");                                                   // 'Группа'
    private SelenideElement disciplineTable = $x("//th[contains(text(),'Дисциплина')]");                                          // 'Дисциплина'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'Ответственный')]");                                         // 'Ответственный'
    private SelenideElement numberOfParticipantsTable = $x("//th[contains(text(),'Количество участников')]");                     // 'Количество участников'
    private SelenideElement dateAndTimeOfCompletionOfAppointment = $x("//th[contains(text(),'Дата и время завершения приёма')]"); // 'Дата и время завершения приёма'
    private SelenideElement dateAndTimeOfAppointment = $x("//th[contains(text(),'')]");                                           // 'Дата и время назначения'
    private SelenideElement assessmentDateTable = $x("//th[contains(text(),'Дата оценки')]");                                     // 'Дата оценки'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                            // 'Операции'

    private ElementsCollection selectByFullName = $$x("//td[@data-table-head='Ответственный']");

    // Кнопки просмотра в таблицах
    private ElementsCollection viewBtns = $$x("//tbody/tr//span[@class='s-ico s-ico--thm-eye']");                                 // Кнопки 'Посмотреть'


}

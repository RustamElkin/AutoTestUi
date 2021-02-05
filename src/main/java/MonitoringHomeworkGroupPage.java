// Мониторинг_Дистанционное обучение_Назначенное задание
//  /ru/tko/control/monitoring/homework/3

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringHomeworkGroupPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Назначенное задание')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Тайтл "Задание"
    private SelenideElement titleContentBlock = $x("//span[contains(text(),'Задание')]");

    // ССылка на журнал
    private SelenideElement journalLink = $x("//h3//following-sibling::table//a[contains(text(),'Перейти')]");

    // Список Вложенных файлов
    private ElementsCollection listOfAttachments = $$x("// a[contains(text(),'Просмотреть')]");

    // Тайтл "Участники"
    private SelenideElement titleParticipants = $x("//span[contains(text(),'Участники')]");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[@class='s-to-center s-table__col-1']");               // '№ в таблице'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                            // 'ФИО'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                           // 'Статус'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                     // 'Операции'

    private ElementsCollection studentsFullNameList = $$x("//tr/td[@data-table-head='ФИО']");
    private  ElementsCollection viewScheduledTaskBtn= $$x("//a[@title='Посмотреть'][contains(@class,'s-btn--ico')]");





}

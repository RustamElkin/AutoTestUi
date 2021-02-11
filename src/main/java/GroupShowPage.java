// Сведения о группе
//  /ru/tko/control/group/183/show

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GroupShowPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Полный список')]/..");                            // 'Полный список'
    private SelenideElement groupsTab = $x("//span[contains(text(),'Группы')]/..");                                     // 'Группы'
    private SelenideElement subgroupsTab = $x("//span[contains(text(),'Подгруппы')]/..");                               // 'Подгруппы'
    private SelenideElement cathedraTab = $x("//span[contains(text(),'Кафедры')]/..");                                  // 'Кафедры'
    private SelenideElement archiveTab = $x("//div[@class=\"container-content-head__tabs-wrapper\"]//span[contains(text(),'Архив')]/..");   //'Архив'

    // Кнопки
    private SelenideElement dropoutOfGraduatesBtn = $x("//a[contains(text(),'Выбытие выпускников')]");                  // 'Выбытие выпускников'
    private SelenideElement editBtn = $x("//span[contains(text(),'Редактировать')]/..");                                // 'Редактировать'

    // Таблица
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                             //'№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                         //'ФИО'
    private SelenideElement iinTable = $x("//th[contains(text(),'ИИН')]");                                              //'ИИН'
    private SelenideElement submissionStatusToNODBTable = $x("//th[contains(text(),'Статус отправки в НОБД')]");        //'Статус отправки в НОБД'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                                  //'Операции'

    // Таблица, список студентов группе
    private ElementsCollection studentList = $$x("(//tbody)[2]/tr");                                                    // Список студентов в группе

    // Кнопки просмотра в таблице. Можно выбрать по индексу. По умолчанию стоит первая [1]
    private SelenideElement viewBtn = $x("((//tbody)[2]/tr//span[@class='s-ico s-ico--thm-eye'])[1]");                  // Кнопка 'Посмотреть'

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//ul[@role=\"navigation\"]//a[contains(text(),'2')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");


}

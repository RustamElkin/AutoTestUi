// Экзамен (просмотр определенного экзамена, который можно завершить)
//  /ru/tko/control/exams/649

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ExamCheckPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Экзамены')]"));

    // Табы на странице
    private SelenideElement backTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                                        // 'Назад'

    // Ссылка на просмотр приемной комиссии
    private SelenideElement viewAdmissionsOffice = $(byXpath("//td[contains(text(),'Журнал')]/..//a"));                         // 'Просмотр журнала'

    // Кнопка "Завершить экзамен"
    private SelenideElement completeExamBtn = $(byXpath("//a[contains(text(),'Завершить экзамен')]"));                          // 'Завершить экзамен'

    // Таблица участников (студентов)
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                          // 'ФИО'
    private SelenideElement statusTable = $(byXpath("//th[contains(text(),'Статус')]"));                                         // 'Статус'
    private SelenideElement creativeExamResultTable = $(byXpath("//th[contains(text(),'Результат творческого экзамена')]"));     // 'Результат творческого экзамена'

    // Кнопка "Проверить" в таблице. Просмотр проверенного экзамена. Привязался по строке tr[3]
    private SelenideElement viewExamBtn = $(byXpath("//tr[3]/td//a[@title=\"Проверить\"]"));                                     // 'Завершить экзамен'

    // Привязался по статусу "Проверен"
    //td[contains(text(),'Проверен')]/following-sibling::td//a[@title='Проверить']








}

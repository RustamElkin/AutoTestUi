// Мониторинг_Дистанционное обучение_Ответ студента
//  /ru/tko/control/monitoring/homework/answer/181

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringStudentHomeworkAnswerPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Ответ студента')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Таблица
    private SelenideElement statusTable = $x("//td[contains(text(),'Статус')]");                           // 'Статус'
    private SelenideElement fullNameTable = $x("//td[contains(text(),'ФИО ответившего')]");                // 'ФИО ответившего'
    private SelenideElement gradeTable = $x("//td[contains(text(),'Оценка')]");                            // 'Оценка'

    private ElementsCollection revisionAttachmentsList = $$x("//td[contains(text(),'Вложенные файлы доработки')]/../following-sibling::tr/td[contains(text(),'Вложение')]");  // 'Вложенные файлы доработки'
    private ElementsCollection attachedFilesList = $$x("//td[contains(text(),'Вложенные файлы')]/../following-sibling::tr//a[contains(text(),'Просмотреть')]");               // 'Вложенные файлы'



}

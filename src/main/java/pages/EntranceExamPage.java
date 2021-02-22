package pages;// Вступительный экзамен
//  /ru/tko/control/entrance-exam/339

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EntranceExamPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вступительные экзамены')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                         // 'Назад'

    // Ссылка на просмотр приемной комиссии
    private SelenideElement viewAdmissionsOffice = $x("//td[contains(text(),'Приемная комиссия')]/..//a");              // 'Просмотр приемной комиссии'

    // Таблица
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                          // 'ФИО'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                         // 'Статус'
    private SelenideElement creativeExamResultTable = $x("//th[contains(text(),'Результат творческого экзамена')]");     // 'Результат творческого экзамена'


}

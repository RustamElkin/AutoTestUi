// Создание вступительного экзамена
//  /ru/tko/control/entrance-exam/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EntranceExamCreatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вступительные экзамены')]");

    // Табы на странице
    private SelenideElement activeTab = $x("//span[contains(text(),'Активные')]/..");                                                       // 'Активные' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Архив')]/..");         // 'Архив'
    private SelenideElement addTab = $x("//span[contains(text(),'Добавить')]/..");                                                          // 'Добавить'

    // Таблица
    private SelenideElement nameTable = $x("//th[contains(text(),'№')]");                                       // '№'
    private SelenideElement dateAndTimeTable = $x("//th[contains(text(),'Дата и время')]");                     // 'Дата и время'
    private SelenideElement specializationTable = $x("//th[contains(text(),'Специальность')]");                 // 'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   // 'Квалификация'
    private SelenideElement formOfStudyTable = $x("//th[contains(text(),'Форма обучения')]");                   // 'Форма обучения'
    private SelenideElement languageOfEducationTable = $x("//th[contains(text(),'Язык обучения')]");            // 'Язык обучения'
    private SelenideElement levelOfEducationTable = $x("//th[contains(text(),'Уровень образования')]");         // 'Уровень образования'
    private SelenideElement typeOfTable = $x("//th[contains(text(),'Вид')]");                                   // 'Вид'
    private SelenideElement operationsOnTable = $x("//th[contains(text(),'Операции')]");                        // 'Операции'
}

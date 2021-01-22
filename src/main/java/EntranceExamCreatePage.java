// Создание вступительного экзамена
//  /ru/tko/control/entrance-exam/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class EntranceExamCreatePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Вступительные экзамены')]"));

    // Табы на странице
    private SelenideElement activeTab = $(byXpath("//span[contains(text(),'Активные')]/.."));                                                       // 'Активные' (Текущий таб не кликабельный)
    private SelenideElement archiveTab = $(byXpath("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Архив')]/.."));         // 'Архив'
    private SelenideElement addTab = $(byXpath("//span[contains(text(),'Добавить')]/.."));                                                          // 'Добавить'

    // Таблица
    private SelenideElement nameTable = $(byXpath("//th[contains(text(),'№')]"));                                       // '№'
    private SelenideElement dateAndTimeTable = $(byXpath("//th[contains(text(),'Дата и время')]"));                     // 'Дата и время'
    private SelenideElement specializationTable = $(byXpath("//th[contains(text(),'Специальность')]"));                 // 'Специальность'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   // 'Квалификация'
    private SelenideElement formOfStudyTable = $(byXpath("//th[contains(text(),'Форма обучения')]"));                   // 'Форма обучения'
    private SelenideElement languageOfEducationTable = $(byXpath("//th[contains(text(),'Язык обучения')]"));            // 'Язык обучения'
    private SelenideElement levelOfEducationTable = $(byXpath("//th[contains(text(),'Уровень образования')]"));         // 'Уровень образования'
    private SelenideElement typeOfTable = $(byXpath("//th[contains(text(),'Вид')]"));                                   // 'Вид'
    private SelenideElement OperationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));                        // 'Операции'
}

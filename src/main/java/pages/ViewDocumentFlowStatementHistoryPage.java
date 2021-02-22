package pages;// Документооборот_История изменения заявки     Просто "Документооборот" сейчас
//  /ru/tko/document-flow/statements/109?history=1

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ViewDocumentFlowStatementHistoryPage {

    // Тайтл
    private SelenideElement titleToPage     = $x("//h1[contains(text(),'Входящие заявки')]");

    // Табы на странице
    private SelenideElement backToTab       = $x("//span[contains(text(),'Назад')]/..");
    private SelenideElement informationTab  = $x("//a[contains(text(),'Информация')]");                    // 'Информация'
    private SelenideElement historyTab      = $x("//a[contains(text(),'История изменения')]");             // 'История изменения'

    // Таблица
    private SelenideElement themeThesisWork = $x("//th[contains(text(), 'Дата и время')]");                // 'Дата и время'
    private SelenideElement personnelName   = $x("//th[contains(text(), 'Действие')]");                    // 'Руководитель'
    private SelenideElement protectionDate  = $x("//th[contains(text(), 'Пользователь')]");                // 'Дата защиты'




}

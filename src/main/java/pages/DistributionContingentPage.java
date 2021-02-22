package pages;// Приемная комиссия_Поступившие
//  /ru/tko/control/distribution-contingent

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DistributionContingentPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Поступившие')]");

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $x("//a[contains(text(),'Распределить по группам')]");             // 'Распределить по группам'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                            // 'ФИО'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");         // 'Язык обучения'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");              // 'Квалификация'

}

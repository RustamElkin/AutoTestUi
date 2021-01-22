// Приемная комиссия_Поступившие
//  /ru/tko/control/distribution-contingent

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DistributionContingentPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Поступившие')]"));

    // Кнопка "Экспортировать"
    private SelenideElement exportBtn = $(byXpath("//a[contains(text(),'Распределить по группам')]"));                  // 'Распределить по группам'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                 // 'ФИО'
    private SelenideElement languageEducationTable = $(byXpath("//th[contains(text(),'Язык обучения')]"));              // 'Язык обучения'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   // 'Квалификация'


}

// Сведения о сотруднике
//  /ru/tko/control/personnel/2812

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PersonnelIntelligencePage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Сведения о сотруднике')]"));

    // Табы на странице
    private SelenideElement backToTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                                      // 'Назад'

    // Кнопка "Редактировать"
    private SelenideElement editBtn = $(byXpath("//span[contains(text(),'Редактировать')]/.. "));                               // 'Редактировать'

    // Можно чекнуть наличие title-ов "Описание и Адрес"
    private SelenideElement PersonalInformationTitle = $(byXpath("//span[contains(text(),'Личная информация')]"));              // 'Личная информация'
    private SelenideElement commonInformationTitle = $(byXpath("//span[contains(text(),'Общая информация')]"));                 // 'Общая информация'
    private SelenideElement additionalInformationTitle = $(byXpath("//span[contains(text(),'Дополнительная информация')]"));    // 'Дополнительная информация'

}

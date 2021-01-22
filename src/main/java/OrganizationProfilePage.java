// Профиль колледжа
//  /ru/tko/organization-profile

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OrganizationProfilePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Профиль колледжа')]"));

    // Табы на странице
    private SelenideElement organizationTab = $(byXpath("//span[contains(text(),'Организация')]/.."));                                   // 'Организация'
    private SelenideElement registrationInformationTab = $(byXpath("//span[contains(text(),'Регистрационные сведения')]/.."));           // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab = $(byXpath("//span[contains(text(),'МТБ')]/.."));                               // 'МТБ'

    // Кнопка "Редактировать"
    private SelenideElement editBtn = $(byXpath("//div[contains(text(),'Редактировать')]/.."));

    // Можно чекнуть наличие titl-ов "Описание и Адрес"
     private SelenideElement descriptionTitle = $(byXpath("//span[contains(text(),'Описание')]"));
     private SelenideElement addressTitle = $(byXpath("//span[contains(text(),'Адрес')]"));




}

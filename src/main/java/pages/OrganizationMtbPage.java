package pages;// МТБ колледжа
//  /ru/tko/organization-mtb

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrganizationMtbPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Профиль колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab = $x("//span[contains(text(),'Организация')]/..");                                   // 'Организация'
    private SelenideElement registrationInformationTab = $x("//span[contains(text(),'Регистрационные сведения')]/..");           // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab = $x("//span[contains(text(),'МТБ')]/..");                               // 'МТБ'

    // Кнопка "Редактировать"
    private SelenideElement editBtn = $x("//div[contains(text(),'Редактировать')]/..");

}

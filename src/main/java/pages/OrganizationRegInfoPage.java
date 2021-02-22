package pages;// Регистрационные сведения колледжа
//  /ru/tko/organization-reg-info

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrganizationRegInfoPage {

    // Тайтл
    private SelenideElement titleToPage                    = $x("//h1[contains(text(),'Регистрационные сведения колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab                = $x("//span[contains(text(),'Организация')]/..");                                          // 'Организация'
    private SelenideElement registrationInformationTab     = $x("//span[contains(text(),'Регистрационные сведения')]/..");             // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab    = $x("//span[contains(text(),'МТБ')]/..");                                  // 'МТБ'

    // Таблица
    private SelenideElement orgType                        = $x("//td[contains(text(),'Вид организации образования')]");               // 'Вид организации образования'
    private SelenideElement orgBin                         = $x("//td[contains(text(),'БИН организации образования')]");               // 'БИН организации образования'
    private SelenideElement orgIbanAccount                 = $x("//td[contains(text(),'IBAN счет')]");                                 // 'IBAN счет'
    private SelenideElement orgKnp                         = $x("//td[contains(text(),'КНП')]");                                       // 'КНП'
    private SelenideElement orgKbe                         = $x("//td[contains(text(),'КБЕ')]");                                       // 'КБЕ'
    private SelenideElement workMode                       = $x("//td[contains(text(),'Режим работы')]");                              // 'Режим работы'
    private SelenideElement ownershipType                  = $x("//td[contains(text(),'Форма собственности')]");                       // 'Форма собственности'
    private SelenideElement departmentalAffiliations       = $x("//td[contains(text(),'Ведомственная принадлежность')]");              // 'Ведомственная принадлежность'
    private SelenideElement legalForm                      = $x("//td[contains(text(),'Организационно-правовая форма')]");             // 'Организационно-правовая форма'
    private SelenideElement postcode                       = $x("//td[contains(text(),'Почтовый индекс')]");                           // 'Почтовый индекс'
    private SelenideElement directorFirstName              = $x("//td[contains(text(),'Фамилия руководителя')]");                      // 'Фамилия руководителя'
    private SelenideElement directorSecondName             = $x("//td[contains(text(),'Имя руководителя')]");                          // 'Имя руководителя'
    private SelenideElement directorLastName               = $x("//td[contains(text(),'Отчество руководителя')]");                     // 'Отчество руководителя'
    private SelenideElement workNumber                     = $x("//td[contains(text(),'Рабочий телефон (код+номер)')]");               // 'Рабочий телефон (код+номер)'
    private SelenideElement regInfoPhoneNumber             = $x("//td[contains(text(),'Сотовый телефон (номер)')]");                   // 'Сотовый телефон (номер)'
    private SelenideElement legalEntitiesRegistrationsInfo = $x("//td[contains(text(),'Сведения о регистрации юридического лица')]");  // 'Сведения о регистрации юридического лица'
    private SelenideElement openDate                       = $x("//td[contains(text(),'Дата открытия организации образования')]");     // 'Дата открытия организации образования'
    private SelenideElement passCertification              = $x("//td[contains(text(),'Прошли аттестацию')]");                         // 'Прошли аттестацию'

    // Кнопка "Редактировать"
    private SelenideElement editBtn                        = $x("//div[contains(text(),'Редактировать')]/..");


}

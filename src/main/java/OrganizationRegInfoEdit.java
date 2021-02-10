import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Редактирование регистрационных сведений колледжа
//  /ru/tko/organization-reg-info/edit

public class OrganizationRegInfoEdit {

    // Тайтл
    private SelenideElement titleToPage                         = $x("//h1[contains(text(),'Редактирование регистрационных сведений колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab                     = $x("//span[contains(text(),'Организация')]/..");                                            // 'Организация'
    private SelenideElement registrationInformationTab          = $x("//span[contains(text(),'Регистрационные сведения')]/..");                               // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab         = $x("//span[contains(text(),'МТБ')]/..");                                                    // 'МТБ'

    // Инпуты
    private SelenideElement orgBinInput                         = $x("//input[@name='org_bin' or @placeholder='БИН организации образования']");               // 'БИН организации образования'
    private SelenideElement orgIbanAccountInput                 = $x("//input[@name='org_iban_account' or @placeholder='IBAN счет']");                        // 'IBAN счет'
    private SelenideElement orgKnpInput                         = $x("//input[@name='org_knp' or @placeholder='КНП']");                                       // 'КНП'
    private SelenideElement orgKbeInput                         = $x("//input[@name='org_kbe' or @placeholder='КБЕ']");                                       // 'КБЕ'
    private SelenideElement postcodeInput                       = $x("//input[@name='postcode' or @placeholder='Почтовый индекс']");                          // 'Почтовый индекс'
    private SelenideElement directorFirstNameInput              = $x("//input[@name='director_first_name' or @placeholder='Фамилия руководителя']");          // 'Фамилия руководителя'
    private SelenideElement directorSecondNameInput             = $x("//input[@name='director_second_name' or @placeholder='Имя руководителя']");             // 'Имя руководителя'
    private SelenideElement directorLastNameInput               = $x("//input[@name='director_last_name' or @placeholder='Отчество руководителя']");          // 'Отчество руководителя'
    private SelenideElement workNumberInput                     = $x("//input[@name='work_number' and @class='s-form__input']");                              // 'Рабочий телефон (код+номер)'
    private SelenideElement regInfoPhoneNumberInput             = $x("//input[@name='reg_info_phone_number' and @class='s-form__input']");                    // 'Сотовый телефон (номер)'
    private SelenideElement legalEntitiesRegistrationsInfoInput = $x("//textarea[@name='legal_entities_registrations_info' and @class='s-form__textarea']");  // 'Сведения о регистрации юридического лица'
    private SelenideElement openDateInput                       = $x("//input[@name='open_date' and @id='datepicker']");                                      // 'Дата открытия организации образования'

    // Dropdown
    private SelenideElement orgTypeDropdown                     = $x("//select[@name='org_type' and @data-placeholder='Вид организации образования']");                     // 'Вид организации образования'
    private SelenideElement workModeDropdown                    = $x("//select[@name='work_mode' and @data-placeholder='Режим работы']");                                   // 'Режим работы'
    private SelenideElement ownershipTypeDropdown               = $x("//select[@name='ownership_type' and @data-placeholder='Форма собственности']");                       // 'Форма собственности'
    private SelenideElement departmentalAffiliationsDropdown    = $x("//select[@name='departmental_affiliations' and @data-placeholder='Ведомственная принадлежность'] ");  // 'Ведомственная принадлежность'
    private SelenideElement legalFormDropdown                   = $x("//select[@name='legal_form' and @data-placeholder='Организационно-правовая форма']");                 // 'Организационно-правовая форма'
    private SelenideElement passCertificationDropdown           = $x("//select[@name='pass_certification' and @data-placeholder='Прошли аттестацию']");                     // 'Прошли аттестацию'

    // Кнопка "Редактировать"
    private SelenideElement saveBtn                             = $x("//button[contains(text(),'Сохранить')]");

    // validation error-message
    //Если не заполнить поля сработает валидация, можно это проверить в тесте.
    private SelenideElement emptyOrgBin                         = $x("//div[contains(text(),'Поле \"БИН организации образования') and @class='s-form__error-message']");
    private SelenideElement emptyPostcode                       = $x("//div[contains(text(),'Поле \"Почтовый индекс') and @class='s-form__error-message']");
    private SelenideElement emptyDirectorFirstName              = $x("//div[contains(text(),'Поле \"Фамилия руководителя') and @class='s-form__error-message']");
    private SelenideElement emptyDirectorSecondName             = $x("//div[contains(text(),'Поле \"Имя руководителя') and @class='s-form__error-message']");
    private SelenideElement emptyDirectorLastName               = $x("//div[contains(text(),'Поле \"Отчество руководителя') and @class='s-form__error-message']");
    private SelenideElement emptyWorkNumber                     = $x("//div[contains(text(),'Поле \"Рабочий телефон') and @class='s-form__error-message']");
    private SelenideElement emptyRegInfoPhoneNumber             = $x("//div[contains(text(),'Поле \"Сотовый телефон') and @class='s-form__error-message']");
    private SelenideElement emptyLegalEntitiesRegistrationsInfo = $x("//div[contains(text(),'Поле \"Сведения о регистрации юридического') and @class='s-form__error-message']");
    private SelenideElement emptyOpenDate                       = $x("//div[contains(text(),'Поле \"Дата открытия организации') and @class='s-form__error-message']");













}

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Профиль_Дополнительная информация
//  /ru/shy/account/additional-people-info

public class AccountAdditionalInfoPage {

    // Тайтл
    private SelenideElement titleToPage                        = $x("//h1[contains(text(),'Дополнительная информация')]");

    // Табы на странице
    private SelenideElement backBtn                            = $x("//div[@class='container-content-head__tabs-wrapper']/a");

    // Кнопка "Сохранить"
    private SelenideElement saveBtn                            = $x("button[type='submit']");

    // Инпуты
    private SelenideElement healthStatusInput                  = $x("//input[@name='health_status']");             // 'Состояние здоровья'
    private SelenideElement sportsAchievementsInput            = $x("//input[@name='sports_achievements']");       // 'Спорт. достижения'
    private SelenideElement familyStatusInput                  = $x("//input[@name='family_status']");             // 'Семейное положение'
    private SelenideElement achievementsInput                  = $x("//input[@name='achievements']");              // 'Достижения'
    private SelenideElement actualPlaceOfResidenceInput        = $x("//input[@name='actual_place_residence']");    // 'Фактическое место проживания'
    private SelenideElement familyTypeInput                    = $x("//input[@name='family_type']");               // 'Тип семьи по составу'
    private SelenideElement financialSituationInput            = $x("//input[@name='financial_situation']");       // 'Материальное положение'
    private SelenideElement numberOfChildrenInput              = $x("//input[@name='number_of_children']");        // 'Количество детей в семье'
    private SelenideElement fatherStatusInput                  = $x("//input[@name='father_status']");             // 'Информация об отце'
    private SelenideElement fatherDisabilityInput              = $x("//input[@name='father_disability']");         // 'Инвалидность отца'
    private SelenideElement motherStatusInput                  = $x("//input[@name='mother_status']");             // 'Информация о матери'
    private SelenideElement maternalDisabilityInput            = $x("//input[@name='mother_disability']");         // 'Инвалидность матери'

    // error-message
    private SelenideElement healthStatusErrorMessage           = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Состояние здоровья')]");          // 'Состояние здоровья'
    private SelenideElement sportsAchievementsErrorMessage     = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Спортивные достижения')]");       // 'Спорт. достижения'
    private SelenideElement familyStatusErrorMessage           = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Семейное положение')]");          // 'Семейное положение'
    private SelenideElement achievementsErrorMessage           = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Достижения')]");                  // 'Достижения'
    private SelenideElement actualPlaceOfResidenceErrorMessage = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Фактическое место')]");           // 'Фактическое место проживания'
    private SelenideElement familyTypeErrorMessage             = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Тип семьи')]");                   // 'Тип семьи по составу'
    private SelenideElement financialSituationErrorMessage     = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Материальное положение')]");      // 'Материальное положение'
    private SelenideElement numberOfChildrenErrorMessage       = $x("//div[@class= 's-form__error-message' and contains(text(),'Поле \"Количество детей')]");            // 'Количество детей в семье'


}

package pages;// Редактирование МТБ колледжа
//  /ru/tko/organization-mtb/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationMtbEditPage {

    // Тайтл
    private SelenideElement titleToPage                        = $x("//h1[contains(text(),'Редактирование МТБ колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab                    = $x("//span[contains(text(),'Назад')]/..");                                                 // Таб 'Организация'
    private SelenideElement orgRegInfoTab                      = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Контингент')]/..");         // Таб 'Регистрационные сведения'
    private SelenideElement mtbTab                             = $x("//span[contains(@class,'s-str-ico--wider')][contains(text(),'Педагоги')]/.. ");                 // Таб 'МТБ'

    // Инпуты
    private SelenideElement organizationBuildingsAmountInput   = $x("//input[@name='buildings_amount']");                                  // 'Количество зданий'
    private SelenideElement organizationGroupPremisesAreaInput = $x("//input[@name='group_premises_area']");                             // 'Площадь групповых помещений'
    private SelenideElement libraryInput                       = $x("//input[@placeholder='Библиотека, ед.']");                                                // 'Библиотека'
    private SelenideElement booksAmountInput                   = $x("//input[@name='books_amount']");                                                      // 'Количество учебно-методической литературы (УМЛ)'
    private SelenideElement computerAmountInput                = $x("//input[@name='computer_amount']");                                                // 'Количество компьютеров'
    private SelenideElement replaceCompAmountInput             = $x("//input[@name='replace_comp_amount']");                                         // 'Количество компьютеров требующих замены'
    private SelenideElement interactiveFacilitiesAmountInput   = $x("//input[@name='interactive_facilities_amount']");                     // 'Количество интерактивного оборудования'

    // Dropdown lists Выпадающие списки
    private SelenideElement hasVideoRecord                     = $x("//select[@name='has_video_record']/following-sibling::span");
    private SelenideElement hasTurniket                        = $x("//select[@name='has_turniket']/following-sibling::span");
    private SelenideElement hasGym                             = $x("//select[@name='has_gym']/following-sibling::span");
    private SelenideElement hasSwimmingPool                    = $x("//select[@name='has_swimming_pool']/following-sibling::span");
    private SelenideElement hasInternet                        = $x("//select[@name='has_internet']/following-sibling::span");
    private SelenideElement internetSpeed                      = $x("//select[@name='internet_speed']/following-sibling::span");
    private SelenideElement hasCanteen                         = $x("//select[@name='has_canteen']/following-sibling::span");

    private ElementsCollection hasVideoRecordSelects           = $$x("//select[@name='has_video_record']/option");                                  // 'Наличие видеонаблюдения'
    private ElementsCollection hasTurniketSelects              = $$x("//select[@name='has_turniket']/option");                                      // 'Наличие турникета'
    private ElementsCollection hasGymSelects                   = $$x("//select[@name='has_gym']/option");                                           // 'Наличие спортзала'
    private ElementsCollection hasSwimmingPoolSelects          = $$x("//select[@name='has_swimming_pool']/option");                                 // 'Наличие бассейна'
    private ElementsCollection hasInternetSelects              = $$x("//select[@name='has_internet']/option");                                      // 'Наличие Интернета'
    private ElementsCollection internetSpeedSelects            = $$x("//select[@name='internet_speed']/option");                                    // 'Скорость интернета'
    private ElementsCollection hasCanteenSelects               = $$x("//select[@name='has_canteen']/option");                                       // 'Наличие столовой'
    private ElementsCollection hasFoodUnitSelects              = $$x("//select[@name='has_food_unit']/option");                                     // 'Наличие пищеблока'

    private SelenideElement saveBtn                            = $x("//button[contains(text(),'Сохранить')]");

    private SelenideElement mainPageLink                       = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");

    public OrganizationMtbEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Редактирование МТБ колледжа"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

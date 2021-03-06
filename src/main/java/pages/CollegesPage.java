package pages;// Колледжи
//  /ru/tko/colleges

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CollegesPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//div[@class='s-title-head' and text() ='Колледжи']");

    // Кнопки
    private SelenideElement searchByOrganizationNameInput = $x("//input[@placeholder='Поиск по названию организации']");
    private SelenideElement collegesSearchBtn = $x("//*[@id='v-catalog-list-view-app']//button[@type='button' and contains(@class, 'sn-btn--squire s-b-blue')]");

    private SelenideElement applyFilterBtn = $x("//button[@type='button' and contains(@class,'s-b-green')]");
    private SelenideElement resetFilterBtn = $x("//div[contains(@class,'s-balabaqsha-catalog__filter-reset')]");

    private ElementsCollection selectCollegesFromList = $$x("//*[@id='v-catalog-list-view-app']//div/a[contains(@class, 's-catalog-item')]");

    // Multiselect input, мультиселект инпуты, фильтр
    private SelenideElement selectAreaInput = $x("//div[contains(text(),'Выберите область')]/..//div[@class='sn-field__control']");
    private SelenideElement selectDistrictInput = $x("//div[contains(text(),'Выберите район')]/..//div[@class='sn-field__control']");

    // CheckBox
    private SelenideElement languageOfEducationRussianCheckBox = $x("//div[contains(text(),'Русский')]/preceding-sibling::div/input");
    private SelenideElement languageOfEducationKazakhCheckBox = $x("//div[contains(text(),'Казахский')]/preceding-sibling::div/input");
    private SelenideElement languageOfEducationEnglishCheckBox = $x("//div[contains(text(),'Английский')]/preceding-sibling::div/input");
    private SelenideElement languageOfEducationUzbekCheckBox = $x("//div[contains(text(),'Узбекский')]/preceding-sibling::div/input");

    private SelenideElement organizationTypeCollegeCheckBox = $x("(//div[contains(text(),'колледж')]/preceding-sibling::div/input)[1]");
    private SelenideElement specializedSchoolCheckBox = $x("//div[contains(text(),'училище')]/preceding-sibling::div/input");
    private SelenideElement vocationalTrainingCenterCheckBox = $x("//div[text()='учебный центр профессиональной подготовки']/preceding-sibling::div/input");
    private SelenideElement collegeForSpecialEducationalNeedsCheckBox = $x("//div[contains(text(),'с особыми образовательными потребностями')]/preceding-sibling::div/input");
    private SelenideElement correctionalVocationalTrainingCenterCheckBox = $x("//div[contains(text(),'профессиональной подготовки при исправительном')]/preceding-sibling::div/input");
    private SelenideElement correctionalCollegeCheckBox = $x("//div[contains(text(),'колледж при исправительном учреждении')]/preceding-sibling::div/input");
    private SelenideElement militaryTechnicalCollegeCheckBox = $x("//div[contains(text(),'военно-технический колледж')]/preceding-sibling::div/input");
    private SelenideElement highCollegeCheckBox = $x("//div[contains(text(),'высший колледж')]/preceding-sibling::div/input");

    private SelenideElement seatAvailabilityCheckBox = $x("//div[contains(text(),'только с открытыми приемными комиссиями')]/preceding-sibling::div/input");

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn = $x("//i[contains(@class,'s-ico--thm-angle-double-left')]/ancestor::button");  // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn = $x("//div[contains(text(),'1')]/ancestor::button");
    private SelenideElement secondPaginateBtn = $x("//div[contains(text(),'2')]/ancestor::button");
    private SelenideElement thirdPaginateBtn = $x("//div[contains(text(),'3')]/ancestor::button");
    private SelenideElement fourthPaginateBtn = $x("//div[contains(text(),'4')]/ancestor::button");
    private ElementsCollection selectPaginateBtn = $$x("//div[@class = 'sn--row sn--justify-center']/button");
    private SelenideElement nextPaginateBtn = $x("//i[contains(@class,'s-ico--thm-angle-double-right')]/ancestor::button");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public CollegesPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Колледжи"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

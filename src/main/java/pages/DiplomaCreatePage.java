package pages;// Добавление дипломных работ
//  /ru/tko/control/diploma/create

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DiplomaCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Дипломные работы')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                                                   // 'Назад'

    //Dropdown multiselect
    private SelenideElement valuationType = $x("//div[contains(text(),'Вид оценки')]/following-sibling::div/div[@class='sn-field__inner']");      // мультиселект 'Вид оценки'

    private SelenideElement fivePointSystem = $x("//div[contains(text(),'5-бальная система')]");
    private SelenideElement percentageSystem = $x("//div[contains(text(),'Процентная система')]");

    private SelenideElement qualificationsSelectInput = $x("//div[contains(text(),'Квалификация')]/following-sibling::div/div[@class=\"sn-field__inner\"]");      // мультиселект 'Квалификация'

    // Получение списока квалификаций
    private ElementsCollection selectAllQualifications = $$x("//div[@class=\"sn-item__label\"]");

    // Выбрать тестовую квалификацию
    private SelenideElement selectTestQualification = $x("//div[contains(text(),'1013062 - Слесарь по контрольно-измерительным')]");

    // Получение списока групп
    private ElementsCollection selectAllGroups = $$x("//div[contains(text(),'Выберите группы')]/following-sibling::div/div/div");

    // Выбрать тестовую группу КП19-30р, либо любую из списка по индексу
    private SelenideElement selectTestGroup = $x("//div[contains(text(),'Выберите группы')]/following-sibling::div/div/div[1]//button");           // Группа КП19-30р

    // Кнопка Сохранить
    private SelenideElement saveBtn = $x("//div[contains(text(),'Сохранить')]/../..");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public DiplomaCreatePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Дипломные работы"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

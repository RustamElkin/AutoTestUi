package pages;// Редактирование дипломной работы
//  /ru/tko/control/diploma-contingent/375/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DiplomaContingentEditPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Дипломные работы')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                                                              // 'Назад'

    // checkbox, нажав на чекбокс появится  два инпута: Руководитель, Примечание
    private SelenideElement enterManagerManuallyCheckBox = $x("//div[contains(text(),'Ввести руководителя вручную')]/preceding-sibling::div/input");          // 'чекбокс'

    // Инпуты
    private SelenideElement fullNameManagerInput = $x("//div[contains(text(),'Руководитель')]/following-sibling::div//input");       // 'Руководитель'
    private SelenideElement notationInput = $x("//div[contains(text(),'Примечание')]/following-sibling::div//input");                // 'Примечание'

    private SelenideElement thesisTopicInput = $x("//div[contains(text(),'Тема дипломной работы')]/following-sibling::div//input");  // 'Тема дипломной работы'
    private SelenideElement protectionDateInput = $x("//div[contains(text(),'Дата защиты')]/following-sibling::div//input");         // 'Дата защиты'

    // dropdown list
    private SelenideElement selectHeadOfTheThesis = $x("//span[@aria-labelledby='select2-year-0y-container']");

    // Получение списока Руководителей
    private ElementsCollection selectHeadOfTheThesisList = $$x("//div[@class=\"q-virtual-scroll__content\"]/div");

    // checkbox 'Поставить оценку', нажав на чекбокс появится  инпут: 'Оценка'
    private SelenideElement rateCheckBox = $x("//div[contains(text(),'Поставить оценку')]/preceding-sibling::div//input");          // чекбокс 'Поставить оценку'

    // Инпут 'Оценка'
    private SelenideElement rateInput = $x("//div[contains(text(),'Оценка')]/following-sibling::div//input");                       // 'Примечание'

    // Кнопка "Сохранить"
    private SelenideElement saveBtn = $x("//div[contains(text(),'Сохранить')]/../..");                                              // 'Сохранить'

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public DiplomaContingentEditPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Дипломные работы"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

















}

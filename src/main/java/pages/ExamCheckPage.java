package pages;// Экзамен (просмотр определенного экзамена, который можно завершить)
//  /ru/tko/control/exams/36175

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ExamCheckPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Экзамены')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                        // 'Назад'

    // Ссылка на просмотр приемной комиссии
    private SelenideElement viewAdmissionsOffice = $x("//td[contains(text(),'Журнал')]/..//a");                         // 'Просмотр журнала'

    // Кнопка "Завершить экзамен"
    private SelenideElement completeExamBtn = $x("//a[contains(text(),'Завершить экзамен')]");                          // 'Завершить экзамен'

    // Таблица участников (студентов)
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                          // 'ФИО'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                                         // 'Статус'
    private SelenideElement creativeExamResultTable = $x("//th[contains(text(),'Результат творческого экзамена')]");     // 'Результат творческого экзамена'

    // Кнопка "Проверить" в таблице. Просмотр проверенного экзамена. Привязался по строке tr[3]
    private SelenideElement viewExamBtn = $x("//tr[3]/td//a[@title='Проверить']");                                     // 'Завершить экзамен'

    // Привязался по статусу "Проверен"
    //td[contains(text(),'Проверен')]/following-sibling::td//a[@title='Проверить']

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ExamCheckPage checkTitlesToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Экзамены"));
        backTab.shouldBe(Condition.visible);
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }







}

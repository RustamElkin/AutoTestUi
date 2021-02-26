package pages;// Гос. услуги_Заявки с внешних сервисов_Необработанные
//  /ru/tko/control/external-statements

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ExternalStatementsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявки с внешних сервисов')]");

    // Табы на странице
    private SelenideElement unprocessedTab = $x("//span[contains(text(),'Необработанные')]/..");           // 'Необработанные'
    private SelenideElement processedTab = $x("//span[contains(text(),'Обработанные')]/..");               // 'Обработанные'

    // Таблица (Можно проверить есть ли таблица)
    private SelenideElement numberTable = $x("//th[contains(text(),'№')]");                                // '№'
    private SelenideElement dateAddedTable = $x("//th[contains(text(),'Дата добавления')]");               // 'Дата добавления'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                            // 'ФИО'
    private SelenideElement statusTable = $x("//th[contains(text(),'Статус')]");                           // 'Статус'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                     // 'Операции'

    // Кнопка в таблице, колонка "Операции", первая строка
    private SelenideElement viewBtn = $x("(//a[@class = 's-btn-table'])[1]");                              // Кнопка "Посмотреть"
    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");



    public ExternalStatementsPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Заявки с внешних сервисов"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

package pages;// Документооборот
//  /ru/tko/document-flow/statements/109

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ViewDocumentFlowStatementPage {

    // Тайтл
    private SelenideElement titleToPage                    = $x("//h1[contains(text(),'Входящие заявки')]");

    // Табы на странице
    private SelenideElement backToTab                      = $x("//span[contains(text(),'Назад')]/..");
    private SelenideElement informationTab                 = $x("//a[contains(text(),'Информация')]");          // 'Информация'
    private SelenideElement historyTab                     = $x("//a[contains(text(),'История изменения')]");   // 'История изменения'

    // Тайтлы в таблицах
    private SelenideElement personnelInfo                  = $x("//h3[contains(text(),'Общие сведения')]");     // 'Общие сведения'
    private SelenideElement documents                      = $x("//h3[contains(text(),'Документы')]");          // 'Документы'


    // Просмотр приложенных документов
    private SelenideElement applicationForANewComputerView = $x("//td[contains(text(),'Заявка на выдачу нового компьютера')]/following-sibling::td/div//button");
    private SelenideElement identityCardView               = $x("//td[contains(text(),'Удостоверение')]/following-sibling::td/div//button");

    // Кнопки
    private SelenideElement approveBtn                     = $x("//a[@data-action = 'confirm' and @data-method = 'POST']");
    private SelenideElement sentForRevisionBtn             = $x("//a[@data-toggle = 'modal' and contains(text(), 'Отправить на доработку')]");

    private SelenideElement mainPageLink                   = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ViewDocumentFlowStatementPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Входящие заявки"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

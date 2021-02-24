package pages;// График занятий
//  /ru/tko/control/org-education-time-group

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrgEducationTimeGroupPage {

    // Тайтл
    private SelenideElement titleToPage     = $x("//h1[contains(text(),'График занятий')]");

    // Табы на странице
    private SelenideElement backTab         = $x("//span[contains(text(),'Назад')]/..");                    // 'Организация'

    // Таблица
    private SelenideElement numberOnTable   = $x("//th[contains(text(),'№')]");                             //'№'
    private SelenideElement fullNameTable   = $x("//th[contains(text(),'Название')]");                      //'Название'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                      //'Операции'

    // Таблица операции
    private ElementsCollection viewBtn      = $$x("//a[@title='Просмотреть']");                             // Кнопка просмотра
    private ElementsCollection editBtn      = $$x("//span[contains(@class, 's-ico--thm-pencil')]/..");      // Кнопка редактировать
    private ElementsCollection deleteBtn    = $$x("//a[@data-action='confirm' and @data-method='DELETE']"); // Кнопка удалить

    // Кнопка "Добавить"
    private SelenideElement addBtn          = $x("//div[contains(text(),'Добавить')]");                     // 'Добавить'

    private SelenideElement mainPageLink    = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");

    public OrgEducationTimeGroupPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("График занятий"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

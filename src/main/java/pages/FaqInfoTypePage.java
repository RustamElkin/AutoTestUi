package pages;// Прием документов в организации
//  /ru/tko/colleges/faq/info?type=6

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class FaqInfoTypePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//div[@class='s-title-head'] [contains(text(),'Прием документов в ')]");

    // Кнопка "Заказать услугу онлайн"
    private SelenideElement orderTheServiceOnlineBtn = $x("//span[contains(text(),'Заказать услугу онлайн')]/..");

    // Часто задаваемые вопросы faqAnswer

    private SelenideElement paymentProcedureFaqAnswer = $x("//div[contains(text(),'Стоимость услуги и порядок оплаты')]/..");
    private SelenideElement serviceResultFaqAnswer = $x("//div[contains(text(),'Результат оказания услуги')]/..");
    private SelenideElement whenSubmitAnApplicationFaqAnswer = $x("//div[contains(text(),'Когда можно подавать заявление?')]/..");
    private SelenideElement digitalSignatureForSubmittingFaqAnswer = $x("//div[contains(text(),'Нужно ли ЭЦП для подачи заявления?')]/..");
    private SelenideElement serviceRecipientsFaqAnswer = $x("//div[contains(text(),'Получатели услуг')]/..");

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public FaqInfoTypePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Прием документов в организации технического и профессионального, послесреднего образования"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

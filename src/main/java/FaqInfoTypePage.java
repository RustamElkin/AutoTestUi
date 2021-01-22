// Прием документов в организации
//  /ru/tko/colleges/faq/info?type=6

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FaqInfoTypePage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//div[@class=\"s-title-head\"] [contains(text(),'Прием документов в ')]"));

    // Кнопка "Заказать услугу онлайн"
    private SelenideElement orderTheServiceOnlineBtn = $(byXpath("//span[contains(text(),'Заказать услугу онлайн')]/.."));

    // Часто задаваемые вопросы faqAnswear

    private SelenideElement paymentProcedureFaqAnswear = $(byXpath("//div[contains(text(),'Стоимость услуги и порядок оплаты')]/.."));
    private SelenideElement serviceResultFaqAnswear = $(byXpath("//div[contains(text(),'Результат оказания услуги')]/.."));
    private SelenideElement whenSubmitAnApplicationFaqAnswear = $(byXpath("//div[contains(text(),'Когда можно подавать заявление?')]/.."));
    private SelenideElement digitalSignatureForSubmittingFaqAnswear = $(byXpath("//div[contains(text(),'Нужно ли ЭЦП для подачи заявления?')]/.."));
    private SelenideElement serviceRecipientsFaqAnswear = $(byXpath("//div[contains(text(),'Получатели услуг')]/.."));


}

package pages;
// Блог
//  /ru/tko/organization-posts

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationPostsPage {

    // Тайтл
    private SelenideElement titleToPage                    = $x("//h1[contains(text(),'Блог')]");

    // Табы на странице
    private SelenideElement blogTab                        = $x("//span[contains(@class,'s-str-ico--thm-archive')][contains(text(),'Блог')]/..");                      // 'Блог'
    private SelenideElement questionAnswerTab              = $x("//span[contains(@class,'s-str-ico--thm-comments')][contains(text(),'Вопрос-ответ')]/..");   // 'Вопрос-ответ'

    // Кнопка "Добавить вопрос"
    private SelenideElement addQuestionBtn                 = $x("//span[contains(text(),'Добавить пост')]/..");

    // Секции с комментариями
    private ElementsCollection selectQuestionSectionByName = $$x("//section/div[@class='s-panel mb-30']/h4");

    // Кнопки
    private  ElementsCollection editBtn                    = $$x("//span[contains(@class,'s-ico--thm-pencil')]/..");                                               // 'Редактировать'
    private  ElementsCollection deleteBtn                  = $$x("//span[contains(@class,'s-ico--thm-close')]/..");                                              // 'Удалить'

    // Ссылка секции с ответами
    private SelenideElement postLink                       = $x("//a[@class='s-blog__post-link' or contains(text(),'Читать далее')]");                              // 'Читать далее'

    private SelenideElement mainPageLink                   = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public OrganizationPostsPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Блог"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

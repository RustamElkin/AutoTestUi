package pages;// Блог_Вопрос-ответ
//  /ru/tko/organization-issues

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationIssuesPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вопрос-ответ')]");

    // Табы на странице
    private SelenideElement blogTab = $x("//span[contains(@class,'s-str-ico--thm-archive')][contains(text(),'Блог')]/..");                      // 'Блог'
    private SelenideElement questionAnswerTab = $x("//span[contains(@class,'s-str-ico--thm-comments')][contains(text(),'Вопрос-ответ')]/..");   // 'Вопрос-ответ'

    // Кнопка "Добавить вопрос"
    private SelenideElement addQuestionBtn = $x("//a[contains(text(),'Добавить вопрос')]");

    // Секции с вопросами
    private ElementsCollection selectQuestionSectionByName = $$x("//section/div[@class=\"s-panel mb-30\"]/h4");

    // Кнопки "Ответить"
    private  ElementsCollection answerToBtn = $$x("//div[contains(@class,'s-panel mb-30')]//button[contains(text(),'Ответить')]");

    // Textarea - Поле для ответа
    private  ElementsCollection answerTextArea = $$x("//div[@class='s-panel mb-30']//textarea");

    // Кнопки "Отправить"
    private  ElementsCollection submitBtn = $$x("//div[contains(@class,'s-panel mb-30')]//button[contains(text(),'Отправить')][@type='submit']");

    // Посмотреть секции с ответами
    private ElementsCollection commentsShowLinks = $$x("//section//a[@class='s-blog__post-link']");

    // Скрыть секции с ответами
    private ElementsCollection commentsHideLinks = $$x("//section//a[@class='s-blog__post-link hidden']");

}

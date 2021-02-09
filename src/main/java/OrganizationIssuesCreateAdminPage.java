// Блог_Добавить вопрос
// Админ
//  /ru/shy/organization-issues/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OrganizationIssuesCreateAdminPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вопрос-ответ')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Назад')]/..");                                // 'Назад'

    // Input textarea
    private SelenideElement textAreaInput = $x("// label[contains(text(),'Вопрос')]//following-sibling::textarea"); // 'Вопрос'

    // Кнопка "Отправить"
    private SelenideElement submitBtn = $x("//span[contains(text(),'Отправить')]/..");                              // 'Отправить'




}

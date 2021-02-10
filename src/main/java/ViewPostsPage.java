// Просмотр поста
//  /ru/tko/organization-posts/90

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewPostsPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Блог')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                                     // 'Назад'

    // Кнопки
    private  ElementsCollection editBtn = $$x("//span[contains(@class,'s-ico--thm-pencil')]/..");                                        // 'Редактировать'
    private  ElementsCollection deleteBtn = $$x("//span[contains(@class,'s-ico--thm-close')]/..");                                       // 'Удалить'

    // Ссылка с правилами комментирования
    private SelenideElement postLink = $x("//a[contains(@class,'s-blog__post-link') or contains(text(),'правилами комментирования')]");  // 'правила комментирования'

    // Кнопка "Отправить"
    private SelenideElement submitBtn = $x("//span[contains(text(),'Отправить')]/..");

    // Добавления комментария
    private SelenideElement addComment = $x("//textarea[@placeholder='Добавить комментарий...' or @class='s-form__textarea mb-20']");    // 'Добавить комментарий'




}

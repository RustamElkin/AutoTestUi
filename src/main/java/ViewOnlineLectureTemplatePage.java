// Дистанционное обучение_Просмотр онлайн лекции
//  /ru/tko/control/online-lectures/25956

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ViewOnlineLectureTemplatePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Шаблоны заданий')]");

    // Табы на странице
    private SelenideElement fullListTab = $x("//span[contains(text(),'Назад')]/..");                       // 'Назад'

    // Таблица
    private SelenideElement nameTable = $x("//td[@class=\"s-table__col--to-right\"][contains(text(),'Название')]/following-sibling::td");                                // 'Название'

    private ElementsCollection attachedImageFilesList = $$x("//td[contains(text(),'Вложенные файлы')]/../following-sibling::tr//a[contains(text(),'Просмотреть')]");     // 'Вложенные картинки'
    private ElementsCollection attachedFilesList = $$x(" //td[contains(text(),'Вложенные файлы')]/../following-sibling::tr//a");                                         // 'Вложенные файлы'





}

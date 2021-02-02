// Библиотека
// /ru/tko/library

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

class LibraryPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Библиотека')]");

    // Кнопка
    private SelenideElement downloadBookBtn = $x("//div[@class=\"college-library-upload-btn\"]/button");   // кнопка 'Загрузить книгу'

    /////////// Модалка
    // Input-ы
    private SelenideElement bookNameInput = $x("//input[@aria-label='Название книги']");                   // Инпут 'Название книги'
    private SelenideElement authorInput = $x("//input[@aria-label='Автор']");                              // Инпут 'Автор'
    private SelenideElement yearOfIssueInput = $x("//input[@aria-label='Год выпуска']");                   // Инпут 'Год выпуска'
    private SelenideElement descriptionInput = $x("//div[contains(text(),'Описание')]/following-sibling::div[@role=\"application\"]//div[@role=\"textbox\"]");              // Инпут 'Описание'

    // dropdown elements
    private ElementsCollection bookTypeList = $$x("//div[contains(@class,'sn-item--clickable')]");
    // Либо каждый "Тип книги" отдельно
    private SelenideElement imaginativeLiteratureSelect= $x("//div[contains(@class,'sn-item--clickable')]//div[contains(text(),'Художественная литература')]");             // 'Художественная литература'
    private SelenideElement scientificLiteratureSelect= $x("//div[contains(@class,'sn-item--clickable')]//div[contains(text(),'Научная литература')]");                     // 'Научная литература'
    private SelenideElement trainingAndMetodologyComplexSelect= $x("//div[contains(@class,'sn-item--clickable')]//div[contains(text(),'Учебно-методический комплекс')]");   // 'Учебно-методический комплекс'

    private SelenideElement  professionInner = $x("//div[contains(text(),'Профессия:')]/following-sibling::div/div");         // кликаем на поле
    private ElementsCollection professionList = $$x("//div[@class='sn-item__label']");                                        // Список профессий, фильтруем по названию
    // //div[@class="sn-item__label"][contains(text(),'1114000 Сварочное дело (по видам)')]

    // Checkbox
    private SelenideElement allowStudentsToViewCheckBox = $x("//div[contains(text(),'Разрешить просматривать студентам')]//preceding-sibling::div[contains(@class,'checkbox')]");  // чекбокс 'Разрешить просматривать студентам'
    private SelenideElement thirdPartySourceCheckBox = $x("//div[contains(text(),'Сторонний источник')]//preceding-sibling::div[contains(@class,'checkbox')] ");                   // чекбокс 'Сторонний источник'

    // Инпут "ссылка на книгу"
    private SelenideElement bookLinkInput = $x("//div[contains(text(),'Ссылка на книгу')]//following-sibling::div");         // 'Ссылка на книгу'

    // Кнопки в модалке
    private SelenideElement loadBookBtn = $x("//span[contains(text(),'Загрузить книгу')]/../following-sibling::input");      // 'Загрузить книгу'
    private SelenideElement loadCoverBtn = $x("//span[contains(text(),'Загрузить обложку')]/../following-sibling::input");   // 'Загрузить обложку'
    private SelenideElement submitBtn = $x("//button[@type='submit'][contains(@class,'sn-btn--rectangle s-b-green')]");      // 'Отправить'

    // Табы при подробном просмотре книги на странице
    private SelenideElement openTab = $x("//div[contains(text(),'Назад')]/..");                                               // 'Назад'

    // Фильтр

}

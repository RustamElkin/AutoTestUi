// Создание группы экзаменационных билетов
//  /ru/tko/control/exam-ticket-groups/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamTicketGroupsCreatePage {

    // Тайтл
    private SelenideElement titleToPage                 = $x("//h1[contains(text(),'Создание группы экзаменационных билетов')]");

    // Инпуты.  Вбить свое или сделать клик чтоб выбрать из списка
    private SelenideElement nameInput                   = $x("//label[contains(text(),'Название')]/following-sibling::input");                                         // 'Название'
    private SelenideElement subjectsInput               = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                                     // 'Предмет'
    private SelenideElement languageEducationInput      = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div//input");                               // 'Язык обучения'
    private SelenideElement additionalTeacherInput      = $x("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div//input");                          // 'Доп. преподаватели'

    // dropdown list. Кликнув на div в котором завернут инпут, выпадает список
    private SelenideElement subjectsDropdown            = $x("//label[contains(text(),'Предмет')]/following-sibling::div[@class='multiselect mb-10']");                // 'Предмет'
    private SelenideElement languageEducationDropdown   = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div[@class='multiselect mb-10']");          // 'Язык обучения'
    private SelenideElement additionalTeacherDropdown   = $x("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div[@class='multiselect mb-10']");     // 'Доп. преподаватели'


    // Список предметов в div[3], выбрать предмет можно указав li[] или по тексту в span[contains(text(),'Казахский язык')]
    // Если предмет повторяется, лучше указывать li[] или брать все в скобки и добавив квадратные, в них указывать индекс

    // Список предметов.    В пропертях li есть innerText: "Русский язык ", textContent: "Русский язык ". Фильтровать используя проперти.
    private ElementsCollection subjectList              = $$x("//label[contains(text(),'Предмет')]/following-sibling::div[@class='multiselect mb-10']//span/span");

    // Выбор определенного предмета
    private SelenideElement selectSubjectsInDropdown    = $x("//label[contains(text(),'Предмет')]/following-sibling::div[@class='multiselect mb-10']//span/span[contains(text(),'Казахский язык')]");

    // Список 'Язык обучения'
    private ElementsCollection languagesEducationList   = $$x("//label[contains(text(),'Язык обучения')]/following-sibling::div[@class='multiselect mb-10']//span/span");

    // Выбор определенного языка обучения
    private SelenideElement selectLanguageEducationInDropdown = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div[@class='multiselect mb-10']//span/span[contains(text(),'русский')]");

    // Список 'Доп. преподаватели'
    private ElementsCollection additionalTeachersList   = $$x("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div[@class='multiselect mb-10']//span/span");

    // Выбор определенного преподавателя
    private SelenideElement selectAdditionalTeacherInDropdown = $x("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div[@class='multiselect mb-10']//span/span[contains(text(),'Алтаев Абит Уристемович')]");


    // Валидация error message (на деве нет переводов. чекнуть перед написанием тестов)
    private SelenideElement emptyNameInput              = $x("//div[contains(text(),'Название')]");
    private SelenideElement emptySubjectsInput          = $x("//div[contains(text(),'Дисциплина')]");
    private SelenideElement emptyLanguageEducationInput = $x("//div[contains(text(),'Язык обучения')]");


    // Кнопки
    private SelenideElement cancelBtn                   = $x("//div[@class='col-12 col-sm-auto mb-20']/a[contains(text(),'Отмена')]");
    private SelenideElement saveBtn                     = $x("//span[contains(text(),'Сохранить')]/..");


}

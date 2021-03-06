package pages;// Редактирование информаций по экзаменационным билетам
//  /ru/tko/control/exam-ticket-groups/5545/edit

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ExamTicketGroupsEditPage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Редактирование экзаменационных билетов')]");

    // Инпуты. При редактировании очистить, после вбить свое или сделать клик чтоб выбрать из списка
    private SelenideElement nameInput = $x("//label[contains(text(),'Название')]/following-sibling::input");                                // 'Название'
    private SelenideElement subjectsInput = $x("//label[contains(text(),'Предмет')]/following-sibling::div//input");                        // 'Предмет'
    private SelenideElement languageEducationInput = $x("//label[contains(text(),'Язык обучения')]/following-sibling::div//input");         // 'Язык обучения'
    private SelenideElement additionalTeacherInput = $x("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div//input");    // 'Доп. преподаватели'


    // dropdown list. Кликнув на инпут выпадают списки

    // Список предметов в div[3], выбрать предмет можно указав li[] или по тексту в span[contains(text(),'Казахский язык')]
    // Если предмет повторяется, лучше указывать li[] или брать все в скобки и добавив квадратные, в них указывать индекс

    // Список предметов.    В пропертях li есть innerText: "Русский язык ", textContent: "Русский язык ". Фильтровать используя проперти.
    private ElementsCollection subjectList = $$x("//form/div[3]//li");

    // Выбор определенного предмета
    private SelenideElement selectSubjectsInDropdown = $x("//form/div[3]//li[1]/span/span[contains(text(),'Казахский язык')]");

    // Список выбранных предметов
    private ElementsCollection selectedSubjectsList= $$x("//form/div[3]//span[@class='multiselect__tag']");

    // Удаление опеределенного предмета, по индексу или по названию
    private SelenideElement selectedSubjectDelete = $x("//form/div[3]//span[@class='multiselect__tag']/span[contains(text(),'История Казахстана')]");

    // Список 'Язык обучения'
    private ElementsCollection languagesEducationList = $$x("//form/div[4]//li");

    // Выбор определенного языка обучения
    private SelenideElement selectLanguageEducationInDropdown = $x("//form/div[4]//li[5]/span/span[contains(text(),'корейский')]");

    // Список 'Доп. преподаватели'
    private ElementsCollection additionalTeachersList = $$x("//form/div[5]//li");

    // Выбор определенного преподавателя из списка
    private SelenideElement selectAdditionalTeacherInDropdown = $x("//form/div[5]//li[1]/span/span[contains(text(),'Алтаев Абит Уристемович')]");

    // Список выбранных преподавателей
    private ElementsCollection selectedTeachersList= $$x("//form/div[5]//span[@class='multiselect__tag']");

    // Удаление опеределенного преподавателя, по индексу или по названию
    private SelenideElement selectedTeacherDelete = $x("//form/div[5]//span[@class='multiselect__tag']/span[contains(text(),'Андамасов Балтабай Алмуратович')]");


    // Валидация error message (на деве нет переводов. чекнуть перед написанием тестов)
    private SelenideElement emptyNameInput = $x("//div[contains(text(),'Название\" обязательно для заполнения')]");
    private SelenideElement emptySubjectsInput = $x("//div[contains(text(),'Дисциплина\" обязательно для заполнения')]");
    private SelenideElement emptyLanguageEducationInput = $x("//div[contains(text(),'Язык обучения\" должно быть целым числом')]");


    // Кнопки
    private SelenideElement cancelBtn= $x("//div[@class='col-12 col-sm-auto mb-20']/a[contains(text(),'Отмена')]");
    private SelenideElement saveBtn= $x("//span[contains(text(),'Сохранить')]/..");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public ExamTicketGroupsEditPage checkElementsToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Редактирование экзаменационных билетов"));
        cancelBtn.shouldBe(Condition.visible);
        saveBtn.shouldBe(Condition.visible);
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

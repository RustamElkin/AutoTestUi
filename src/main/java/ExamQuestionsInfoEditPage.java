// Редактирование информаций по экзаменационным вопросам
//  /ru/tko/exam-questions/111/edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ExamQuestionsInfoEditPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Создание группы экзаменационных вопросов')]"));

    // Инпуты. При редактировании очистить, после вбить свое или сделать клик чтоб выбрать из списка
    private SelenideElement nameInput = $(byXpath("//label[contains(text(),'Название')]/following-sibling::input"));                                // 'Название'
    private SelenideElement subjectsInput = $(byXpath("//label[contains(text(),'Предмет')]/following-sibling::div//input"));                        // 'Предмет'
    private SelenideElement languageEducationInput = $(byXpath("//label[contains(text(),'Язык обучения')]/following-sibling::div//input"));         // 'Язык обучения'
    private SelenideElement additionalTeacherInput = $(byXpath("//label[contains(text(),'Доп. преподаватели')]/following-sibling::div//input"));    // 'Доп. преподаватели'


    // dropdown list. Кликнув на инпут выпадают списки

    // Список предметов в div[3], выбрать предмет можно указав li[] или по тексту в span[contains(text(),'Казахский язык')]
    // Если предмет повторяется, лучше указывать li[]

    // Список предметов
    // form/div[3]//li/span/span

    // Выбор определенного предмета
    private SelenideElement selectSubjectsInDropdown = $(byXpath("//form/div[3]//li[1]/span/span[contains(text(),'Казахский язык')]"));


    // Список 'Язык обучения'
    //form/div[4]//li/span/span

    // Выбор определенного языка обучения
    private SelenideElement selectLanguageEducationInDropdown = $(byXpath("//form/div[4]//li[5]/span/span[contains(text(),'корейский')]"));


    // Список 'Доп. преподаватели'
    //form/div[5]//li/span/span

    // Выбор определенного преподавателя
    private SelenideElement selectAdditionalTeacherInDropdown = $(byXpath("//form/div[5]//li[1]/span/span[contains(text(),'Алтаев Абит Уристемович')]"));


    // Валидация error message
    private SelenideElement emptyNameInput = $(byXpath("//div[contains(text(),'Название\" обязательно для заполнения')]"));
    private SelenideElement emptySubjectsInput = $(byXpath("//div[contains(text(),'Дисциплина\" обязательно для заполнения')]"));
    private SelenideElement emptyLanguageEducationInput = $(byXpath("//div[contains(text(),'Язык обучения\" должно быть целым числом')]"));


    // Кнопка "Отмена"
    private SelenideElement cancelBtn= $(byXpath("//div[@class='col-12 col-sm-auto mb-20']/a[contains(text(),'Отмена')]"));
    private SelenideElement saveBtn= $(byXpath("//span[contains(text(),'Сохранить')]/.."));

}

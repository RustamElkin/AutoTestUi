// Ответ студента_тестирование
//  /ru/tko/5870/ticket-assignment/106/check

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class TicketAssignmentCheckPage {

    // Тайтлы
    private SelenideElement studentAnswer = $x("//h3/span[text() = ' Ответ ']");
    private SelenideElement checking = $x("//h3/span[text() = ' Оценивание ']");

    // ФИО и группа на билете
    private SelenideElement studentFullName = $x("//div[@class = 's-test-process__center-username']");
    private SelenideElement group = $x("//div[@class = 's-test-process__group']");

    // Вложенные файлы студентом. Файлы открываются в отдельном окне.
    private ElementsCollection studentAttachments = $$x("//div[@class = 'row']//a[@target = '_blank' and contains(@class, 's-b-orange')]");    // далее поиск byText (например: "Вложение 1")

    // Оценивание
    private SelenideElement examResult = $x("//input[@aria-label = 'Оценка (Процентная)']");

    // Growl-message
    private SelenideElement errorMessage =$x("//div[@class = 'growl-message' and contains(text(), 'Поле \"Оценка\" не может быть более 100')]");

    // Объяснение оценки
    private SelenideElement evaluationExplanationTextArea = $x("//div[@role = 'textbox' and @aria-label = 'Редактор, main']");

    // Кнопки
    private SelenideElement backBtn = $x("//div[text() = 'Вернуться назад']/ancestor::a[contains(@class, 's-b-grey')]");
    private SelenideElement saveBtn = $x("//div[text()='Сохранить']/ancestor::button[contains(@class, 's-b-blue')]");

    // Кнопки в модалке
    private SelenideElement closeBtn = $x("//div[@class='sn-modal__close']");
    private SelenideElement cancelBtn = $x("//div[text()='Отмена']/ancestor::button[contains(@class, 's-b-grey')]");
    private SelenideElement approveBtn = $x("//div[text()='Подтвердить']/ancestor::button[contains(@class, 's-b-blue')]");


}

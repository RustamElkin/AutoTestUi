// Просмотр и редактирование экзаменационных билетов
//  /ru/tko/control/exam-ticket-groups/43

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExamTicketsEditPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Редактирование экзаменационных билетов')]");


    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                           // 'Назад'

    // Кнопки
    private SelenideElement createTicketBtn = $x("//div[contains(text(),'Добавить билет')]/../..");        // 'Добавить билет'
    // можно просто по button в properties textContent: " Добавить билет"

    // Кнопки при создании нового билета
    private SelenideElement cancelTicketChangeBtn = $x("//button[@type=\"button\"]//i[@class=\"s-ico--thm-close s-ico\"]/../..");    // 'Отменить изменение билета'
    private SelenideElement saveNewTicketBtn = $x("//button[@type=\"submit\"]//i[@class=\"s-ico--thm-check s-ico\"]/../..");         // 'Сохранить билет'

    private SelenideElement deleteTicketBtn = $x("(//button[@type=\"button\"]//i[@class=\"s-ico--thm-trash s-ico\"]/../..)[1]");     // 'Удалить билет' Удаляю по индексу

    // Кнопка редактирования билета
    private SelenideElement editTicketBtn = $x("(//button[@type=\"button\"]//i[@class=\"s-ico--thm-pencil s-ico\"]/../..)[1]");       // 'Редактировать билет'  Редактирую по индексу

    // Нажав редактировать появляется дополнительно две кнопки: Отменить, Сохранить билет.

    private SelenideElement undoChangeTicketBtn = $x("//button[@type=\"button\"]//i[@class=\"s-ico--thm-close s-ico\"]/../..");      // 'Отменить изменение билета'
    private SelenideElement saveTicketBtn = $x("//button[@type=\"submit\"]//i[@class=\"s-ico--thm-check s-ico\"]/../..");            // 'Сохранить билет'

    // Инпуты

    // Название билета, при добавлении нового
    private SelenideElement nameInput = $x("//input[@placeholder='Название билета']");                                                // 'Название билета'

    // TextAreaInput Задание. При создании и редактировании один инпут
    private SelenideElement taskAreaInput = $x("//div[@role='textbox']");                                                             // 'Задание'

}

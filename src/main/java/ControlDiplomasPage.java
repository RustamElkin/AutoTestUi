import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Дипломные работы
//  /ru/tko/control/diplomas

public class ControlDiplomasPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Дипломные работы')]");

    // Кнопка "Добавить"
    private SelenideElement addBtn = $x("//div[contains(text(),'Добавить')]/..");

    // Input "Поиск"
    private SelenideElement searchInput = $x("//input[@placeholder=\"Поиск\"]");

    // Кнопка "Полноэкранный режим"
    private SelenideElement fullscreenBtn = $x("//i[@class=\"s-ico--thm-fullscreen s-ico\"]/../..");

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                    // '№'
    private SelenideElement fullNameTable = $x("//th[contains(text(),'ФИО')]");                                  // 'ФИО'
    private SelenideElement groupTable = $x("//th[contains(text(),'Группа')]");                                  // 'Группа'
    private SelenideElement themeTable = $x("//th[contains(text(),'Тема')]");                                    // 'Тема'
    private SelenideElement headOfTheThesisTable = $x("//th[contains(text(),'Руководитель дипломной работы')]"); // 'Руководитель дипломной работы'
    private SelenideElement protectionDateTable = $x("//th[contains(text(),'Дата защиты ')]");                   // 'Дата защиты'
    private SelenideElement assessmentTable = $x("//th[contains(text(),'Оценка')]");                             // 'Оценка'
    private SelenideElement operationsTable = $x("//th[contains(text(),'Операции')]");                           // 'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $x("//tr[1]/td[8]//a//i[@class=\"s-ico--thm-eye s-ico\"]/../..");          // Первая кнопка просмотра
    private SelenideElement editBtn = $x("//tr[1]/td[8]//a//i[@class=\"s-ico--thm-pencil s-ico\"]/../..");       // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $x("//tr[1]/td[8]//button");                                             // Кнопка "Удалить"



}

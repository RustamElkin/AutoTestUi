import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

// Дипломные работы
//  /ru/tko/control/diplomas

public class ControlDiplomasPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Дипломные работы')]"));

    // Кнопка "Добавить"
    private SelenideElement addBtn = $(byXpath("//div[contains(text(),'Добавить')]/.."));

    // Input "Поиск"
    private SelenideElement searchInput = $(byXpath("//input[@placeholder=\"Поиск\"]"));

    // Кнопка "Полноэкранный режим"
    private SelenideElement fullscreenBtn = $(byXpath("//i[@class=\"s-ico--thm-fullscreen s-ico\"]/../.."));

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   //'№'
    private SelenideElement fullNameTable = $(byXpath("//th[contains(text(),'ФИО')]"));                                 //'ФИО'
    private SelenideElement groupTable = $(byXpath("//th[contains(text(),'Группа')]"));                                 //'Группа'
    private SelenideElement themeTable = $(byXpath("//th[contains(text(),'Тема')]"));                                   //'Тема'
    private SelenideElement headOfTheThesisTable = $(byXpath("//th[contains(text(),'Руководитель дипломной работы')]"));//'Руководитель дипломной работы'
    private SelenideElement protectionDateTable = $(byXpath("//th[contains(text(),'Дата защиты ')]"));                  //'Дата защиты'
    private SelenideElement assessmentTable = $(byXpath("//th[contains(text(),'Оценка')]"));                            //'Оценка'
    private SelenideElement operationsTable = $(byXpath("//th[contains(text(),'Операции')]"));                          //'Операции'

    // Кнопки в таблице, колонка "Операции"
    private SelenideElement viewBtn = $(byXpath("//tr[1]/td[8]//a//i[@class=\"s-ico--thm-eye s-ico\"]/../.."));         // Первая кнопка просмотра
    private SelenideElement editBtn = $(byXpath("//tr[1]/td[8]//a//i[@class=\"s-ico--thm-pencil s-ico\"]/../.."));      // Кнопка "Редактировать"
    private SelenideElement deleteBtn = $(byXpath("//tr[1]/td[8]//button"));                                            // Кнопка "Удалить"



}

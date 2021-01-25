import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// Итоги
//  /ru/tko/control/summary
public class ControlSummaryPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Итоги')]");

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $x("//span[contains(text(),'Фильтрация списка')]/..");                                    // 'Фильтрация списка'
    private SelenideElement applyBtn = $x("//span[contains(text(),'Применить')]/..");                                                    // 'Применить'
    private SelenideElement resetBtn = $x("//span[contains(text(),'Сбросить')]/..");                                                     // 'Сбросить'

    //Фильтр Инпуты
    private SelenideElement groupFilter= $x("//label[contains(text(),'Группа: ')]/following-sibling::input");                            // "Группа"

    //Dropdown фильтры
    private SelenideElement selectQualificationDropDownList = $x("//label[contains(text(),'Квалификация')]/following-sibling::div");     // "Квалификация"
    private SelenideElement courseFilter= $x("//label[contains(text(),'Курс: ')]/following-sibling::div");                               // "Курс"
    private SelenideElement languageEducationDropDownList = $x("//label[contains(text(),'Язык обучения: ')]/following-sibling::div");    // "Язык обучения"
    private SelenideElement curatorDropDownList = $x("//label[contains(text(),'Куратор: ')]/following-sibling::div");                    // "Куратор"                                         // "Куратор"

    // Таблица
    private SelenideElement numberOnTable = $x("//th[contains(text(),'№')]");                                                            // '№'
    private SelenideElement groupOnTable= $x("//th[contains(text(),'Группа')]");                                                         // 'Группа'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                                            // 'Квалификация'
    private SelenideElement courseTable = $x("//th[contains(text(),'Курс')]");                                                           // 'Курс'
    private SelenideElement languageEducationTable = $x("//th[contains(text(),'Язык обучения')]");                                       // 'Язык обучения'
    private SelenideElement numberOfStudentsTable = $x("//th[contains(text(),'Количество учащихся')]");                                  // 'Количество учащихся'
    private SelenideElement curatorTable = $x("//th[contains(text(),'Куратор')]");                                                       // 'Куратор'
    private SelenideElement operationsOnTable = $x("//th[contains(text(),'Операции')]");                                                 // 'Операции'

    // Кнопки пагинации
    private SelenideElement backPaginateBtn =$x("//a[contains(text(),'‹')]");                                   //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn =$x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn =$x("//a[contains(text(),'2')]");
    private SelenideElement nextPaginateBtn =$x("//a[contains(text(),'›')]");

}

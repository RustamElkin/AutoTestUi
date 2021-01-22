import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

// Итоги
//  /ru/tko/control/summary
public class ControlSummaryPage {

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Итоги')]"));

    // Кнопки для фильтра
    private SelenideElement filteringListBtn = $(byXpath("//span[contains(text(),'Фильтрация списка')]/.."));           // 'Фильтрация списка'
    private SelenideElement applyBtn = $(byXpath("//span[contains(text(),'Применить')]/.."));                           // 'Применить'
    private SelenideElement resetBtn = $(byXpath("//span[contains(text(),'Сбросить')]/.."));                            // 'Сбросить'

    //Фильтр Инпуты
    private SelenideElement groupFilter= $(byXpath("//label[contains(text(),'Группа: ')]/following-sibling::input"));   // "Группа"

    //Dropdown фильтры
    private SelenideElement selectQualificationDropDownList = $(byXpath("//label[contains(text(),'Квалификация')]/following-sibling::div"));   // "Квалификация"
    private SelenideElement courseFilter= $(byXpath("//label[contains(text(),'Курс: ')]/following-sibling::div"));                              // "Курс"
    private SelenideElement languageEducationDropDownList = $(byXpath("//label[contains(text(),'Язык обучения: ')]/following-sibling::div"));  // "Язык обучения"
    private SelenideElement curatorDropDownList = $(byXpath("//label[contains(text(),'Куратор: ')]/following-sibling::div"));                   // "Куратор"                                         // "Куратор"

    // Таблица
    private SelenideElement numberOnTable = $(byXpath("//th[contains(text(),'№')]"));                                   // '№'
    private SelenideElement groupOnTable= $(byXpath("//th[contains(text(),'Группа')]"));                                // 'Группа'
    private SelenideElement qualificationTable = $(byXpath("//th[contains(text(),'Квалификация')]"));                   // 'Квалификация'
    private SelenideElement Table = $(byXpath("//th[contains(text(),'Курс')]"));                                        // 'Курс'
    private SelenideElement languageEducationTable = $(byXpath("//th[contains(text(),'Язык обучения')]"));             // 'Язык обучения'
    private SelenideElement numberOfStudentsTable = $(byXpath("//th[contains(text(),'Количество учащихся')]"));         // 'Количество учащихся'
    private SelenideElement curatorTable = $(byXpath("//th[contains(text(),'Куратор')]"));                              // 'Куратор'
    private SelenideElement operationsOnTable = $(byXpath("//th[contains(text(),'Операции')]"));                        // 'Операции'

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $(By.xpath("//a[contains(text(),'‹')]"));                                 //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $(By.xpath("//a[contains(text(),'1')]"));
    private SelenideElement secondPaginateBtn = $(By.xpath("//a[contains(text(),'2')]"));
    private SelenideElement nextPaginateBtn = $(By.xpath("//a[contains(text(),'›')]"));

}

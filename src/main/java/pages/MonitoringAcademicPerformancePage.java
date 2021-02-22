package pages;// Мониторинг_Успеваемость
//  /ru/tko/control/monitoring/academic_performance

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MonitoringAcademicPerformancePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Успеваемость')]");

    // Табы на странице
    private SelenideElement backToTab = $x("//span[contains(text(),'Назад')]/..");                         // Таб "Назад"

    // Фильтр Инпуты
    private SelenideElement nameInput = $x("//input[@type='search']");                                     // 'Группа'
    // групп много, чтобы ускорить тесты сразу выбераем нужную группу $(byText("")); или xpath-сом $x("//div[contains(text(),'КП19-30р')]");

    // Дропдауны в фильтрах
    private SelenideElement semesterFilter= $x("//div[contains(text(),'Семестр')]/following-sibling::div/div[@class='sn-field__inner']");  // Фильтр "Семестр"
    // кликаем, выпадает список. Список не большой, три элемента.
    private ElementsCollection semesterList = $$x("//div[contains(@class,'sn-item--clickable')]");
    // далее поиск по названию
    private SelenideElement selectFirstSemesterFromList = $x("//div[contains(@class,'sn-item--clickable')]//div[contains(text(),'Первый')]");

    private SelenideElement studentFilter= $x("//div[contains(text(),'Студенты')]/following-sibling::div/div[@class='sn-field__inner']");  // Фильтр "Студенты"
    private ElementsCollection studentList = $$x("//div[@class='q-virtual-scroll__content']/div[contains(@class,'sn-item--clickable')]");
    // далее поиск по ФИО

    // Кнопки
    private SelenideElement exportBtn  = $x("//button[contains(@class,'s-b-blue')]");
    private SelenideElement resetBtn = $x("//button[contains(@class,'s-b-orange')]");
    private SelenideElement applyBtn = $x("//button[contains(@class, 's-b-green')]");
    private SelenideElement fullScreenBtn = $x("//button[contains(@class, 's-b-grey')]");

    // После того как нажал на кнопку "Применить", появится таблица, в ней можно убрать или выбрать нужные колонки.
    private SelenideElement  deSelectColumnsName = $x("//span[contains(text(),'Выберите колонки')]//ancestor::div[@class='sn-field__inner']");
    private ElementsCollection deSelectColumnsList = $$x("//div[@class='sn-item__label']");
    private SelenideElement  deSelectFirstColumnsElement = $x("//div[contains(text(),'ФИО')]");


















}

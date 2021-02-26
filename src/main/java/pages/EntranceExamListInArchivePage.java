package pages;// Вступительные экзамены в архиве
//  /ru/tko/control/entrance-exam-archive

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class EntranceExamListInArchivePage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Вступительные экзамены')]");

    // Табы на странице
    private SelenideElement activeTab = $x("//span[contains(text(),'Активные')]/..");                                                       // 'Активные'
    private SelenideElement archiveTab = $x("//a[@class=\"container-content-head__tab-item \"]/span[contains(text(),'Архив')]/..");         // 'Архив' (Текущий таб не кликабельный)
    private SelenideElement addTab = $x("//span[contains(text(),'Добавить')]/..");                                                          // 'Добавить'

    // Таблица
    private SelenideElement nameTable = $x("//th[contains(text(),'№')]");                                       // '№'
    private SelenideElement dateAndTimeTable = $x("//th[contains(text(),'Дата и время')]");                     // 'Дата и время'
    private SelenideElement specializationTable = $x("//th[contains(text(),'Специальность')]");                 // 'Специальность'
    private SelenideElement qualificationTable = $x("//th[contains(text(),'Квалификация')]");                   // 'Квалификация'
    private SelenideElement formOfStudyTable = $x("//th[contains(text(),'Форма обучения')]");                   // 'Форма обучения'
    private SelenideElement languageOfEducationTable = $x("//th[contains(text(),'Язык обучения')]");            // 'Язык обучения'
    private SelenideElement levelOfEducationTable = $x("//th[contains(text(),'Уровень образования')]");         // 'Уровень образования'
    private SelenideElement typeOfTable = $x("//th[contains(text(),'Вид')]");                                   // 'Вид'
    private SelenideElement OperationsOnTable = $x("//th[contains(text(),'Операции')]");                        // 'Операции'

    // Первая кнопка просмотра
    private SelenideElement viewBtn = $x("//tr[1]/td[9]//a[@class='s-btn-table s-btn--ico']");                  // Кнопка "Посмотреть"

    // Кнопки пагинации
    private SelenideElement backPaginateBtn = $x("//a[contains(text(),'‹')]");                                 //не работает на текущей странице, кнопка не активна
    private SelenideElement firstPaginateBtn = $x("//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn = $x("//a[contains(text(),'2')]");
    private SelenideElement thirdPaginateBtn = $x("//a[contains(text(),'3')]");
    private ElementsCollection selectPaginateBtn = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn = $x("//a[contains(text(),'›')]");

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public EntranceExamListInArchivePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Вступительные экзамены"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }


}

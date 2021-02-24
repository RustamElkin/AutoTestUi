package pages;// Создание расписания
//  /ru/tko/control/training-schedule/create

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class TrainingScheduleCreatePage {

    // Тайтл
    private SelenideElement titleToPage               = $x("//h1[contains(text(),'Расписание')]");

    // Кнопки
    private SelenideElement addBtn                    = $x("//a[contains(text(),'Отмена') and @href='/ru/tko/control/training-schedule']");                              // 'Отмена'
    private SelenideElement settingsBtn               = $x("//button[contains(text(),'Сохранить') and @type='submit']");                                                 // 'Сохранить'

    // Инпуты
    private SelenideElement typeScheduleInput         = $x("//label[contains(text(),'Тип расписания')]/following-sibling::div//input[@class='multiselect__input']");    // 'Название'
    private SelenideElement nameInput                 = $x("//div[contains(text(),'Название')]/.. //input");                                                            // 'Название'
    private SelenideElement groupList                 = $x("//label[contains(text(),'Группа')]/following-sibling::div//input[@class='multiselect__input']");            // 'Группа'
    private SelenideElement lessonScheduleList        = $x("//label[contains(text(),'График занятий')]/following-sibling::div//input[@class='multiselect__input']");    // 'График занятий'
    private SelenideElement dateSemesterOneStartInput = $x("//input[@type='text' and @name='date_semester_one_start']");                                                // 'Дата начала первого семестра'
    private SelenideElement dateSemesterOneEndInput   = $x("//input[@type='text' and @name='date_semester_one_end']");                                                  // 'Дата завершения первого семестра'
    private SelenideElement dateSemesterTwoStartInput = $x("//input[@type='text' and @name='date_semester_two_start']");                                                // 'Дата начала второго семестра'
    private SelenideElement dateSemesterTwoEndInput   = $x("//input[@type='text' and @name='date_semester_two_end']");                                                  // 'Дата завершения второго семестра'

    private SelenideElement mainPageLink = $x("//div[@class = 's-main-header__left-panel']/a[@href = '/ru/tko']");


    public TrainingScheduleCreatePage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Расписание"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }
}

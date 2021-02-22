package pages;// Просмотр приемной комиссии
//  /ru/tko/control/statements-admissions/934

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ReviewStatementAdmissionPage {

    // Тайтл
    private SelenideElement titleToPage           = $x("//h1[contains(text(),'Просмотр приемной комиссии')]");

    // Табы на странице
    private SelenideElement backTab               = $x("//span[contains(text(),'Назад')]/..");                                                                      // 'Назад'

    // Кнопки
    private SelenideElement examBtn               = $x("//div[contains(@class, 'sc-admission-show__buttons')]/a[contains(text(),'Экзамены')]");                     // 'Экзамены'
    private SelenideElement scheduleAnExamBtn     = $x("//div[contains(@class, 'sc-admission-show__buttons')]/a[contains(text(),'Назначить экзамен')]");            // 'Назначить экзамен'
    private SelenideElement addStatementBtn       = $x("//div[contains(@class, 'sc-admission-show__buttons')]/a[contains(text(),'Добавить заявление')]");           // 'Добавить заявление'
    private SelenideElement distributePlacesBtn   = $x("//div[contains(@class, 'sc-admission-show__buttons')]/a[contains(text(),'Распределить гос. места')]");      // 'Распределить гос. места'

    // Если нет поданных заявлений таблиц нет№

    // Таблицы
    private  SelenideElement basedOnNineClasses   = $x("//div[@class='profile-content__block']/div[contains(text(), 'На базе 9')]");                                // 'На базе 9 классов'
    private  SelenideElement basedOnElevenClasses = $x("//div[@class='profile-content__block']/div[contains(text(), 'На базе 11')]");                               // 'На базе 9 классов'

    // Кнопки просмотра
    private ElementsCollection viewBtn            = $$x("//div[@class='profile-content__block']//a[@title = 'Просмотреть']");                                       // 'Просмотреть'
    private ElementsCollection PointsBtn          = $$x("//div[@class='profile-content__block']//span[text() = 'Баллы']");                                          // 'Баллы'

}

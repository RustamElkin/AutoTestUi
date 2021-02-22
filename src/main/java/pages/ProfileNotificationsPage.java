package pages;// Уведомления
//  /ru/tko/profile/notifications

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProfileNotificationsPage {

    // Тайтл
    private SelenideElement titleToPage                  = $x("//h1[contains(text(),'Уведомления')]");

    // Таблица
    private SelenideElement nameTable                    = $x("//th[contains(text(),'№')]");                          // '№'
    private SelenideElement dateAndTimeTable             = $x("//th[contains(text(),'Дата и время')]");               // 'Дата и время'
    private SelenideElement descriptionNotificationTable = $x("//th[contains(text(),'Описание уведомления')]");       // 'Описание уведомления'


    // Ссылки с текстом "Посмотреть"
    private ElementsCollection viewLinks                 = $$x("//a[contains(text(),'Посмотреть')]");
    private ElementsCollection viewResultLinks           = $$x("//a[contains(text(),'перейти для просмотра результата')]");
    private ElementsCollection goToCheckLinks            = $$x("//a[contains(text(),'перейти для проверки.')]");
    private ElementsCollection goToViewLinks             = $$x("//a[contains(text(),'перейти для просмотра')]");

    // Кнопки пагинации на странице
    private SelenideElement backPaginateBtn              = $x("//a[contains(text(),'‹')]");                           // Не работает на текущей странице, кнопка не активна, тег "a" отображается как span
    private SelenideElement firstPaginateBtn             = $x("//ul[@role='navigation']//a[contains(text(),'1')]");
    private SelenideElement secondPaginateBtn            = $x("//ul[@role='navigation']//a[contains(text(),'2')]");
    private ElementsCollection selectPaginateBtn         = $$x("//ul[@role='navigation']//a");
    private SelenideElement nextPaginateBtn              = $x("//a[contains(text(),'›')]");




}

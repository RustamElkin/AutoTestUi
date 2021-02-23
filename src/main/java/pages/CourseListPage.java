package pages;// Онлайн курсы для студентов
//  /ru/tko/course/lists

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CourseListPage {

    // Тайтл
    private SelenideElement titleToPage =$x("//div[@class=\"s-title-head\"][contains(text(),'Онлайн курсы для студентов')]");

    private ElementsCollection coursesContentContainer = $$x("//div[@class='d-flex col-auto col-lg-6 col-xl-4 mb-30']");       //найдёт список элементов

    // далее в самом тесте .filterBy(text("...."))  или get(int) - возвращает n-ый элемент какSelenideElement, далее .click();

    private SelenideElement mainPageLink = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public CourseListPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Онлайн курсы для студентов"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

}

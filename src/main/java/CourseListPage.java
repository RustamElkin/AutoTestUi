// Онлайн курсы для студентов
//  /ru/tko/course/lists

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CourseListPage {

    // Тайтл
    private SelenideElement titleToPage =$x("//div[@class=\"s-title-head\"][contains(text(),'Онлайн курсы для студентов')]");

    private ElementsCollection coursesContentContainer = $$x("//div[@class='d-flex col-auto col-lg-6 col-xl-4 mb-30']");       //найдёт список элементов

    // далее в самом тесте .filterBy(text("...."))  или get(int) - возвращает n-ый элемент какSelenideElement, далее .click();


}

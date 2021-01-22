// Мои дети
//  /ru/tko/account/children/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ChildrenCreatePage {

    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Добавить ребенка')]"));
    private SelenideElement searchByIinBtn = $(byXpath("//label[contains(text(),'Поиск по базе')]"));
    private SelenideElement applyForBtn = $(byXpath("//label[contains(text(),'Подать заявку')]"));
    private SelenideElement confirmBtn = $(byXpath("//div[@class=\"col-12 col-sm-auto\"]/button[contains(text(),'Подтвердить')]"));

    // пока не вобьешь ИИН, кнопка "Подать заявку" не активна.
    private SelenideElement childIinInput = $(byXpath("//input[@name='child_iin']"));

    private SelenideElement firstAddBtn = $(byXpath("//*[contains(text(),\"Удостоверение личности:\")]/following-sibling::div"));
    private SelenideElement secondAddBtn = $(byXpath("//*[contains(text(),\"Документы\")]/following-sibling::div/div[contains(text(),\"Добавить\")]"));

    //модалка на обе кнопки
    private SelenideElement selectFileBtn = $(byXpath("//*[@id=\"modal-user-files\"]//div[@title=\"1.jpg\"]/../../div[1]"));
    private SelenideElement saveFileBtn = $(byXpath("//*[@id=\"modal-user-files\"]//div[contains(text(),'Сохранить')]/.."));

    private SelenideElement applyApplicationBtn = $(byXpath("//button[contains(text(),'Подать заявку')]"));


}

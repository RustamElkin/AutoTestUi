package pages;// Мои дети
//  /ru/tko/account/children/create

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ChildrenCreatePage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Добавить ребенка')]");
    private SelenideElement searchByIinBtn = $x("//label[contains(text(),'Поиск по базе')]");
    private SelenideElement applyForBtn = $x("//label[contains(text(),'Подать заявку')]");
    private SelenideElement confirmBtn = $x("//div[@class='col-12 col-sm-auto']/button[contains(text(),'Подтвердить')]");

    // пока не вобьешь ИИН, кнопка "Подать заявку" не активна.
    private SelenideElement childIinInput = $x("//input[@name='child_iin']");

    private SelenideElement firstAddBtn = $x("//*[contains(text(),\"Удостоверение личности:\")]/following-sibling::div");
    private SelenideElement secondAddBtn = $x("//*[contains(text(),\"Документы\")]/following-sibling::div/div[contains(text(),\"Добавить\")]");

    //модалка на обе кнопки
    private SelenideElement selectFileBtn = $x("//*[@id=\"modal-user-files\"]//div[@title=\"1.jpg\"]/../../div[1]");
    private SelenideElement saveFileBtn = $x("//*[@id=\"modal-user-files\"]//div[contains(text(),'Сохранить')]/..");

    private SelenideElement applyApplicationBtn = $x("//button[contains(text(),'Подать заявку')]");


}

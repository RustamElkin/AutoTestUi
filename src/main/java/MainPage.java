import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

//Главная страница
//     /ru/tko
public class MainPage {

    private SelenideElement titleToPage = $x("//section[1]/div/div[1]");
    private SelenideElement menuBtn = $x("//div[contains(text(),'Меню')]");
    private SelenideElement menuDropdownGetOutLink = $x("//a/span[text() ='Выйти']");
    private SelenideElement regionSelectBtn = $x("//div[1][@data-target=\"#modal-region-selecting\"]");
    private SelenideElement modalRegionSelecting = $x("//*[@id=\"modal-region-selecting\"]//a[text()=\"Туркестанская область\"]");
    private SelenideElement signInBtn = $("div.s-main-header__right-panel >a[href='/ru/tko/login']");
    //переходит на  https://college.dev-snation.kz/ru/tko/login



    public MainPage clickRegionSelectBtn() {
        regionSelectBtn.shouldBe(visible).click();
        return this;
    }


    public MainPage clickSelectRegion() {
        modalRegionSelecting.click();
        return this;
    }

    public LoginPage clickSignInBtn() {
        signInBtn.click();
        return new LoginPage();
    }

    public MainPage checkTitleToPage() {
        titleToPage.shouldHave(text("Единый портал государственных услуг"));
        return this;
    }

    public MainPage clickMenuBtn() {
        menuBtn.click();
        return this;
    }

    public MainPage clickMenuExit() {
        menuDropdownGetOutLink.shouldBe(visible).click();
        return this;
    }




}

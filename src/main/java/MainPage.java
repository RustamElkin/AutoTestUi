import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

//Главная страница
//     /ru/tko
public class MainPage {

    private SelenideElement titleToPage = $x("//div[@class='s-jumbotron__title mb-30']");
    private SelenideElement menuBtn = $x("//div[contains(text(),'Меню')]");
    private SelenideElement menuDropdownGetOutLink = $x("//span[text() ='Выйти']/..");
    private SelenideElement regionSelectBtn = $x("//div[@data-target='#modal-region-selecting']/div[contains(@class,'s-btn--thm-white')]");
    private SelenideElement modalRegionSelecting = $x("//div[@class='s-modal__container']//a[text()='Туркестанская область']");
    private SelenideElement signInBtn = $x("//a[contains(@class,'s-btn--thm-green') and text() = 'Вход']");
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

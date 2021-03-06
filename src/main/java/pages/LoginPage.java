package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

// Вход
//  /ru/tko/login
public class LoginPage {
    // Тайтл
    private SelenideElement titleToPage       = $x("//div[@class = 's-title-head mb-40' and text() = 'Вход']");

    //IIN
    private SelenideElement iinFormTab        = $x("//div[@id='v-login-form-app']//div[text()='ИИН']/ancestor::div[@role='tab']");
    private SelenideElement iinInput          = $x("//input[@placeholder='ИИН' and @aria-label='ИИН']");
    //Login or tel.number
    private SelenideElement loginFormTab      = $x("//div[@id='v-login-form-app']//div[text()='Логин или номер телефона']/ancestor::div[@role='tab']");
    private SelenideElement loginInput        = $x("//input[@placeholder='Логин или номер телефона' and @aria-label='Логин или номер телефона']");
    private SelenideElement passwordInput     = $x("//input[@aria-label='Пароль' and @type='password']");
    private SelenideElement submitBtn         = $x("//div[text() ='Войти в систему']/ancestor::button[@type='submit']");
    //переходит на  выбор роли https://college.dev-snation.kz/ru/tko/select-role

    //проверка что мы на этой странице, по title Вход
    private SelenideElement entryHeadingText  = $x("//div[contains(@class,'s-title-head') and text()='Вход']");

    //Если не заполнить ИИН
    private SelenideElement iinErrorMessage   = $x("//div[@class='sn-field__messages']/div[contains(text(),'Поле \"ИИН')]");

    //Если не заполнить Пароль
    private SelenideElement passwordErrorMessage = $x("//div[@class='sn-field__messages']/div[contains(text(),'Поле \"Пароль')]");

    //Если не заполнить Логин или номер телефона
    private SelenideElement loginErrorMessage = $x("//div[@class='sn-field__messages']/div[contains(text(),'Поле \"Логин или номер телефона')]");

    private SelenideElement mainPageLink      = $x("//div[@class='s-main-header__left-panel']/a[@href='/ru/tko']");



    public LoginPage checkTitleToPage() {
        titleToPage.shouldBe(Condition.visible).shouldHave(text("Вход"));
        return this;
    }

    public MainPage mainPageLink() {
        mainPageLink.shouldBe(Condition.visible).click();
        return new MainPage();
    }

    public LoginPage clickIINFormTab() {
        iinFormTab.shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPage typeIINInput(String userIin) {
        iinInput.shouldBe(Condition.visible).setValue(userIin); //"123456789123"
        return this;
    }

    public LoginPage clickLoginFormTab() {
        loginFormTab.shouldBe(Condition.visible).click();
        return this;
    }

    public LoginPage typeLoginInput(String userLogin) {
        loginInput.shouldBe(Condition.visible).setValue(userLogin); //"shym.coll.as.1"
        return this;
    }

    public LoginPage typePasswordInput(String userPassword) {
        passwordInput.shouldBe(Condition.visible).setValue(userPassword); //"123456"
        return this;
    }

    public SelectRolePage clickSubmitBtn() {
        submitBtn.shouldBe(visible).click();
        return new SelectRolePage();
    }

    public LoginPage headingText() {
        entryHeadingText.shouldBe(visible);
        return this;
    }

    public LoginPage loginWithInvalidIin(String userIin, String userPassword) {
        this.typeIINInput(userIin);
        this.typePasswordInput(userPassword);
        this.submitBtn.shouldBe(Condition.visible).click();
        //в самом тесте сделать проверку на не совпадения ИИНа и Пароля
        return new LoginPage();
    }

    public String getIinErrorText() {
        return iinErrorMessage.shouldBe(visible).getText();
    }

    public LoginPage loginWithInvalidLogin(String userLogin, String userPassword) {
        this.typeLoginInput(userLogin);
        this.typePasswordInput(userPassword);
        this.submitBtn.shouldBe(Condition.visible).click();
        //в самом тесте сделать проверку на не совпадения Login
        return new LoginPage();
    }

    public String getLoginText() {
        return loginErrorMessage.shouldBe(visible).getText();
    }

    public LoginPage loginWithInvalidPassword(String userLogin, String userPassword) {
        this.typeLoginInput(userLogin);
        //тут якобы забыл вбить пароль
        this.submitBtn.shouldBe(Condition.visible).click();
        //в самом тесте сделать проверку на пустое поле, на не совпадения Пароля
        return new LoginPage();
    }

    public String getPasswordText() {
        return passwordErrorMessage.shouldBe(visible).getText();
    }

    public SelectRolePage setCorrectLogin(String userLogin, String userPassword) {
        this.typeLoginInput(userLogin);
        this.typePasswordInput(userPassword);
        this.submitBtn.shouldBe(Condition.visible).click();
        return new SelectRolePage();
    }

    public SelectRolePage setCorrectIin(String userIin, String userPassword) {
        this.typeIINInput(userIin);
        this.typePasswordInput(userPassword);
        this.submitBtn.shouldBe(Condition.visible).click();
        return new SelectRolePage();
    }

}

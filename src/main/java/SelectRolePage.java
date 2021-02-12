import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

// Роль
//  ru/tko/select-role
public class SelectRolePage {

    //private SelenideElement selectRoleDropDownList = $("div.multiselect__tags");
    private SelenideElement selectRoleDropDownList = $x("//input[@name='role_key' and @class='multiselect__input']/ancestor::div[@class='multiselect mb-10']");
    private SelenideElement selectRUEmployee = $x("//div//span[text()='Сотрудник РУ']");
    private SelenideElement selectMonRKEmployee = $x("//div//span[text()='МОН РК']");
    private SelenideElement selectOUEmployee = $x("//div//span[text()='Сотрудник ОУ']");
    private SelenideElement selectDirectorEmployee = $x("//div//span[text()='Директор']");
    private SelenideElement selectAdminEmployee = $x("//div//span[text()='Сотрудник колледжа (админ)']");
    private SelenideElement saveBtn = $x("//div[@class='row-sort-end']/button[@type='submit']");
    //возвращает на мэйнпэйдж https://college.dev-snation.kz/ru/tko

    //Если не выбрать роль
    public SelenideElement roleErrorMessage = $x("//div[@class='s-form__error-message' and contains(text(),'Поле \"Роль')]");

    //проверка что мы на этой странице, по title Роль
    private SelenideElement roleTitle = $x("//div[@class='s-title-head' and text() ='Роль']");


    public SelectRolePage clickSelectRoleList() {
        selectRoleDropDownList.click();
        return this;
    }

    public SelectRolePage clickSelectRUEmployee() {
        selectRUEmployee.click();
        return this;
    }

    public SelectRolePage clickSelectMonRKEmployee() {
        selectMonRKEmployee.click();
        return this;
    }

    public SelectRolePage clickSelectOUEmployee() {
        selectOUEmployee.click();
        return this;
    }

    public SelectRolePage clickSelectDirectorEmployee() {
        selectDirectorEmployee.click();
        return this;
    }

    public SelectRolePage clickSelectAdmin() {
        selectAdminEmployee.click();
        return this;
    }

    public MainPage clickSubmitBtn() {
        saveBtn.click();
        return new MainPage();
    }

    public SelectRolePage shouldBeRoleTitle() {
        roleTitle.shouldBe(visible);
        return this;
    }

    public SelectRolePage notSelectRole() {
        // сразу нажал, не выбрав роль
        this.saveBtn.click();
        //в самом тесте сделать проверку на пустое поле. Поле "Роль" обязательно для заполнения.
        return new SelectRolePage();
    }

    public String notSelectRoleText() {
        return roleErrorMessage.shouldBe(visible).getText();
    }

}

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
// Роль
//  ru/tko/select-role
public class SelectRolePage {

    private SelenideElement selectRoleDropDownList = $(By.cssSelector("div.multiselect__tags"));
    private SelenideElement selectRUEmployee = $(By.xpath("//div//span[text()=\"Сотрудник РУ\"]"));
    private SelenideElement selectMonRKEmployee = $(By.xpath("//div//span[text()=\"МОН РК\"]"));
    private SelenideElement selectOUEmployee = $(By.xpath("//div//span[text()=\"Сотрудник ОУ\"]"));
    private SelenideElement selectDirectorEmployee = $(By.xpath("//div//span[text()=\"Директор\"]"));
    private SelenideElement selectAdminEmployee = $(By.xpath("//div//span[text()=\"Сотрудник колледжа (админ)\"]"));
    private SelenideElement submitBtn = $(By.cssSelector("button[type='submit']"));
    //возвращает на мэйнпэйдж https://college.dev-snation.kz/ru/tko

    //Если не выбрать роль
    public SelenideElement roleErrorMessage = $(By.xpath("//div[contains(text(),'Поле \"Роль\" обязательно для заполнения')]"));

    //проверка что мы на этой странице, по title Роль
    private SelenideElement roleTitle = $(By.xpath("//div[2][contains(text(),'Роль')]"));


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
        submitBtn.click();
        return new MainPage();
    }

    public SelectRolePage shouldBeRoleTitle() {
        roleTitle.shouldBe(visible);
        return this;
    }

    public SelectRolePage notSelectRole() {
        // сразу нажал, не выбрав роль
        this.submitBtn.click();
        //в самом тесте сделать проверку на пустое поле. Поле "Роль" обязательно для заполнения.
        return new SelectRolePage();
    }

    public String notSelectRoleText() {
        return roleErrorMessage.shouldBe(visible).getText();
    }

}

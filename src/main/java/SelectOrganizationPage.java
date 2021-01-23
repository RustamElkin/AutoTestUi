import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// Выбор организации
//  /ru/tko/select-organization/college
public class SelectOrganizationPage {

    private SelenideElement shouldBeOrganizationList = $x("//*[@id='vue-container']//form//div/div[2]");
    private SelenideElement selectIndustrialCollege = $x("//*[@id='vue-container']//div[3]/ul/li[1]/span/span");
    private SelenideElement submitBtn = $("button[type='submit']");

    //проверка что мы на этой странице, по title Организация
    private SelenideElement organizationTitle = $x("//div[2][contains(text(),'Организация')]");

    private SelenideElement organizationErrorMessage = $x("//div[2][contains(text(),'Поле \"Организация\" обязательно для заполнения.')]");


    public SelectOrganizationPage clickOrganizationDropDownList() {
        shouldBeOrganizationList.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage clickOrganizationName() {
        selectIndustrialCollege.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage clickSubmitBtn() {
        submitBtn.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage shouldBeOrganizationTitle() {
        organizationTitle.shouldBe(visible);
        return this;
    }

    public SelectOrganizationPage notSelectOrganization() {
        // сразу нажал, не выбрав Организацию
        this.submitBtn.click();
        //в самом тесте сделать проверку на пустое поле. Поле "Организация" обязательно для заполнения.
        return new SelectOrganizationPage();
    }

    public String notSelectOrganizationError() {
        return organizationErrorMessage.shouldBe(visible).getText();
    }

}





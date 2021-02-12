import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

// Выбор организации
//  /ru/tko/select-organization/college
public class SelectOrganizationPage {

    private SelenideElement shouldBeOrganizationList = $x("//input[@class='multiselect__input' and @name='organization_id']/ancestor::div[@class='multiselect mb-10']");
    private SelenideElement selectIndustrialCollege = $x("//span[text()='ГККП «Индустриально-Технический Колледж»']");
    private SelenideElement saveBtn = $x("//div[@class='row-sort-end']/button[@type = 'submit']");

    //проверка что мы на этой странице, по title Организация
    private SelenideElement organizationTitle = $x("//div[@class = 's-title-head' and text() = 'Организация']");

    private SelenideElement organizationErrorMessage = $x("//div[@class = 's-form__error-message' and contains(text(),'Поле \"Организация')]");


    public SelectOrganizationPage clickOrganizationDropDownList() {
        shouldBeOrganizationList.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage clickOrganizationName() {
        selectIndustrialCollege.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage clickSubmitBtn() {
        saveBtn.shouldBe(visible).click();
        return this;
    }

    public SelectOrganizationPage shouldBeOrganizationTitle() {
        organizationTitle.shouldBe(visible);
        return this;
    }

    public SelectOrganizationPage notSelectOrganization() {
        // сразу нажал, не выбрав Организацию
        this.saveBtn.click();
        //в самом тесте сделать проверку на пустое поле. Поле "Организация" обязательно для заполнения.
        return new SelectOrganizationPage();
    }

    public String notSelectOrganizationError() {
        return organizationErrorMessage.shouldBe(visible).getText();
    }

}





// Профиль
//  /ru/tko/account/profile

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountProfilePage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Профиль')]"));
    private SelenideElement aboutMeTabItem = $(By.xpath("//span[contains(text(),'Обо мне')]"));
    private SelenideElement myFilesTabItem = $(By.xpath("//span[contains(text(),'Мои файлы')]"));
    private SelenideElement changePasswordBtn = $(By.xpath("//a[contains(text(),'Сменить пароль')]"));
    private SelenideElement EditBtn = $(By.xpath("//span[contains(text(),'Редактировать')]"));

}


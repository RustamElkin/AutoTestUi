// Редактировать профиль
//  /ru/tko/account/profile/edit

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountProfileEditPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Профиль')]"));
    private SelenideElement backBtn = $(By.xpath("//*[@id=\"vue-container\"]/div[1]//div/a"));
    private SelenideElement submitBtn = $(By.xpath("//span[contains(text(),'Сохранить')]"));
    private SelenideElement actualizeBtn = $(By.xpath("//button[contains(text(),'Актуализировать')]"));
    private SelenideElement fotoEditBtn = $(By.xpath("//button[contains(text(),'Изменить фото')]"));
    private SelenideElement titleInformationAboutYourself = $(By.xpath("//span[contains(text(),'Общие сведения о себе')]"));

}

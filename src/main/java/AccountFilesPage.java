// Мои файлы
//  /ru/tko/account/files

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountFilesPage {

    private SelenideElement titleToPage = $(By.xpath("//h1[contains(text(),'Профиль')]"));
    private SelenideElement aboutMeTabItem = $(By.xpath("//span[contains(text(),'Обо мне')]/.."));
    private SelenideElement myFilesTabItem = $(By.xpath("//span[contains(text(),'Мои файлы')]/.."));
    private SelenideElement addFileBtn = $(By.xpath("//div[contains(text(),'Добавить файл')]/.."));
    private SelenideElement viewFileBtn = $(By.xpath("//div[@class=\"row justify-content-center\"]/a"));
    private SelenideElement downLoadFileBtn = $(By.xpath("//div[@class=\"row justify-content-center\"]/a"));
    private SelenideElement removeFileBtn = $(By.xpath("//div[@class=\"row justify-content-center\"]/div"));

}

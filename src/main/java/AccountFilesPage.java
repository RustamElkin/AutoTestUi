// Мои файлы
//  /ru/tko/account/files

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AccountFilesPage {

    private SelenideElement titleToPage = $x("//h1[contains(text(),'Профиль')]");
    private SelenideElement aboutMeTabItem = $x("//span[contains(text(),'Обо мне')]/..");
    private SelenideElement myFilesTabItem = $x("//span[contains(text(),'Мои файлы')]/..");
    private SelenideElement addFileBtn = $x("//div[contains(text(),'Добавить файл')]/..");
    private SelenideElement viewFileBtn = $x("//div[@class=\"row justify-content-center\"]/a");
    private SelenideElement downLoadFileBtn = $x("//div[@class=\"row justify-content-center\"]/a");
    private SelenideElement removeFileBtn = $x("//div[@class=\"row justify-content-center\"]/div");

}

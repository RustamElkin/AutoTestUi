// Информация о колледже
//  /ru/tko/college/10905/about

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CollegeInformationPage {

    private SelenideElement titleToPage = $(byXpath("//div[@class=\"s-title-head\"][contains(text(),'Информация о колледже')]"));
    private SelenideElement photoAlbumFullscreenBtn = $(byXpath("//*[@id=\"v-passport-page-view-app\"]//div[@class=\"s-photo-album__picture-prev\"]/following-sibling::button"));

    private SelenideElement collegeInformationBtn = $(byXpath("//div[contains(text(),'Об организации')]/../.."));
    private SelenideElement collegeSpecificationBtn = $(byXpath("//div[contains(text(),'Описание')]/../.."));

    private SelenideElement providingFreeFoodBtn = $(byXpath("//div[contains(text(),'Предоставление бесплатного питания')]/../.."));
    private SelenideElement academicLeaveApplicationBtn = $(byXpath("//div[contains(text(),'Заявление на академический отпуск')]/../.."));
    private SelenideElement providingAHostelBtn = $(byXpath("//div[contains(text(),'Предоставление общежития')]/../.."));
    private SelenideElement transferOrRestorationRequestBtn = $(byXpath("//div[contains(text(),'Заявка на перевод/восстановление')]/../.."));
    private SelenideElement issuanceOfACertificateOfIncompleteEducationBtn = $(byXpath("//div[contains(text(),'Выдача справки о неоконченном образовании')]/../.."));
    private SelenideElement issuanceOfDuplicateDocumentsBtn = $(byXpath("//div[contains(text(),'Выдача дубликатов документов')]/../.."));



}

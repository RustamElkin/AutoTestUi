package pages;// Информация о колледже
//  /ru/tko/college/10905/about

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CollegeInformationPage {

    private SelenideElement titleToPage = $x("//div[@class=\"s-title-head\"][contains(text(),'Информация о колледже')]");
    private SelenideElement photoAlbumFullscreenBtn = $x("//*[@id=\"v-passport-page-view-app\"]//div[@class=\"s-photo-album__picture-prev\"]/following-sibling::button");

    private SelenideElement collegeInformationBtn = $x("//div[contains(text(),'Об организации')]/../..");
    private SelenideElement collegeSpecificationBtn = $x("//div[contains(text(),'Описание')]/../..");

    private SelenideElement providingFreeFoodBtn = $x("//div[contains(text(),'Предоставление бесплатного питания')]/../..");
    private SelenideElement academicLeaveApplicationBtn = $x("//div[contains(text(),'Заявление на академический отпуск')]/../..");
    private SelenideElement providingAHostelBtn = $x("//div[contains(text(),'Предоставление общежития')]/../..");
    private SelenideElement transferOrRestorationRequestBtn = $x("//div[contains(text(),'Заявка на перевод/восстановление')]/../..");
    private SelenideElement issuanceOfACertificateOfIncompleteEducationBtn = $x("//div[contains(text(),'Выдача справки о неоконченном образовании')]/../..");
    private SelenideElement issuanceOfDuplicateDocumentsBtn = $x("//div[contains(text(),'Выдача дубликатов документов')]/../..");



}

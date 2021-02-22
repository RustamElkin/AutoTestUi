package pages;// Инструкции
//  /ru/tko/faq

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FaqPage {

    // добить скачивание инструкций и переход на ютуб с последующим закрытием отдельной вкладки.

    // Тайтл
    private SelenideElement titleToPage = $x("//div[@class=\"s-title-head\"][contains(text(),'ИНСТРУКЦИИ')]");


    //faqCont

    private SelenideElement forStaffFaq = $x("//div[contains(text(),'Инструкции для сотрудников')]/..");
    private SelenideElement forStudentsFaq = $x("//div[contains(text(),'Инструкции для обучающихся')]/..");

    //forStaffFaq
    private SelenideElement libraryToolkit = $x("//div[@class='faq-answear__title'][contains(text(),'работе с библиотекой')]");
    private SelenideElement blogToolkit = $x("//div[@class='faq-answear__title'][contains(text(),'работе с блогом')]");
    private SelenideElement publicServiceTool = $x("//div[@class='faq-answear__title'][contains(text(),'государственным услугам')]");
    private SelenideElement journalTool = $x("//div[@class='faq-answear__title'][contains(text(),'по журналу')]");
    private SelenideElement contingentSectionTool = $x("//div[@class='faq-answear__title'][contains(text(),'по разделу контингент')]");
    private SelenideElement personnelTooling = $x("//div[@class='faq-answear__title'][contains(text(),'по персоналу')]");
    private SelenideElement organizationProfileTool = $x("//div[@class='faq-answear__title'][contains(text(),'по профилю организации')]");
    private SelenideElement scheduledInstrumentation = $x("//div[@class='faq-answear__title'][contains(text(),'по расписанию')]");
    private SelenideElement curriculumTool = $x("//div[@class='faq-answear__title'][contains(text(),'по учебному плану')]");
    private SelenideElement examInstrumentation = $x("//div[@class='faq-answear__title'][contains(text(),'по экзамену')]");
    private SelenideElement toCheckTheSubmittedApplicationsOfApplicants = $x("//div[@class='faq-answear__title'][contains(text(),'по проверке поданных заявлений абитуриентов')]");
    private SelenideElement instructionsForCreatingASelectionCommittee = $x("//div[@class='faq-answear__title'][contains(text(),'Инструкция по созданию приемной комиссии')]");
    private SelenideElement fromExternalServicesNotInspectionBoard = $x("//div[@class='faq-answear__title'][contains(text(),'при отсутствии приемной комиссии')]");
    private SelenideElement fromExternalServices = $x("//div[@class='faq-answear__title'][contains(text(),'с приемной комиссии')]");

    //forStudentsFaq
    private SelenideElement exerciseInstructions = $x("//div[@class='faq-answear__title'][contains(text(),'по заданиям')]");
    private SelenideElement InstructionsForApplyingForEnrollment = $x("//div[@class='faq-answear__title'][contains(text(),'по подаче заявления на зачисление')]");


}

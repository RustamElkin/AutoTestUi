// Инструкции
//  /ru/tko/faq

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FaqPage {

    // добить скачивание инструкций и переход на ютуб с последующим закрытием отдельной вкладки.

    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//div[@class=\"s-title-head\"][contains(text(),'ИНСТРУКЦИИ')]"));


    //faqCont

    private SelenideElement forStaffFaq = $(byXpath("//div[contains(text(),'Инструкции для сотрудников')]/.."));
    private SelenideElement forStudentsFaq = $(byXpath("//div[contains(text(),'Инструкции для обучающихся')]/.."));

    //forStaffFaq
    private SelenideElement libraryToolkit = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'работе с библиотекой')]"));
    private SelenideElement blogToolkit = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'работе с блогом')]"));
    private SelenideElement publicServiceTool = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'государственным услугам')]"));
    private SelenideElement journalTool = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по журналу')]"));
    private SelenideElement ContingentSectionTool = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по разделу контингент')]"));
    private SelenideElement personnelTooling = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по персоналу')]"));
    private SelenideElement organizationProfileTool = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по профилю организации')]"));
    private SelenideElement scheduledInstrumentation = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по расписанию')]"));
    private SelenideElement curriculumTool = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по учебному плану')]"));
    private SelenideElement examInstrumentation = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по экзамену')]"));
    private SelenideElement toCheckTheSubmittedApplicationsOfApplicants = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по проверке поданных заявлений абитуриентов')]"));
    private SelenideElement instructionsForCreatingASelectionCommittee = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'Инструкция по созданию приемной комиссии')]"));
    private SelenideElement fromExternalServicesNotInspectionBoard = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'при отсутствии приемной комиссии')]"));
    private SelenideElement fromExternalServices = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'с приемной комиссии')]"));

    //forStudentsFaq
    private SelenideElement exerciseInstructions = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по заданиям')]"));
    private SelenideElement InstructionsForApplyingForEnrollment = $(byXpath("//div[@class='faq-answear__title'][contains(text(),'по подаче заявления на зачисление')]"));


}

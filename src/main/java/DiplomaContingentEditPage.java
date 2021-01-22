// Редактирование дипломной работы
//  /ru/tko/control/diploma-contingent/4/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DiplomaContingentEditPage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Дипломные работы')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                            // 'Назад'

    // checkbox, нажав на чекбокс появится  два инпута: Руководитель, Примечание
    private SelenideElement enterManagerManuallyCheckBox = $(byXpath("//div[contains(text(),'Ввести руководителя вручную')]/preceding-sibling::div/input"));          //чекбокс

    // Инпуты
    private SelenideElement fullNameManagerInput = $(byXpath("//div[contains(text(),'Руководитель')]/following-sibling::div//input"));       // 'Руководитель'
    private SelenideElement notationInput = $(byXpath("//div[contains(text(),'Примечание')]/following-sibling::div//input"));                // 'Примечание'

    private SelenideElement thesisTopicInput = $(byXpath("//div[contains(text(),'Тема дипломной работы')]/following-sibling::div//input"));  // 'Тема дипломной работы'
    private SelenideElement protectionDateInput = $(byXpath("//div[contains(text(),'Дата защиты')]/following-sibling::div//input"));         // 'Дата защиты'

    // dropdown list
    private SelenideElement selectHeadOfTheThesis = $(byXpath("//span[@aria-labelledby='select2-year-0y-container']"));

    // Получение списока Руководителей
    private ElementsCollection selectHeadOfTheThesisList = $$(byXpath("//div[@class=\"q-virtual-scroll__content\"]/div"));

    // checkbox 'Поставить оценку', нажав на чекбокс появится  инпут: 'Оценка'
    private SelenideElement rateCheckBox = $(byXpath("//div[contains(text(),'Поставить оценку')]/preceding-sibling::div//input"));          // чекбокс 'Поставить оценку'

    // Инпут 'Оценка'
    private SelenideElement rateInput = $(byXpath("//div[contains(text(),'Оценка')]/following-sibling::div//input"));                       // 'Примечание'

    // Кнопка "Сохранить"
    private SelenideElement saveBtn = $(byXpath("//div[contains(text(),'Сохранить')]/../.."));                                              // 'Сохранить'


















}

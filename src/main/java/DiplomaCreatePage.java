// Добавление дипломных работ
//  /ru/tko/control/diploma/create

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DiplomaCreatePage {


    // Тайтл
    private SelenideElement titleToPage = $(byXpath("//h1[contains(text(),'Дипломные работы')]"));

    // Табы на странице
    private SelenideElement fullListTab = $(byXpath("//span[contains(text(),'Назад')]/.."));                                                              // 'Назад'

    //Dropdown multiselect
    private SelenideElement valuationType = $(byXpath("//div[contains(text(),'Вид оценки')]/following-sibling::div/div[@class='sn-field__inner']"));      // мультиселект 'Вид оценки'

    private SelenideElement fivePointSystem = $(byXpath("//div[contains(text(),'5-бальная система')]"));
    private SelenideElement percentageSystem = $(byXpath("//div[contains(text(),'Процентная система')]"));

    private SelenideElement qualificationsSelectInput = $(byXpath("//div[contains(text(),'Квалификация')]/following-sibling::div/div[@class=\"sn-field__inner\"]"));      // мультиселект 'Квалификация'

    // Получение списока квалификаций
    private ElementsCollection selectAllQualifications = $$(byXpath("//div[@class=\"sn-item__label\"]"));

    // Выбрать тестовую квалификацию
    private SelenideElement selectTestQualification = $(byXpath("//div[contains(text(),'1013062 - Слесарь по контрольно-измерительным')]"));

    // Получение списока групп
    private ElementsCollection selectAllGroups = $$(byXpath("//div[contains(text(),'Выберите группы')]/following-sibling::div/div/div"));

    // Выбрать тестовую группу КП19-30р, либо любую из списка по индексу
    private SelenideElement selectTestGroup = $(byXpath("//div[contains(text(),'Выберите группы')]/following-sibling::div/div/div[1]//button"));           // Группа КП19-30р

    // Кнопка Сохранить
    private SelenideElement saveBtn = $(byXpath("//div[contains(text(),'Сохранить')]/../.."));

}

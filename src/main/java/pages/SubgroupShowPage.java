package pages;// Сведения о подгруппе
//  /ru/tko/control/subgroup/813/show

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SubgroupShowPage {

    // Тайтл
    private SelenideElement titleToPage       = $x("//h1[contains(text(),'Контингент')]");

    // Табы на странице
    private SelenideElement fullListTab       = $x("//span[contains(text(),'Полный список')]/..");                                                       // 'Полный список'
    private SelenideElement groupsTab         = $x("//span[contains(text(),'Группы')]/..");                                                              // 'Группы'
    private SelenideElement subgroupsTab      = $x("//span[contains(text(),'Подгруппы')]/..");                                                           // 'Подгруппы'
    private SelenideElement cathedraTab       = $x("//span[contains(text(),'Кафедры')]/..");                                                             // 'Кафедры'
    private SelenideElement archiveTab        = $x("//div[@class='container-content-head__tabs-wrapper']//span[contains(text(),'Архив')]/..");           // 'Архив'

    // Кнопки
    private SelenideElement editBtn           = $x("//a[contains(@class,'s-btn--thm-orange')]");     // Кнопка 'Редактировать'

    // Таблица
    private SelenideElement nameRow           = $x("//td[contains(text(),'Название')]");
    private SelenideElement specialtyRow      = $x("//td[contains(text(),'Специальность')]");
    private SelenideElement qualificationRow  = $x("//td[contains(text(),'Квалификация')]");
    private SelenideElement courseRow         = $x("//td[contains(text(),'Курс')]");
    private SelenideElement groupRow          = $x("//td[contains(text(),'Группа')]");









}

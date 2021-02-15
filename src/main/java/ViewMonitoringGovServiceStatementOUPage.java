// Мониторинг_Гос. услуг_Просмотр заявки
// Сотрудник ОУ
//  /ru/tko/control/monitoring/gov-service-statements/4923

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ViewMonitoringGovServiceStatementOUPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Заявление')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                           // 'Назад'

    // Title on table / Тайтлы в таблице
    private SelenideElement contingentInformationTitleInTheTable = $x("//span[contains(text(),'Общие сведения')]");
    private SelenideElement educationInformationTitleInTheTable = $x("//span[contains(text(),'Документы')]");
    private SelenideElement progressInformationTitleInTheTable = $x("//span[contains(text(),'Статус')]");

    // Если статус "Отказано в подписании"
    private SelenideElement informationAboutTrainingProgramsTitleInTheTable = $x("//span[contains(text(),'Не были вложены:')]");

    // Заявление на академический отпуск -> Документы
    private SelenideElement freeFormApplicationView = $x("//td[contains(text(),'Заявление в свободной форме')]/following-sibling::td/a");                    // 'Заявление в свободной форме'
    private SelenideElement decisionReasonLeaveArmyView = $x("//td[contains(text(),'Повестка о призыве на воинскую службу')]/following-sibling::td/a");      // 'Повестка о призыве на воинскую службу'

    // Выдача дубликатов документов - Документы не прикладываются (уточнить)

    // Предоставление бесплатного питания
    private SelenideElement freeFoodStatementView = $x("//td[contains(text(),'Заявление установленной формы')]/following-sibling::td/a");                    // 'Заявление установленной формы'

    // Предоставление общежития
    private SelenideElement freeDormitoryStatementView = $x("//td[contains(text(),'места в общежитии')]/following-sibling::td/a");                           // 'Заявление о предоставлении места в общежитии в форме электронного документа, удостоверенного ЭЦП услугополучателя'

    // Заявка на перевод/восстановление
    // Документы: Заявление в свободной форме и Копия из зачетной книжки
    private SelenideElement transferRecordBookView = $x("//td[contains(text(),'Копия из зачетной книжки')]/following-sibling::td/a");                        // 'Копия из зачетной книжки'

    // Выдача справки о неоконченном образовании
    // Документы: Заявление в свободной форме

    private SelenideElement additionalInformationTitleInTheTable = $x("//span[contains(text(),'Дополнительные сведения')]");
    private SelenideElement activityDetailsInformationTitleInTheTable = $x("//span[contains(text(),'Сведения об активности')]");
    private SelenideElement informationAboutSocialStatusTitleInTheTable = $x("//span[contains(text(),'Сведения о социальном статусе')]");


}

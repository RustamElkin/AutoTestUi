// Приемная комиссия_Просмотр заявки
//  /ru/tko/control/statement/show/3263?from_monitoring=1

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StatementShowFromMonitoringPage {

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Просмотр заявки')]");

    // Табы на странице
    private SelenideElement backTab     = $x("//span[contains(text(),'Назад')]/..");                                                             // 'Назад'

    // Кнопки
    private SelenideElement approveBtn  = $x("//div[@data-target=\"#modal-approve-candidate-14864\" and contains(@class, 's-btn--thm-green')]"); // 'Назад'
    private SelenideElement reworkBtn   = $x("//div[@data-target=\"#modal-approve-candidate-14864\" and contains(@class, 's-btn--thm-blue')]");  // 'На доработку'
    private SelenideElement rejectBtn   = $x("//div[@data-target=\"#modal-approve-candidate-14864\" and contains(@class, 's-btn--thm-red')]");   // 'Отклонить'

    // Тайтлы на странице
    private SelenideElement legalRepresentativeInformation  = $x("//h3[contains(text(),'Сведения о законном представителе')]");  // 'Сведения о законном представителе'
    private SelenideElement applicantInformation            = $x("//h3[contains(text(),'Сведения об абитуриенте')]");            // 'Сведения об абитуриенте'
    private SelenideElement educationInformation            = $x("//h3[contains(text(),'Сведения об образовании')]");            // 'Сведения об образовании'
    private SelenideElement documents                       = $x("//h3[contains(text(),'Документы')]");                          // 'Документы'

}
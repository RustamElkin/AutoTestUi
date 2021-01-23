// Расписание экзаменов
//  /ru/tko/control/exam-training-schedule

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExamTrainingSchedulePage {


    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Расписание')]");


    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Вернуться назад')]/..");                 // должно быть 'Назад' ждем фикса

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // На странице 500-ая ошибка


}

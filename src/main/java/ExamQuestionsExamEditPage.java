// Просмотр и редактирование экзаменационных вопросов
//  /ru/tko/exam-questions/111/exam-edit

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ExamQuestionsExamEditPage {

    //Добить\\

    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Редактирование экзаменационных вопросов')]");

    // Табы на странице
    private SelenideElement backTab = $x("//span[contains(text(),'Назад')]/..");                                // 'Назад'

    // Кнопки
    private SelenideElement createQuestionBtn = $x("//div[contains(text(),'Создать вопрос')]/../..");          // Создать вопрос'

    private SelenideElement settingsBtn = $x("//div[contains(text(),'Настройки')]/../..");                      // Настройки'

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // exam-questions form "Новый вопрос"

    // Кнопки при создании нового вопроса
    private SelenideElement  cancelCreateQuestionBtn = $x("//b[contains(text(),'Новый вопрос')]/..//following-sibling::div/button[1]"); // 'Отменить изменение вопроса'
    private SelenideElement  saveNewQuestionBtn = $x("//b[contains(text(),'Новый вопрос')]/..//following-sibling::div/button[2]");      // 'Сохранить вопрос'

    // Добавление кнопкой ответов в новый вопрос. По умолчанию их два.
    private SelenideElement  addNewAnswerBtn = $x("//form[1]//i[@class=\"s-ico--thm-plus s-ico\"]");                                    // 'Создать ответ'

    // Добавив новые ответы их можно сделать "Верными ответами".
    // В этом диве div[@class='row exam-questions__answer'][3] изменяем индекс
    private SelenideElement  correctAnswerToggle = $x("//form[1]//div[@class='row exam-questions__answer'][3]//div[@class='sn-toggle__track']//preceding-sibling::input");  // "Переключатель верный ответ"

    // Удалить ответ можно по индексу в div[@class="row exam-questions__answer"][3], я выбрал последний созданный, и удалю его. Последний третий.
    // Если ответов меньше трех, они не удаляются.

    private SelenideElement  deleteAnswerBtn = $x("//form[1]//div[@class=\"row exam-questions__answer\"][3]//i[@class=\"s-ico--thm-trash s-ico\"]");   // 'Удалить ответ'

    // Кнопка настройки видимости вопросов.
    private SelenideElement  visibilitySettingsBtn = $x("//div[contains(text(),'Настройки')]/../..");

    // Открывается модалка с кинотеатром где указаны кнопки с количеством вопросов. Чтобы включить или выключить конкретный вопрос, меняем индекс в //div[@class="col-auto mb-10"][3]
    private SelenideElement  selectVisibileQuestionsBtn = $x("(//div[@class='col-auto mb-10'])[3]");

    // Кнопка "Скрыть все" //////// нажав модалка закрывается
    private SelenideElement  selectAllAnswerHideBtn = $x("//div[contains(text(),'Скрыть все')]/../..");

    // Кнопка "Показать все" ////// тут надо самому закрыть модалку
    private SelenideElement  selectAllAnswerShowBtn = $x("//div[contains(text(),'Показать все')]/../..");

    // Кнопка "Закрыть" модальное окно
    private SelenideElement  closeModalBtn = $x("//button[@type='button']//div[contains(text(),'Закрыть')]/../..");

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Редактирование готовых вопросов (чтобы поменять вопрос для теста, меняем индекс в div[@class='exam-questions__item'][3]), вместо тройки ставим номер вопроса.

    // Кнопка Активатции и декативации вопроса
    private SelenideElement  activationDeactivationBtn = $x("//div[@class='exam-questions__item'][3]//i[@class='s-ico--thm-eye s-ico']/../../../button[1]"); // 'Вопрос активен'

    // Кнопка показать ответы
    private SelenideElement showAnswerBtn = $x("//div[@class='exam-questions__item'][3]//div[contains(text(),'Показать')]");                                 // 'Показать ответы'

    // Кнопка редактирования вопроса
    private SelenideElement editQuestionBtn = $x("//div[@class='exam-questions__item'][3]//i[@class='s-ico--thm-eye s-ico']/../../../button[2]");            // 'Редактировать вопрос'

    // Нажав редактировать появляется дополнительно три кнопки: Удалить, Отменить, Сохранить вопрос.

    private SelenideElement  deleteQuestionBtn = $x("//div[@class='exam-questions__item'][3]//i[@class='s-ico--thm-eye s-ico']/../../../button[2]"); // 'Удалить вопрос'
    private SelenideElement  undoQuestionChangeBtn = $x("//div[@class='exam-questions__item'][3]//i[@class='s-ico--thm-eye s-ico']/../../../button[3]"); // 'Отменить изменение вопроса'
    private SelenideElement  saveQuestionBtn = $x("//div[@class='exam-questions__item'][3]//i[@class='s-ico--thm-eye s-ico']/../../../button[4]"); // 'Сохранить вопрос'

    /////////////Все описанное выше для третьего вопроса. Номер вопроса меняется в div[@class='exam-questions__item'][3]




















}

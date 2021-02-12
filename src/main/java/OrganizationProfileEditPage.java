// Редактирование профиля колледжа
//  /ru/tko/organization-profile/edit

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class OrganizationProfileEditPage {
    // Тайтл
    private SelenideElement titleToPage = $x("//h1[contains(text(),'Редактирование профиля колледжа')]");

    // Табы на странице
    private SelenideElement organizationTab = $x("//span[contains(text(),'Организация')]/..");                                      // 'Организация'
    private SelenideElement registrationInformationTab = $x("//span[contains(text(),'Регистрационные сведения')]/..");              // 'Регистрационные сведения'
    private SelenideElement materialAndTechnicalBaseTab = $x("//span[contains(text(),'МТБ')]/..");                                  // 'МТБ'

    // Кнопка добавить фото организации
    private SelenideElement organizationPhotoAdd = $x("//div[@id='avatar_criteries']");
    private ElementsCollection organizationPhotoEditList = $$x("//div[contains(@class,'college-block__image college-block__image-edit')]");

    // Инпуты
    private SelenideElement fullNameDirector = $x("//input[@name='director']");                                                     // 'ФИО первого руководителя'
    private SelenideElement nameRu = $x("//input[@name='translate[ru][name]']");                                                    // 'Название Ru'
    private SelenideElement shortName = $x("//input[@name='translate[ru][short_name]']");                                           // 'Короткое название'
    private SelenideElement addressRu = $x("//input[@name='translate[ru][address]']");                                              // 'Адрес'
    private SelenideElement nameKz = $x("//input[@name='translate[kz][name]']");                                                    // 'Название Kz'
    private SelenideElement shortNameKz = $x("//input[@name='translate[kz][short_name]']");                                         // 'Короткое название Kz'
    private SelenideElement addressKz = $x("//input[@name='translate[kz][address]']");                                              // 'Адрес Kz'
    private SelenideElement phone = $x("//input[@name='phone_number']");                                                            // 'Контактный телефон'
    private SelenideElement email = $x("//input[@name='email' and @placeholder='Введите Ваш e-mail']");                             // 'Адрес электронной почты'
    private SelenideElement webSite = $x("//input[@name='website']");                                                               // 'Официальный интернет-ресурс'
    private SelenideElement eduLang = $x("//input[@type='search' and @role='searchbox']");                                          // 'Язык обучения'
    private SelenideElement descriptionRu = $x("//textarea[@name='translate[ru][body]']");                                          // 'Описание Ru'
    private SelenideElement admissionConditionsRu = $x("//textarea[@name='translate[ru][conditions_of_admission]']");               // 'Условия поступления Ru'
    private SelenideElement descriptionKz = $x("//textarea[@name='translate[kz][body]']");                                          // 'Описание Kz'
    private SelenideElement admissionConditionsKZ = $x("//textarea[@name='translate[kz][conditions_of_admission]']");               // 'Условия поступления Kz'
    private SelenideElement longitude = $x("//input[@name='longitude']");                                                           // 'Долгота'
    private SelenideElement latitude = $x("//input[@name='latitude']");                                                             // 'Широта'

    // Кнопки
    private SelenideElement saveBtn = $x("//button[contains(text(),'Сохранить') and @type='submit']");                              // 'Сохранить'


    // Модалки в Iframe
    // Кнопки в модалке при загрузке изображений
    private SelenideElement closeModal = $x("//button[@class='s-modal__close']");                                                   // 'Закрыть'
    private SelenideElement cancelBtnInModal = $x("//div[contains(@class,'s-btn--thm-grey') and @data-target=\"#modal-avatar-upload\"]");  // "Отмена"
    private SelenideElement overviewBtnInModal = $x("//div[contains(@class,'modal-avatar-upload-btn')]");                           // 'Обзор'

    // Кнопки в модалке при редактировании фото
    private SelenideElement editFotoCloseModal = $x("//button[@class='s-modal__close modal-avatar-makeup__close']");                // 'Закрыть'
    private SelenideElement editFotoCancelBtnInModal = $x("//div[contains(@class,'s-btn--thm-grey modal-avatar-makeup__close')]");  // "Отмена"
    private SelenideElement editFotoSaveBtnInModal = $x("//button[contains(@class,'s-btn--thm-green') and @id='cropInit']");        // 'Сохранить'
    private SelenideElement editFotoRotateLeft = $x("//button[@id='rotateLeft' and @title='Поворот -90']");                         // 'Поворот -90'
    private SelenideElement editFotoRotateRight = $x("//button[@id='rotateRight' and @title='Поворот +90']");                       // "Поворот +90"
    private SelenideElement editFotoDeleteBtn = $x("//button[@id='deleteAva' and @title='Удалить']");                               // 'Удалить'

}

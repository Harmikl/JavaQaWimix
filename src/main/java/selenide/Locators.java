package selenide;

public class Locators  {
       static String
               BASE_URL = "https://www.google.com/",
       TAB_ITEMS = "div > a",
    SEARCH_FIELD_VALUE = "Wimix",
       WIMIX_SITE = "div.yuRUbf > a",
       MORE = "div.col-12.col-lg-5.left-content > div.nav.nav-tabs > a > span",
       ABOUT_COMPANY_SELECTED = ".about-company__tab.nav-item.nav-link.active > span.about-company__tab-text",
       ABOUT_COMPANY_1 = ":nth-child(1) > span.about-company__tab-text",
       ABOUT_COMPANY_2 = ":nth-child(2) > span.about-company__tab-text",
       ABOUT_COMPANY_2_DENIS_TEXT = "#menu2 > div > div:nth-child(1) > div.leader-panel__text-block",
       DENIS_TEXT = "Denis Tolstashov – Co-Founder\nHaving a strategic mind and good feeling of the market," +
               " Denis is responsible for the growth of the company. He is also an experienced IT mentor and " +
               "co-author of several scientific papers. Apart from that, Denis deals with a relationship with " +
               "the key clients and supports mutually beneficial relations with other important customers in the long term.",
       LANGUAGE_BUTTON = "#localeSwitcher > span",
       RUSSIAN_LANGUAGE_ICON = "div>a[data-request-data=\"locale: 'ru'\"]",
       HOME_OUR_CLIENTS_TEXT = "#page-top > div > div > div.col-12.col-lg-5.left-content > h3",
       INSTAGRAM_FOOTER_ICON = "#contacts > div > div > div:nth-child(6) > div > a:nth-child(1) > img",
       CONTACT_US = "body > section.contact-us > div.message__button > button",
       CONTACT_US_EMAIL_INPUT = "#white-block__form-email-popup",
       CONTACT_US_SUBMIT = "button[class=\"white-block__form-submit\"]";







}

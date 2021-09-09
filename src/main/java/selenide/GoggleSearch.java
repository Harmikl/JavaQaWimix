package selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static selenide.Locators.*;

/**
 * created by maksimkharmak , 8.09.21
 */
public class GoggleSearch extends MainClass{
    @Test
    public void someCasesForWimixSite(){
        MainClass m = new MainClass();
        m.enterValueInSearchAndEnter(SEARCH_FIELD_VALUE);
//        m.clickElementByCSS(WIMIX_SITE);
        m.getItem("div>div>div>a","wimix.by","href");
        m.clickElementByCSS(MORE);
        m.compareText(TAB_ITEMS+ABOUT_COMPANY_SELECTED, "who we are");
        m.clickElementByCSS(TAB_ITEMS+ABOUT_COMPANY_2);
        m.compareText(ABOUT_COMPANY_2_DENIS_TEXT, DENIS_TEXT);
        m.compareText(TAB_ITEMS+ABOUT_COMPANY_SELECTED,"leaders");
        m.clickElementByCSS(LANGUAGE_BUTTON);
        m.clickElementByCSS(RUSSIAN_LANGUAGE_ICON);
        m.compareText(HOME_OUR_CLIENTS_TEXT,"наши клиенты");
        m.scrollToFind(INSTAGRAM_FOOTER_ICON);
        m.clickElementByCSS(CONTACT_US);
        m.setValueInInput(CONTACT_US_EMAIL_INPUT,"111");
        m.clickElementByCSS(CONTACT_US_SUBMIT);
    }
}

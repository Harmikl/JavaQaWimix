package selenide;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import junit.textui.TestRunner;
import org.junit.jupiter.api.TestMethodOrder;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static selenide.Locators.*;

/**
 * created by maksimkharmak , 8.09.21
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class   )
public class GoggleSearchTest extends MainClass{
@Test
    public void someCasesForWimixSite(){
        MainClass m = new MainClass();
        m.enterValueInSearchAndEnter(SEARCH_FIELD_VALUE);
        m.getItemAndClick(LIST_OF_VALUES_ON_GOOGLE_SEARCH,"wimix.by");
        m.clickElement(MORE);
        m.compareText(TAB_ITEMS+ABOUT_COMPANY_SELECTED, "who we are");
        m.clickElement(TAB_ITEMS+ABOUT_COMPANY_2);
        m.compareText(ABOUT_COMPANY_2_DENIS_TEXT.toLowerCase(), DENIS_TEXT.toLowerCase());
        m.compareText(TAB_ITEMS+ABOUT_COMPANY_SELECTED,"leaders");
        m.clickElement(LANGUAGE_BUTTON);
        m.clickElement(RUSSIAN_LANGUAGE_ICON);
        m.compareText(HOME_OUR_CLIENTS_TEXT,"наши клиенты");
        m.scrollToFind(INSTAGRAM_FOOTER_ICON);
        m.clickElement(CONTACT_US);
        m.setValueInInput(CONTACT_US_EMAIL_INPUT,"111");
        m.clickElement(CONTACT_US_SUBMIT);
    }
    @Test
    public void debug (){
        MainClass m = new MainClass();
        m.enterValueInSearchAndEnter(SEARCH_FIELD_VALUE);
        m.scrollToFindAndClick(WIMIX_SITE);
    }

    @Test
    public void someTest(){
        MainClass m = new MainClass();
        m.enterValueInSearchAndEnter(SEARCH_FIELD_VALUE);
        m.getItemAndClick(LIST_OF_VALUES_ON_GOOGLE_SEARCH,"wimix.by");
        m.clickElement(MORE);
    }
}

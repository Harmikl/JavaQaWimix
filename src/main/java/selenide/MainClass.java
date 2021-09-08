package selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * created by maksimkharmak , 8.09.21
 */
public class MainClass {
    static String
            BASE_URL = "https://www.google.com/",
            TAB_ITEMS = "div > a";

    public ElementsCollection getTabItems(){
        return $$(TAB_ITEMS);
    }
    public void enterValueInSearchAndEnter(String value){
        $(By.name("q")).setValue(value).pressEnter();
    }
    public void clickElementByCSS(String css){
        $(By.cssSelector(css)).click();
    }
    public SelenideElement getTabItem(String name){
        return getTabItems().stream().filter(tabItem -> tabItem.getAttribute("class").contains(name))
                .findFirst().orElseThrow();
    }

    public boolean tabItemIsSelected(String name){
        return getTabItem(name).getAttribute("class").contains("about-company__tab nav-item nav-link");
    }
}

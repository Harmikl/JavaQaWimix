package selenide;


import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static com.codeborne.selenide.Configuration.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static selenide.Locators.*;

/**
 * created by maksimkharmak , 8.09.21
 */
@ExtendWith({SetUp.class})
public class MainClass extends TestSuitte {
    @BeforeAll
    static void setUp() {
        timeout = 10000;
        startMaximized = true;
        browser = "chrome";
        open(BASE_URL);
    }


    public ElementsCollection getItems(String items_locator){
        return $$(items_locator);
    }
    public void setValueInInput(String locator, String value){
        $(By.cssSelector(locator)).setValue(value);
    }
    public void enterValueInSearchAndEnter(String value){
        $(By.name("q")).setValue(value).pressEnter();
    }
    public void clickElementByCSS(String css){
        $(By.cssSelector(css)).click();
    }

    public void clickElementByXpath(String xpath){
        $(By.xpath(xpath));
    }
    public void clickElementById(String id){
        $(By.id(id));
    }
    public void getItem(String items_locator, String contains){
         getItems(items_locator).stream().filter(tabItem -> tabItem.getText().contains(contains))
                .findFirst().orElseThrow().click();
    }

     public void compareText(String css, String expected_string){
         $(By.cssSelector(css)).shouldHave(Condition.text(expected_string.toLowerCase()));
        Assert.assertEquals(expected_string.toLowerCase(),$(By.cssSelector(css)).getText().toLowerCase());
     }

     public void compareAttribute(String css, String expected_attribute, String actual_attribute){
         Assert.assertEquals(expected_attribute.toLowerCase(),$(By.cssSelector(css)).getAttribute(actual_attribute).toLowerCase());
     }
     public void scrollToFind(String locator){
        $(By.cssSelector(locator)).scrollIntoView(true);
     }
     public void scrollToFindAndClick(String locator){
        $(By.cssSelector(locator)).scrollIntoView(true).click();
     }
}

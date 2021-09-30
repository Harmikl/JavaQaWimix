package selenide;


import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static com.codeborne.selenide.Configuration.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.regex.Pattern;

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

    public By getLocatorByString(String locator_with_type) {
        String[] exploded_locator = locator_with_type.split(Pattern.quote(":"), 2); // делим строку на 2 части по символу :
        String by_type = exploded_locator[0]; // сюда передается первая часть
        String locator = exploded_locator[1]; // сюда вторая

        if (by_type.equals("xpath")) {
            return By.xpath(locator);

        } else if (by_type.equals("id")) {
            return By.id(locator);
        } else if (by_type.equals("css")) {
            System.out.println(locator.replaceAll("css:",""));
            return By.cssSelector(locator.replaceAll("css:",""));
        } else {
            throw new IllegalArgumentException("Cannot get type of locator. Locator " + locator_with_type);
        }
    }

    public ElementsCollection getItems(String items_locator){
        By by = this.getLocatorByString(items_locator);
        return $$(by);
    }
    public void setValueInInput(String locator, String value){
        By by = this.getLocatorByString(locator);
        $(by).setValue(value);
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

    public void clickElement(String locator){
        By by = this.getLocatorByString(locator);
        $(by);
    }

    public void getItemAndClick(String items_locator, String contains){
         getItems(items_locator).stream().filter(tabItem -> tabItem.getText().contains(contains))
                .findFirst().orElseThrow().click();
    }

     public void compareText(String locator, String expected_string){
         By by = this.getLocatorByString(locator);
         $(by).shouldHave(Condition.text(expected_string.toLowerCase()));
        Assert.assertEquals(expected_string.toLowerCase(),$(by).getText().toLowerCase());
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

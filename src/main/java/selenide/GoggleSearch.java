package selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static selenide.MainClass.BASE_URL;

/**
 * created by maksimkharmak , 8.09.21
 */
public class GoggleSearch extends MainClass{
    @Test
    public void enterKeyWordsInSearchLine(){
        MainClass m = new MainClass();
        open(BASE_URL);
        m.enterValueInSearchAndEnter("Wimix");
        m.clickElementByCSS("div.yuRUbf > a");
        m.clickElementByCSS("div.col-12.col-lg-5.left-content > div.nav.nav-tabs > a > span");
        m.tabItemIsSelected("about-company__tab nav-item nav-link active show");
        $(By.cssSelector("#contacts > div > div > div:nth-child(3) > div:nth-child(1) > a"))
                .scrollIntoView(true).click();


    }
}

package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    final SelenideElement sidenav = $("[id='sidenavToggleArrow']");

    public void pageOpen() {
        sidenav.should(Condition.exist).shouldBe(Condition.visible);
    }
}

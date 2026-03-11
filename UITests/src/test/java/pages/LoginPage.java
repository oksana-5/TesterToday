package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    final SelenideElement userInput = $("[id='username']");
    final SelenideElement passwordInput = $("[id='password']");
    final SelenideElement signInBtn = $("[type='submit']");

    public LoginPage openPage() {
        open("login");

        return this;
    }

    public LoginPage login() {
        userInput.setValue("sana");
        passwordInput.setValue("mvWXhY7GNLu3SVy");
        signInBtn.submit();

        return this;
    }
}

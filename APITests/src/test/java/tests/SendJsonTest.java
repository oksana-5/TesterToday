package tests;

import io.restassured.http.Cookies;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.JsonStep;
import steps.LoginStep;
import validators.JsonValidator;

public class SendJsonTest {
    private final JsonValidator validator = new JsonValidator();

    @BeforeMethod
    public void login() {
        Cookies cookies = LoginStep.login();
        JsonStep.setCookies(cookies);
    }

    @Test
    public void sendJson() {
        validator.validateSchema("{\n" +
                "                    \"name\": \"Muffin\",\n" +
                "                    \"age\": 3,\n" +
                "                    \"favourite_toys\": [\n" +
                "                        \"yarn ball\",\n" +
                "                        \"feather wand\"\n" +
                "                    ]\n" +
                "                }");
    }
}

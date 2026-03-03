package tests;

import io.restassured.http.Cookies;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.JsonStep;
import steps.LoginStep;
import validators.JsonValidator;

public class SendJsonTest {
    private final JsonValidator validator = new JsonValidator();
    private JsonStep jsonStep;

    @BeforeMethod
    public void login() {
        Cookies cookies = LoginStep.login();
        jsonStep = new JsonStep(cookies);
    }

    @Test
    public void sendJson() {
        String json = "{\n" +
                "                    \"name\": \"Muffin\",\n" +
                "                    \"age\": 3,\n" +
                "                    \"favourite_toys\": [\n" +
                "                        \"yarn ball\",\n" +
                "                        \"feather wand\"\n" +
                "                    ]\n" +
                "                }";

        Response response = jsonStep.sendJson(json);
        validator.validateSchema(response);
    }
}

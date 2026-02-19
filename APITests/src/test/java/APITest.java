import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;

public class APITest {
    @DataProvider
    public Object[][] modules() {
        return new Object[][] {
                {"qa"},
                {"scrum"},
                {"sdlc"},
                {"application-architecture"}
        };
    }

    @Test(dataProvider = "modules")
    public void introductionModules(String module) {
        given()
                .log().all()
                .when()
                .get("https://www.tester-today.com/".formatted(module))
                .then()
                .log().all()
                .statusCode(HTTP_OK);
    }
}

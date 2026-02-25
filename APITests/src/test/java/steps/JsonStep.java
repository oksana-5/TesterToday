package steps;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

import static data.Data.BASE_URL;
import static io.restassured.RestAssured.given;

public class JsonStep {
    private static Cookies cookies;

    public static void setCookies(Cookies cookies) {
        JsonStep.cookies = cookies;
    }

    public static Response sendJson(String json) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .cookies(cookies)
                .body(json)
                .when()
                .post(BASE_URL + "check/9");
    }
}

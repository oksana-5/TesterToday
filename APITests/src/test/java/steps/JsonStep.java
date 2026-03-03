package steps;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

import static data.Data.BASE_URL;
import static io.restassured.RestAssured.given;

public class JsonStep {
    private final Cookies cookies;

    public JsonStep(Cookies cookies) {
        this.cookies = cookies;
    }

    public Response sendJson(String json) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .cookies(cookies)
                .body(json)
                .when()
                .post(BASE_URL.formatted("check/9"));
    }
}

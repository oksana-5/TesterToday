package steps;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;

import static data.Data.BASE_URL;
import static io.restassured.RestAssured.given;

public class LoginStep {
    public static Cookies login() {
        Cookies cookies = given()
                .log().all()
                .contentType(ContentType.URLENC)
                .formParam("username", "sana")
                .formParam("password", "mvWXhY7GNLu3SVy")
                .when()
                .post(BASE_URL.formatted("login"))
                .then()
                .log().all()
                .statusCode(302)
                .extract().detailedCookies();

        System.out.println("LoginStep cookies: " + cookies);

        return cookies;
    }
}

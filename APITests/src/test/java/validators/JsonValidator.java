package validators;

import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonValidator {
    public void validateSchema(Response response) {
        response.then()
                .body(matchesJsonSchemaInClasspath("schemas/json_schema.json"));
    }
}

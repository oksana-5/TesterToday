package validators;

import steps.JsonStep;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonValidator {
    public void validateSchema(String json) {
        JsonStep.sendJson(json)
                .then()
                .body(matchesJsonSchemaInClasspath("schemas/json_schema.json"));
    }
}

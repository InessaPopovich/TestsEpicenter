package API;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class FirstMarchTest {

    @Test
    public void getTest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/")
                .when()
                .get("v2/pet/findByStatus?status=sold")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("json.schema.firstmarchtest"))
                .extract().response();
    }

    @Test
    public void postTest() {
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2/")
                .header("content-type", "application/json", "access-control-allow-headers", "Content-Type,api_key,Authorization")
                .when()
                .post("pet")
                .then().log().all()
                .statusCode(200)
                .extract().response();

        // 505 Server Error
    }
}

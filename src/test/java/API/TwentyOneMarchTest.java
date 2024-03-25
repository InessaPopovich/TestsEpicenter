package API;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TwentyOneMarchTest {
    @Test
    public void reqresTest1() {
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .when()
                .delete("/api/users/2")
                .then().log().all()
                .statusCode(204)
                .extract().response();
    }

    @Test
    public void reqresTest2() {
        TwentyOneMarchPojo twentyOneMarchPojo = new TwentyOneMarchPojo("morpheus", "leader");
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/")
                .when()
                .body(twentyOneMarchPojo)
                .post("/api/users")
                .then().log().all()
                .statusCode(201)
                .extract().response();
    }
}

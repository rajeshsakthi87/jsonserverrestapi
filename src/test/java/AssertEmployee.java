import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class AssertEmployee extends EmployeeConfig {

    @Test
    public void GetData()
    {
        given().
                when()
                .get("employees/8")
                .then()
                .body("emailID", equalTo("srileka@gmail.com"));


    }
    @Test
    public void Extractdatatype1()
    {
        String responsebody = get("employees/8").asString();
        System.out.println(responsebody);

    }
    @Test
    public void Extractdatatype2()
    {
        Response res =
                given().
                when().
                get("employees/9").
                then()
                .contentType(ContentType.JSON)
                .extract().response();
        String responseastring = res.asString();

    }

}

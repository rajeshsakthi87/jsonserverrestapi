import org.junit.Test;
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;

public class PostRequest extends EmployeeConfig {

    @Test
    public void CreateNewEmployee ()
    {
        String requestbody = "{\n" +
                "  \"id\": 9,\n" +
                "  \"firstName\": \"ambika\",\n" +
                "  \"lastName\": \"palani\",\n" +
                "  \"emailID\": \"ambikap@gmail.com\",\n" +
                "  \"password\": \"welcome\",\n" +
                "  \"employeeName\":\"ambika\",\n" +
                "  \"employeeStatus\":\"1\",\n" +
                "  \"phoneNumber\":\"99122034488\"\n" +
                "}";


        given()
        .body(requestbody).
        when()
        .post(EmployeeEndpoints.endpoints)
        .then();
    }
}

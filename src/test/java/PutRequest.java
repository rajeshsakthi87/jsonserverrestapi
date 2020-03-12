import org.junit.Test;
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;

public class PutRequest extends EmployeeConfig {

    @Test
    public void UpdateNewEmployee ()
    {
        String updatebody = "{\n" +
                "  \"id\": 9,\n" +
                "  \"firstName\": \"ambika\",\n" +
                "  \"lastName\": \"palani\",\n" +
                "  \"emailID\": \"ambikapalani@gmail.com\",\n" +
                "  \"password\": \"welcome\",\n" +
                "  \"employeeName\":\"ambika\",\n" +
                "  \"employeeStatus\":\"1\",\n" +
                "  \"phoneNumber\":\"99122034488\"\n" +
                "}";


        given()
                .body(updatebody).
                when()
                .put("employees/9")
                .then();
    }
}

import org.junit.Test;
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;

public class GetAllTest extends EmployeeConfig
{
    @Test
    public void getallEmployees()
    {
        given()
                .when().get(EmployeeEndpoints.endpoints)
                .then();
    }

}

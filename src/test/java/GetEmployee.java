import org.junit.Test;
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.*;
public class GetEmployee extends EmployeeConfig {
    @Test
    public void GetEmp ()
    {
        given().
                pathParam("employee_id","8")
                .get(EmployeeEndpoints.endpoints_unique)
                .then();

    }
}

import org.junit.Test;
import serviceConfig.EmployeeConfig;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends EmployeeConfig {

    @Test
    public void DeleteEmployee()
    {
        given().
        when().
        delete("employees/1").
        then();
    }
}

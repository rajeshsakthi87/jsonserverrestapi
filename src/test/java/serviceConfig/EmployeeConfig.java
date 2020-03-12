package serviceConfig;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class EmployeeConfig {
    public static RequestSpecification reqspec;
    public static ResponseSpecification resspec;
    @BeforeClass
    public static void setup()
    {
        reqspec=new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(3000)
                .addHeader( "Content-Type", "application/json")
                .addHeader("Accept","application/json")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
        resspec= new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        RestAssured.requestSpecification=reqspec;
        RestAssured.responseSpecification=resspec;

    }
}

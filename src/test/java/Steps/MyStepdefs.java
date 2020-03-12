package Steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class MyStepdefs {

    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        given().contentType(ContentType.JSON);
    }

    @When("^I perform GET for the employee id \"([^\"]*)\"$")
    public void iPerformGETForTheEmployeeId(String employeeno) {
        when().get(String.format("http://localhost.3000/employees/%s",employeeno));

    }

    @Then("^I should see the employee name as \"([^\"]*)\"$")
    public void iShouldSeeTheEmployeeNameAs(String arg0) {
    }

}

Feature: Verify different GET operations in Rest Assured

  Scenario: Verify employee name
    Given I perform GET operation for "/employees"
    When I perform GET for the employee id "1"
    Then I should see the employee name as "Rajesh"
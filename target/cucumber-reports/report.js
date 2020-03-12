$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/GETService.feature");
formatter.feature({
  "name": "Verify different GET operations in Rest Assured",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify employee name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I perform GET operation for \"/employees\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I perform GET for the employee id \"1\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see the employee name as \"Rajesh\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
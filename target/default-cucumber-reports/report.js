$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User able to login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.the_User_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account summary page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.account_summary_page_should_be_displayed()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.zerobank.stepdefinition.LoginStepDefinition.account_summary_page_should_be_displayed(LoginStepDefinition.java:42)\r\n\tat ✽.Account summary page should be displayed(file:src/test/resources/features/Login.feature:8)\r\n",
  "status": "pending"
});
formatter.after({
  "status": "passed"
});
});
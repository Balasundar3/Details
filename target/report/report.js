$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ShopBop.feature");
formatter.feature({
  "name": "To veryfied login funcation application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user to browers chrome url requied",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the username and passward appllication",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user to find validate username and invalidate passward",
  "keyword": "When "
});
formatter.match({
  "location": "StepDifinationfile.userToFindValidateUsernameAndInvalidatePassward()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDifinationfile.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "goto error page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDifinationfile.gotoErrorPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
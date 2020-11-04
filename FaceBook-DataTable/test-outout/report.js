$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/FaceBook-DataTable/src/main/java/com/Features/login3.feature");
formatter.feature({
  "line": 1,
  "name": "FaceBook Registration  Action Feature",
  "description": "",
  "id": "facebook-registration--action-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FaceBook Registration Details Test Scenario",
  "description": "",
  "id": "facebook-registration--action-feature;facebook-registration-details-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of the page is facebook",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should click on Create New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user should enter facebook details",
  "rows": [
    {
      "cells": [
        "Jayesh",
        "Vudadi",
        "jayeshkani25@gmail.com",
        "$XSM7#@25"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookDataTable.user_should_enter_the_url()"
});
formatter.result({
  "duration": 12743616300,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookDataTable.title_of_the_page_is_facebook()"
});
formatter.result({
  "duration": 2014540900,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookDataTable.user_should_click_on_Create_New_Account()"
});
formatter.result({
  "duration": 2075481600,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookDataTable.user_should_enter_facebook_registration_details(DataTable)"
});
formatter.result({
  "duration": 3178939400,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookDataTable.close_the_browser()"
});
formatter.result({
  "duration": 2834968800,
  "status": "passed"
});
});
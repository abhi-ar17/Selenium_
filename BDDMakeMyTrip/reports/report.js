$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/MakeMyTrip.feature");
formatter.feature({
  "name": "MakeMyTrip",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Book flight",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User select from_location as \u0027\u003cfrom\u003e\u0027 and to_location as \u0027\u003cto\u003e\u0027 and day as \u0027\u003cday\u003e\u0027 year as \u0027\u003cmonthyear\u003e\u0027 and search",
  "keyword": "When "
});
formatter.step({
  "name": "List of flights should be displayed and first one is selected",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters Firstname as \u0027\u003cfname\u003e\u0027 and lastname as \u0027\u003clname\u003e\u0027 and gender as \u0027\u003cgendeR\u003e\u0027 and mobilnum as \u0027\u003cphNum\u003e\u0027 and mailid as \u0027\u003cEmail\u003e\u0027",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters the payment details card number as \u0027\u003ccc\u003e\u0027 and name as \u0027\u003cname\u003e\u0027 and expirty month as \u0027\u003cmonth\u003e\u0027 and expiry year as \u0027\u003cyear\u003e\u0027 and cvv as \u0027\u003ccvv\u003e\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "from",
        "to",
        "day",
        "monthyear",
        "fname",
        "lname",
        "gendeR",
        "phNum",
        "Email",
        "cc",
        "name",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "Chenn",
        "Mumbai",
        "15",
        "April 2020",
        "Abhi",
        "A S",
        "Male",
        "8129180000",
        "asabhirag@gmail.com",
        "4567098218491947",
        "Abhi A S",
        "06",
        "24",
        "455"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launches the Make My Trip website",
  "keyword": "Given "
});
formatter.match({
  "location": "com.mmt.stepdefinition.StepDefinitions.launchBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book flight",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User select from_location as \u0027Chenn\u0027 and to_location as \u0027Mumbai\u0027 and day as \u002715\u0027 year as \u0027April 2020\u0027 and search",
  "keyword": "When "
});
formatter.match({
  "location": "com.mmt.stepdefinition.StepDefinitions.searchFlight(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "List of flights should be displayed and first one is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.mmt.stepdefinition.StepDefinitions.selectFlight()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Firstname as \u0027Abhi\u0027 and lastname as \u0027A S\u0027 and gender as \u0027Male\u0027 and mobilnum as \u00278129180000\u0027 and mailid as \u0027asabhirag@gmail.com\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.mmt.stepdefinition.StepDefinitions.passDetails(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the payment details card number as \u00274567098218491947\u0027 and name as \u0027Abhi A S\u0027 and expirty month as \u002706\u0027 and expiry year as \u002724\u0027 and cvv as \u0027455\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.mmt.stepdefinition.StepDefinitions.paymentDetails(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate element with text: 24\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HP-PC\u0027, ip: \u0027192.168.43.215\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.selectByVisibleText(Select.java:147)\r\n\tat com.mmt.pages.PaymentPage.paymentDetails(PaymentPage.java:49)\r\n\tat com.mmt.stepdefinition.StepDefinitions.paymentDetails(StepDefinitions.java:59)\r\n\tat ✽.User enters the payment details card number as \u00274567098218491947\u0027 and name as \u0027Abhi A S\u0027 and expirty month as \u002706\u0027 and expiry year as \u002724\u0027 and cvv as \u0027455\u0027(file:///C:/Users/hp/eclipse-workspace/BDDMakeMyTrip/src/main/resources/feature/MakeMyTrip.feature:12)\r\n",
  "status": "failed"
});
});
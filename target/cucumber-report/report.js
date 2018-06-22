$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/app/features/TestCases.feature");
formatter.feature({
  "name": "Searching for items",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "used to search Selenium coockbook",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Amazon.com",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.i_am_on_Amazon_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"Selenium coockbook\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Price displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Click on category link Books",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.click_on_category_link_Books()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Save the price listed under Selenium Testing Tools Cookbook - Second Edition, Paperback",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.save_the_price_listed_under_Selenium_Testing_Tools_Cookbook_Second_Edition_Paperback()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on results Selenium Testing Tools Cookbook - Second Edition",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.click_on_results_Selenium_Testing_Tools_Cookbook_Second_Edition()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that prices highlighted on the next picture match the price saved on previous step",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultsStepDefinitions.verify_that_prices_highlighted_on_the_next_picture_match_the_price_saved_on_previous_step()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
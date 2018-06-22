Feature: Searching for items

  Background: used to search Selenium coockbook
    Given I am on Amazon.com
    When Search for "Selenium coockbook"

  Scenario: Search results
    And Save the number of results to resultsOfSearch
    Then Click on category link Books
    Then Verify the number of results is smaller then resultsOfSearch
    And Click on Any Category link
    Then Verify that number of results is same as resultsOfSearch

  @tag
  Scenario: Price displayed
    Then Click on category link Books
    Then Save the price listed under Selenium Testing Tools Cookbook - Second Edition, Paperback
    And Click on results Selenium Testing Tools Cookbook - Second Edition
    Then Verify that prices highlighted on the next picture match the price saved on previous step

  Scenario: Total price
    And Click on results Selenium Testing Tools Cookbook - Second Edition
    Then Save the price
    And ClickonAddtoCart
    Then Search for OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide
    And OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808
    Then Save the price
    And Click on Add to Cart
    Then Verify the Cart subtotal price amount based on prices saved earlier

  Scenario: Removing items from cart
    And Click on results Selenium Testing Tools Cookbook - Second Edition
		And Click on Add to Cart
		Then Search for OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide
    And OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808
    Then Save the price
    And Click on Add to Cart
    And Click on button Cart
    Then Verify text Subtotal has text 2 items next to the price
    And Save the subtotal price
    And Save the price of one of the items
    Then Remove that item
    Then Verify text Subtotal has text 1 item next to the price
    And Verify the new subtotal price based previous subtotal and the price of the item removed
    
		
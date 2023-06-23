package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.app.page.SearchPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;
public class SearchResultsStepDefinitions {
	SearchPage searchPage = new SearchPage();
	WebDriver driver = Driver.getDriver();
	String resultOfSelBooks;
	String resulOfBooks;
	String priceFromResultPage;


	@Given("^I am on Amazon.com$")
	public void i_am_on_Amazon_com() {
		driver.get(ConfigurationReader.getProperty("url"));
	}

	@When("Search for {string}")
	public void search_for(String string) {
		BrowserUtils.waitForVisibility(searchPage.searchBox, 5);
		searchPage.searchBox.sendKeys(string + Keys.ENTER);
	}

	@When("^Save the number of results to resultsOfSearch$")
	public void save_the_number_of_results_to_resultsOfSearch() {
		BrowserUtils.waitForVisibility(searchPage.searchResultCount, 5);
		resultOfSelBooks = BrowserUtils.returnDigits(searchPage.searchResultCount.getText());
		System.out.println(resultOfSelBooks);

	}

	@Then("^Click on category link Books$")
	public void click_on_category_link_Books() {
		BrowserUtils.waitForVisibility(searchPage.bookLink, 5);
		searchPage.bookLink.click();


	}

	@Then("^Verify the number of results is smaller then resultsOfSearch$")
	public void verify_the_number_of_results_is_smaller_then_resultsOfSearch() {
		BrowserUtils.waitForVisibility(searchPage.searchResultCount, 5);
		resulOfBooks = BrowserUtils.returnDigits(searchPage.searchResultCount.getText());
		System.out.println(resulOfBooks);

	}

	@Then("^Click on Any Category link$")
	public void click_on_Any_Category_link() {
		BrowserUtils.waitForVisibility(searchPage.anyCategory, 5);
		searchPage.anyCategory.click();

	}

	@Then("^Verify that number of results is same as resultsOfSearch$")
	public void verify_that_number_of_results_is_same_as_resultsOfSearch() {
		BrowserUtils.waitForVisibility(searchPage.searchResultCount,5);
		assertEquals(BrowserUtils.returnDigits(searchPage.searchResultCount.getText()),resultOfSelBooks);
	}


	@Then("^Save the price listed under Selenium Testing Tools Cookbook - Second Edition, Paperback$")
	public void save_the_price_listed_under_Selenium_Testing_Tools_Cookbook_Second_Edition_Paperback() {
		BrowserUtils.waitForVisibility(searchPage.priceFromSearchPage, 2);
		System.out.println(searchPage.priceFromSearchPage.getText());

	}

	@Then("^Click on results Selenium Testing Tools Cookbook - Second Edition$")
	public void click_on_results_Selenium_Testing_Tools_Cookbook_Second_Edition() {
		searchPage.SelTestCoockBook.click();
		BrowserUtils.waitForVisibility(searchPage.resultedSelBookPrice, 5);
		System.out.println(searchPage.resultedSelBookPrice.getText());
	}

	@Then("^Verify that prices highlighted on the next picture match the price saved on previous step$")
	public void verify_that_prices_highlighted_on_the_next_picture_match_the_price_saved_on_previous_step() {

	}
}
package com.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class SearchPage {
	private WebDriver driver;
	public SearchPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBox;
	
	@FindBy(xpath="//h2[@data-attribute='Selenium Testing Tools Cookbook - Second Edition']")
	public WebElement SelTestCoockBook;
	
	@FindBy(id="s-result-count")
	public WebElement searchResultCount;
	
	@FindBy(xpath="(//h4[@class='a-size-small a-spacing-top-mini a-color-base a-text-bold'])[1]")
	public WebElement bookLink;
	
	@FindBy(xpath="(//span[@class='a-size-small a-color-base'])[1]")
	public WebElement anyCategory;
	
	@FindBy(xpath="(//span[@class='sx-price sx-price-large'])[1]")
	public WebElement priceFromSearchPage;
	
	@FindBy(linkText="Selenium Testing Tools Cookbook - Second Edition")
	public WebElement SelTeToolCookBSeEd;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-price header-price']")
	public WebElement resultedSelBookPrice;
	
	
	
	
	
}

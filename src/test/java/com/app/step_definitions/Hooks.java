package com.app.step_definitions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.app.utilities.Driver;


public class Hooks {

	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver.getDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window();
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			File srsFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

			String currentDirectory = System.getProperty("user.dir");

			currentDirectory = currentDirectory + "/target/reports/ss.png";

			File destFile = new File(currentDirectory);

			currentDirectory = currentDirectory + "/ss.png";

			FileUtils.copyFile(srsFile,destFile);
		}
		// Driver.closeDriver();
	}

}

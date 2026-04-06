package tests;

import utils.ConfigReader;
import pages.InputsPage;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class InputsTest extends BaseTest {
	InputsPage inputsPage ;
	ConfigReader config ;
	@BeforeMethod
	public void beforeTest() {
		inputsPage = new InputsPage(page);
		config = new ConfigReader();
		page.navigate(config.get("inputspage"));
	}

	@Test(priority=0)
	public void verifyNumberInput()
	{

		inputsPage.inputNumber("3452156");
		assertThat(page.locator("#output-number")).isVisible();
		Assert.assertEquals(page.locator("#output-number").inputValue(), "3452156");
	}


	@Test(priority=1)
	public void verifyTextInput()
	{

		inputsPage.inputText("testing");
		assertThat(page.locator("#output-text")).isVisible();
		Assert.assertEquals(page.locator("#output-text").inputValue(), "testing");

	}


	@Test(priority=2)
	public void verifyPwdInput()
	{

		inputsPage.inputPwd("password");
		assertThat(page.locator("#output-password")).isVisible();
		Assert.assertEquals(page.locator("#output-password").inputValue(), "password");
	}


	@Test(priority=3)
	public void verifyDateInput()
	{

		Locator dt = inputsPage.dateField();
		
		page.fill("#date", "10/04/2026");  // format: yyyy-MM-dd
		Assert.assertTrue(dt.isVisible());
	}


}
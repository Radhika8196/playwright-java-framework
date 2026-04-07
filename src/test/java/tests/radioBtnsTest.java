package tests;

import utils.ConfigReader;
import pages.InputsPage;
import pages.LoginPage;
import pages.RadioBtns;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class radioBtnsTest extends BaseTest {
	RadioBtns radioBtns ;
	ConfigReader config ;
	
	@BeforeMethod
	public void beforeTest() {
		radioBtns = new RadioBtns(page);
		config = new ConfigReader();
		page.navigate(config.get("radiobtnspage"));
	}

	@Test(priority=0)
	public void verifyBlueRadio()
	{

		radioBtns.clickRB("blue");
		System.out.println();
		assertThat(page.locator("#blue")).isChecked();
	
	}



}
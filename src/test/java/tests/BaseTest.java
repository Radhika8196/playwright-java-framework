package tests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


import com.microsoft.playwright.Page;

import utils.PlaywrightFactory;

public class BaseTest {

    protected PlaywrightFactory factory;
    protected Page page;

    @BeforeSuite
    public void setup() {
        factory = new PlaywrightFactory();
        page = factory.initBrowser();
    }

    @AfterSuite
    public void tearDown() {
        factory.close();;
    }
}
package com.cyan.authentication.tests;

import com.cyan.authentication.common.Browser;
import com.cyan.authentication.pageobjects.HomePage;
import com.cyan.authentication.pages.Login;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
    public WebDriver driver;

    @BeforeSuite
    public void setUp(){
        this.driver = Browser.getDriver();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }

    @Test
    public void validUsernameAndValidPasswordLoginTest(){
        Login login = new Login(driver);
        login.perform("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(login.contains("You logged into a secure area!"));
    }

    /*

	@Test
	public void validUsernameAndInvalidPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform(" tomsmith", "LowSecretPassword");
		Assert.assertTrue(HomePage.contains("Your password is invalid!"));
	}
	@Test
	public void invalidUsernameAndValidPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("MaxMustermann", "SuperSecretPassword!");
		Assert.assertTrue(HomePage.contains("Your username is invalid!"));
	}
	@Test
	public void invalidUsernameAndInvalidPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("MaxMustermann", "LowSecretPassword");
		Assert.assertTrue(HomePage.contains("Your username is invalid!"));
	}

     */
}

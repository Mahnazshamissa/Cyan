package com.cyan.authentication.pages;

import com.cyan.authentication.common.BasePage;
import com.cyan.authentication.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login extends BasePage {
    /**
     * The home page.
     */
    HomePage homePage;

    /**
     * Instantiates a new login.
     *
     * @param driver the driver
     */
    public Login(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    /**
     * Perform.
     *
     * @param username the username
     * @param password the password
     */
    public void perform(String username, String password) throws InterruptedException {
        openUrl("http://the-internet.herokuapp.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fillIn(homePage.txtUsername, username);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fillIn(homePage.txtPassword, password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(homePage.btnLogin);
        Thread.sleep(5000);
    }

    /**
     * Gets the error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
        return getText(homePage.lblLoginErrorMsg);
    }

}

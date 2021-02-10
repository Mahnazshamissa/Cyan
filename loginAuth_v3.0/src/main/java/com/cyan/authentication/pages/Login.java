package com.cyan.authentication.pages;

import com.cyan.authentication.common.BasePage;
import com.cyan.authentication.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
    public void perform(String username, String password) {
        openUrl("http://the-internet.herokuapp.com/login");
        fillIn(homePage.txtUsername, username);
        fillIn(homePage.txtPassword, password);
        click(homePage.btnLogin);
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

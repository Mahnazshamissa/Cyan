package com.cyan.authentication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    /** The username. */
    @FindBy(how= How.ID,using="Useername")
    public WebElement txtUsername;

    /** The password textfield. */
    @FindBy(how= How.ID,using="Password")
    public WebElement txtPassword;

    /** The button for signing in. */
    //@FindBy(how= How.ID,using="Login")
    //public WebElement btnLogin;

    /** The button for signing in. */
    @FindBy(how= How.XPATH,using="//*[@id=\"login\"]/button/i")
    public WebElement btnLogin;

    /** The label login error msg. */
    @FindBy(how= How.ID,using="errormsg")
    public WebElement lblLoginErrorMsg;

    public static Boolean contains(String s) {
        return true;
    }
}

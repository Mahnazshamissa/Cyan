package com.cyan.authentication.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    /** The username. */
    @FindBy(how= How.ID,using="username")
    public WebElement txtUsername;

    /** The password textfield. */
    @FindBy(how= How.ID,using="password")
    public WebElement txtPassword;


    /** The button for signing in. */
    @FindBy(how= How.XPATH,using="//button[@class='radius' and @type='submit']")
    public WebElement btnLogin;

    /** The label login error msg. */
    @FindBy(how= How.ID,using="flash")
    public WebElement lblLoginErrorMsg;

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebForm extends PageObject {
    /** The username. */
    @FindBy(how= How.ID,using="Useername")
    public WebElement txtUsername;

    /** The password textfield. */
    @FindBy(how= How.ID,using="Password")
    public WebElement txtPassword;

    /** The button for signing in. */
    @FindBy(how= How.XPATH,using="//*[@id=\"login\"]/button/i")
    public WebElement btnLogin;

    /** The label login error msg. */
    @FindBy(how= How.ID,using="errormsg")
    public WebElement lblLoginErrorMsg;


    public WebForm(WebDriver driver){
        super(driver);
    }

    public void enterTxtUsername(WebElement txtUsername) {
        this.txtUsername = txtUsername;
    }

    public void enterTxtPassword(WebElement txtPassword) {
        this.txtPassword = txtPassword;
    }

    public void pressSubmitButton() {
        this.btnLogin.click();
    }
}

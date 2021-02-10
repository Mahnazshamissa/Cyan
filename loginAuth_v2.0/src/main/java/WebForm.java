import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebForm extends PageObject {

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
    @FindBy(how= How.ID,using="errormsg")
    public WebElement lblLoginErrorMsg;


    public WebForm(WebDriver driver){
        super(driver);
    }


    public void enterTxtUsername(WebElement txtUsername) {
        this.txtUsername = txtUsername;
        txtUsername.sendKeys("tomsmith");
    }

    public void enterTxtPassword(WebElement txtPassword) {
        this.txtPassword = txtPassword;
        txtPassword.sendKeys("SuperSecretPassword!");
    }

    public void pressSubmitButton() {
        this.btnLogin.click();
    }

}

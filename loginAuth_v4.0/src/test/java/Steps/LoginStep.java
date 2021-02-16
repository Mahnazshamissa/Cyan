package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    
    @Given("user navigates to http:\\/\\/the-internet.herokuapp.com\\/login")
    public void userNavigatesToHttpTheInternetHerokuappComLogin() {
    }

    @When("user logs in using Username as <username> and Password <password>")
    public void userLogsInUsingUsernameAsUsernameAndPasswordPassword() {
    }

    @And("user enters the following for Login")
    public void userEntersTheFollowingForLogin() {
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
    }

    @Then("error message should throw")
    public void errorMessageShouldThrow() {
    }
}

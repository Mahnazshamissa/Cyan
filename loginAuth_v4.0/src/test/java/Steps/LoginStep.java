package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
    }

    @And("I enter the username and password")
    public void iEnterTheUsernameAndPassword() {
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        table.row(0);
    }


    @And("I enter <username> and <password>")
    public void iEnterUsernameAndPassword() {
    }


}

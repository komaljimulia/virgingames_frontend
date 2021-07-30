package com.virgingames.stepdefs;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @And("^I enter  \"([^\"]*)\" in username field$")
    public void iEnterInUsernameField(String userName)  {
        new LoginPage().sendEmailId(userName);

    }

    @And("^I enter  \"([^\"]*)\" in password field$")
    public void iEnterInPasswordField(String password)  {
       new LoginPage().sendPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("^I should see error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String errorMessage)  {
        Assert.assertEquals(errorMessage,new LoginPage().invalidLogin());

    }
}

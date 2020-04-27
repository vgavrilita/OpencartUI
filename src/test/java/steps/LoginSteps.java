package steps;

import base.BaseUtil;
import pageModels.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.List;

public class LoginSteps extends BaseUtil {
    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    String url = "https://demo.opencart.com/";

    @Given("User navigate to Home page")
    public void userNavigateToHomePage() {
        base.Driver.navigate().to(url);
    }

    @And("User navigate to Login page using My Account Dropdown")
    public void userNavigateToLoginPageUsingMyAccountDropdown() {
        LoginPage dropdown = new LoginPage(base.Driver);
        dropdown.Dropdown();
        dropdown.LoginElementDropDown();

    }

    @And("User enter valid username as {string} and password as {string}")
    public void userEnterValidUsernameAsAndPasswordAs(String username, String password) {
        LoginPage page = new LoginPage(base.Driver);
        page.Login(username, password);

    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {

        LoginPage page = new LoginPage(base.Driver);
        page.clickLogin();

    }

    @Then("User is logged into account")
    public void userIsLoggedIntoAccount() {
        Assert.assertEquals("User is not logged in", base.Driver.findElement(By.id("account-account")).isDisplayed(), true);

    }

    @And("User enter valid credentials")
    public void userEnterValidCredentials(DataTable table) {

        List<List<String>> users = table.asLists(String.class);
        String username = users.get(1).get(0);
        String password = users.get(1).get(1);

        LoginPage page = new LoginPage(base.Driver);
        page.Login(username, password);
        /*
        List<List<String>> data = table.asLists();
        List<User> users= new ArrayList<User>();
        for (User user : users) {
            page.Login(user.username, user.password);
            System.out.println(user.username);
            System.out.println(user.password);
        }*/
    }

    @And("User enter valid ([^\"]*) and ([^\"]*)$")
    public void userEnterValidUsernameAndPassword(String userName, String passWord) {
        LoginPage page = new LoginPage(base.Driver);
        page.Login(userName, passWord);
        System.out.println(userName + passWord);

    }

/*
    public static class User {
        public String username;
        public String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }


    }
*/
}

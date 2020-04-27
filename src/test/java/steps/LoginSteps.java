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


      /*  WebElement element= base.Driver.findElement(By.name("dropdown open"));
        Select select = new Select(element);
        select.selectByVisibleText("Login");

       */
       /* @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/a")
        private WebElement myAccountLocator;

        @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/ul/li[2]/a")
        private WebElement loginLocator;
*/

        /*
        base.Driver.findElement(By.cssSelector(".fa-user")).click();
        base.Driver.findElement(By.xpath("//a[text()='Login']")).click();
*/
      /*  WebDriverWait wait = new WebDriverWait(base.Driver,30);
        WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[2]/a")));

        */
/*
        WebElement element1= base.Driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/ul/li[2]/a"));
        element1.click();
*/
    }

    @And("User enter valid username as {string} and password as {string}")
    public void userEnterValidUsernameAsAndPasswordAs(String username, String password) {
        LoginPage page = new LoginPage(base.Driver);
        page.Login(username, password);
       /*
        base.Driver.findElement(By.id("input-email")).sendKeys(username);
        base.Driver.findElement(By.id("input-password")).sendKeys(password);
        */

    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {

        LoginPage page = new LoginPage(base.Driver);
        page.clickLogin();

        /* base.Driver.findElement(By.xpath("//input[@value='Login']")).click();

         */
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
        Map<String ,String> data=;
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

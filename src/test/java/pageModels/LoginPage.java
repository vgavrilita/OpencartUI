package pageModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(css= ".fa-user")
    public WebElement dropDown;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginElementDropDown;

    @FindBy(id = "input-email")
    public WebElement textUserName;

    @FindBy(id = "input-password")
    public WebElement textPassword;


    @FindBy(xpath = "//input[@value='Login']")
    public WebElement btnLogin;


    public void Dropdown() {
        dropDown.click();
    }

    public void LoginElementDropDown() {
        loginElementDropDown.click();
    }

    public void Login(String username, String password) {
        textUserName.sendKeys(username);
        textPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }
}

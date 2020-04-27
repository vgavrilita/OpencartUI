package steps;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageModels.Category_SubCategory;
import pageModels.EditAccountInfo;

public class EditAccountInfoSteps {
    private BaseUtil base;

    public EditAccountInfoSteps(BaseUtil base) {
        this.base = base;
    }

    @And("User click on Edit your account information from left list")
    public void userClickOnEditYourAccountInformationFromLeftList() {
        EditAccountInfo accountinfo = new EditAccountInfo(base.Driver);
        accountinfo.ClickEditAccountInfo();


    }

    @Then("User is on My Account information page")
    public void userIsOnMyAccountInformationPage() {
        EditAccountInfo accountinfo = new EditAccountInfo(base.Driver);
        String uniqueText = accountinfo.getTextMyAccountInfo();
        Assert.assertEquals("My Account Information", uniqueText);
    }

    @And("User clears phone number in Telephone field and set random {int} digits")
    public void userClearsPhoneNumberInTelephoneFieldAndSetRandomDigits(int arg0) {
        EditAccountInfo accountinfo = new EditAccountInfo(base.Driver);
        accountinfo.ClearTelephoneField();
        accountinfo.inputRandomTelephoneDigits();
    }

    @And("Continue button is clicked")
    public void continueButtonIsClicked() {
        EditAccountInfo accountinfo = new EditAccountInfo(base.Driver);
        accountinfo.clickContinuebtn();
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String arg0) {
    }
}

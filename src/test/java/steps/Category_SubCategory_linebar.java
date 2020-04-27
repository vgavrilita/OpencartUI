package steps;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageModels.Category_SubCategory;

public class Category_SubCategory_linebar {
    private BaseUtil base;

    public Category_SubCategory_linebar(BaseUtil base) {
        this.base = base;
    }

    @And("Click on Desktop category from linebar")
    public void clickOnDesktopCategoryFromLinebar() {
        Category_SubCategory linebar = new Category_SubCategory(base.Driver);
        linebar.SelectDesktopCategory();
    }

    @And("Select Mac subcategory from category dropdown")
    public void selectMacSubcategoryFromCategoryDropdown() {
        Category_SubCategory linebar = new Category_SubCategory(base.Driver);
        linebar.SelectMacSubCategory();
    }

    @Then("User is on selected subcategory page")
    public void userIsOnSelectedSubcategoryPage() {
        Category_SubCategory linebar = new Category_SubCategory(base.Driver);
        String uniqueText=linebar.getTextfromMacsubCategory();
        Assert.assertEquals("Mac",uniqueText);
    }

}

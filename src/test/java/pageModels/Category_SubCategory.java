package pageModels;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category_SubCategory {

    public Category_SubCategory(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
    public WebElement desktopCategory;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")
    public WebElement selectMacsubCategory;

    @FindBy(xpath = "//*[@id=\"content\"]/h2")
    public WebElement textMacSubcategory;


    public void SelectDesktopCategory() {
        desktopCategory.click();
    }

    public void SelectMacSubCategory() {
        selectMacsubCategory.click();
    }

    public String getTextfromMacsubCategory(){
        String text =textMacSubcategory.getText();

        return text;
    }
}

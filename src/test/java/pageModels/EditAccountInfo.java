package pageModels;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class EditAccountInfo {
    public EditAccountInfo(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[1]/a")
    public WebElement editAccountInfo;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement myAccountInfoText;

    @FindBy(id = "input-telephone")
    public WebElement inputTelephoneField;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    public WebElement continueButton;

public void ClickEditAccountInfo(){
    editAccountInfo.click();
}
    public String getTextMyAccountInfo(){
        String text =myAccountInfoText.getText();

        return text;
    }
    public void ClearTelephoneField(){

    try {
        inputTelephoneField.clear();

    }catch(Exception e){
        System.out.println("Unable to clean up the telephone text field: Exception:"+e);
        }
    }

    public void inputRandomTelephoneDigits(){
        Random rand = new Random();
        int num = rand.nextInt(9000000) + 1000000;
        inputTelephoneField.sendKeys(String.valueOf(num));
        try {
            Thread.sleep(10000);
        }catch(Exception e){

        }

    }

    public void clickContinuebtn(){
    continueButton.click();
    }

}


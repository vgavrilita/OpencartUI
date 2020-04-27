package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {
   private BaseUtil base;


    public Hook(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void InitializeTest() {
        System.out.println("Opening the Chrome browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void Teardown(Scenario scenario) {


        if (scenario.isFailed()) {
            System.out.println("Scenario failed:" + scenario);
        }
        base.Driver.close();
        System.out.println("Browser is closed");
    }

}

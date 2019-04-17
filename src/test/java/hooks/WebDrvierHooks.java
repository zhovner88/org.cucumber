package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import implementation.KnowsTheDomain;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

public class WebDrvierHooks {

    private KnowsTheDomain helper;

    public void WebDriverHooks(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @After
    public void finish(Scenario scenario) {
        try {
            byte[] screenshot =
                    helper.getWebDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        finally {
            helper.getWebDriver().close();
        }
    }

}

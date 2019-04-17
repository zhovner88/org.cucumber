package support;

import hooks.ServerHooks;
import implementation.Account;
import nicebank.Teller;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {


    private final EventFiringWebDriver webDriver;

    public AtmUserInterface(){
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\denys.zhovnerovych\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            webDriver.get("http://localhost:" + ServerHooks.PORT);
            webDriver.findElement(By.id("Amount"))
                    .sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("Withdraw")).click();
        }
        finally {
            webDriver.close();
        }
    }
}

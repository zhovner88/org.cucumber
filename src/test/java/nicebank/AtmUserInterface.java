package nicebank;

import implementation.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class AtmUserInterface implements Teller {
    private final EventFiringWebDriver webDriver;

    public AtmUserInterface(){
        this.webDriver = new EventFiringWebDriver(new FirefoxDriver());
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            webDriver.get("http://localhost:9988");
            webDriver.findElement(By.id("Amount"))
                    .sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("Withdraw")).click();
        }
        finally {
            webDriver.close();
        }
    }
}

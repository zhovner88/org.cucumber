package implementation;

import nicebank.Teller;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import support.AtmUserInterface;

public class KnowsTheDomain {

    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;
    private EventFiringWebDriver webDriver;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }

        return myAccount;
    }

    public Teller getTeller() {
        if (teller == null){
            teller = new AtmUserInterface();
        }

        return teller;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null){
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }

    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null){
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }

        return webDriver;
    }
}

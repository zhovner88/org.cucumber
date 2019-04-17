package implementation;

import nicebank.Teller;
import support.AtmUserInterface;

public class KnowsTheDomain {

    private Account myAccount;
    private nicebank.Teller teller;
    private CashSlot cashSlot;

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
}

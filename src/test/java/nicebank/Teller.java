package nicebank;

import implementation.Account;

public interface Teller {

    void withdrawFrom(Account account, int dollars);

}

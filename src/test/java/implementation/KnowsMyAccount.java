package implementation;

public class KnowsMyAccount {

    private Account myAccount;

    public Account getMyAccount() {
        if (myAccount == null){
            myAccount = new Account();
        }

        return myAccount;
    }

}

package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Account;
import implementation.Money;
import org.junit.Assert;

public class CashWithdrawalSteps {


    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(transforms.MoneyConverter.class) Money amount)
            throws Throwable {
        Account myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance -",
                amount, myAccount.getBalance());
    }

    @When("^I request \\$(\\d+)$")
    public void iRequest$(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

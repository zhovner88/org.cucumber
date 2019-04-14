package steps;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.*;
import org.junit.Assert;

public class CashWithdrawalSteps {

    KnowsMyAccount helper;
    KnowsTheDomain knowsTheDomainHelper;

    public void Steps() {
        helper = new KnowsMyAccount();
    }


    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class)Money amount)
            throws Throwable {
        helper.getMyAccount().deposit(amount);

        Assert.assertEquals("Incorrect account balance -",
                amount, helper.getMyAccount().getBalance());
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        knowsTheDomainHelper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(dollars, knowsTheDomainHelper.getCashSlot().getContents());
    }
}

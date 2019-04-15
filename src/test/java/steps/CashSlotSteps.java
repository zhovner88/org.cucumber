package steps;

import cucumber.api.java.en.Then;
import implementation.KnowsTheDomain;
import org.junit.Assert;

public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(dollars, helper.getCashSlot().getContents());
    }

}

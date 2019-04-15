package steps;

import cucumber.api.java.en.When;
import implementation.KnowsTheDomain;

public class TellerSteps {

    KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iRequest$(int dollars) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
    }

}

package steps;

import cucumber.api.java.en.*;
import cucumber.api.Transform;

import implementation.KnowsTheDomain;
import implementation.Money;
import implementation.MoneyConverter;
import org.junit.*;


public class AccountSteps {
    KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("^My account has been credited with (\\$\\d+\\.\\d+)$")
    public void myAccountHasBeenCreditedWith(@Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        helper.getMyAccount().credit(amount);
    }

    @Then("^The balance of my account should be (\\$\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        Assert.assertEquals("Incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }
}

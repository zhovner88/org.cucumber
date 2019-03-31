package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Checkout;
import org.junit.Assert;

public class BaseScenarioSteps {

    private int bananaPrice = 0;
    private Checkout checkout;

    @Given("the piece of {string} is {int}c")
    public void the_piese_of_is_c(String itemName, int price) throws Throwable {
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void i_checkout(int itemCount, String itemName) {
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);
    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        checkout = new Checkout();
        Assert.assertEquals(total, checkout.total(total));
    }
}

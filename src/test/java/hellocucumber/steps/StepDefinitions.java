package hellocucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("today is Sunday")
    public void today_is_sunday() {
        System.out.println("Um domingo.");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        System.out.println("Bem antes da sexta-feira");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println(string);
    }

}
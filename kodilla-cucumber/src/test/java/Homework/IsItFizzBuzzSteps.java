package Homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private Integer number;
    private String result;
    public IsItFizzBuzzSteps() {
        Given("The test number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I check for FizzBuzz", () -> {
            FizzOrBuzz fizzOrBuzz = new FizzOrBuzz();
            this.result = FizzOrBuzz.fizzBuzz(this.number);
        });

        Then("I receive {string}", (String string) -> {
            Assert.assertEquals(string,this.result);
        });

    }
}

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorTest {

    int firNumber;
    int secNumber;
    int theResult;

    @Given("The user has enter two numbers {int} and {int}")
    public void theUserHasEnterTwoNumbersAnd(int firstNumber, int secondNumber) {
    }

    @When("The user sum those two numbers")
    public void theUserSumThoseTwoNumbers() {
    }

    @Then("The user can see the result {int}")
    public void theUserCanSeeTheResult(int expectedResult) {
    }
}

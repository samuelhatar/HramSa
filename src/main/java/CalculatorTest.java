import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    int firNumber;
    int secNumber;
    int theResult;

    @Given("The user has enter two numbers {int} and {int}")
    public void theUserHasEnterTwoNumbersAnd(int firstNumber, int secondNumber) {
        firNumber = firstNumber;
        secNumber = secondNumber;
    }

    @When("The user sum those two numbers")
    public void theUserSumThoseTwoNumbers() {
        theResult = firNumber + secNumber;
    }

    @Then("The user can see the result {int}")
    public void theUserCanSeeTheResult(int expectedResult) {
        assertEquals(expectedResult, theResult);
    }

    @When("The user divide two numbers")
    public void theUserDivideTwoNumbers() {
        theResult = firNumber / secNumber;
    }

    @When("The user subtract two numbers")
    public void theUserSubtractTwoNumbers() {
        theResult = firNumber - secNumber;
    }
}

package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private char operator;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values and an operator, (-?\\d+), (-?\\d+), and ([*|/|^])$")
    public void twoInputValuesAnd(int arg0, int arg1, char opt) {
        value1 = arg0;
        value2 = arg1;
        operator = opt;
    }


    @When("^I add the two values$")
    public void iDoTheOperationOnTwoValues() {
        result = calculator.doOperation(value1, value2, operator);
        System.out.print(result);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);

    }
}
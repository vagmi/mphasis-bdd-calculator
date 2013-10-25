package in.vagmim.calculator;

import java.util.List;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefs {
	private Calculator calculator;
	
	public static class Grocery {
		String item, price;
		public String getPrice() { return price; }
	}
	
	@Given("^I have a calculator$")
	public void I_have_a_calculator() throws Throwable {
	    this.calculator = new Calculator();
	}

	@When("^I have bought the following$")
	public void I_have_bought_the_following(List<Grocery> groceries) throws Throwable {
		for(int i=0;i<groceries.size()-1;i++) {
			calculator.push(groceries.get(i).getPrice());
			calculator.push("+");
		}
		if(groceries.size()>1) {
			calculator.push(groceries.get(groceries.size()-1).getPrice());
		}
	    
	}

	@When("^I returned \"([^\"]*)\" for (\\d+) rupees$")
	public void I_returned_for_rupees(String item, int value) throws Throwable {
	    calculator.push("-");
	    calculator.push(value);
	}

	@Then("^my grocery bill should be (\\d+)$")
	public void my_grocery_bill_should_be(int total) throws Throwable {
	    Assert.assertEquals(total, calculator.getResult());
	}


}

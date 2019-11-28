package git1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class giit {
	@Given("I enter 10")
	public void i_enter_10() {
		System.out.println("I enter 10");	
	}
@Then("i enter 0")
public void i_enter_0() {
	System.out.println("i enter 0");
}
@And("i press add")
public void i_press_add() {
	System.out.println("i press add");
}

@When("i press equal symbol")
public void i_press_equal_symbol (){
System.out.println("i press equal symbol");
}

@Then("i will get 10")
public void i_will_get_10()
{
System.out.println("i will get 10");

}
}

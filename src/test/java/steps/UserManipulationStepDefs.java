package steps;

import cucumber.api.java.en.When;
import utils.ScenarioContext;
import steps.BaseStepDef;

import static endpoints.UserManipulationEndpoints.listUsers;

public class UserManipulationStepDefs extends BaseStepDef {
    public UserManipulationStepDefs(ScenarioContext context) {
        super(context);
    }

    @When("^I try to find the list of users$")
    public void i_try_to_find_the_number_of_users() {
        System.out.println("##########################################");
        context.response = listUsers();
        context.response.jsonPath().prettyPrint();
    }
}

package demoblaze.stepdefinitions;

import demoblaze.questions.AnswerItemAdded;
import demoblaze.questions.AnswerLogin;
import demoblaze.questions.AnswerRegister;
import demoblaze.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class RegisterStepDefinitions {


    @Given("^user on the Register Page$")
    public void userOnTheRegisterPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage())  ;
    }

    @When("^user enters (.*) and (.*)$")
    public void userEnters(String username, String password) {
    OnStage.theActorInTheSpotlight().attemptsTo(SignUp.inThePage(username,password));
    }


    @Then("^user see (.*) message$")
    public void userSeeSignUpSuccessfulMessage(String question) {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerRegister.tothe(), Matchers.equalTo(question)));
    }

    @When("^user enters credential to login (.*) with (.*)$")
    public void userEntersDanWithDan(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.formpage(username,password));
    }

    @Then("^user see (.*) string$")
    public void userSeeWelcomeString(String welcome) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogin.successful(), Matchers.containsString(welcome)));
    }

    @When("^user enter (.*) with (.*) and (.*) for fill contact form$")
    public void userEnterStrEmailWithStrNameAndStrMessageForFillContactForm(String email, String name, String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillContact.theform(email,name,message));
    }


    @When("^user add (.*) to the cart$")
    public void userAddToTheCart(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddItemToCart.additem(item));
    }

    @Then("^user going to see (.*)$")
    public void userGoingToSeeProductAdded(String completeadd) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerItemAdded.complete(), Matchers.containsString(completeadd)));
    }



}

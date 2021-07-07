package co.com.retoTecnico.stepdefinitions;

import co.com.retoTecnico.model.UtestSignUpPageData;
import co.com.retoTecnico.questions.AnswerEmailAlreadyRegistered;
import co.com.retoTecnico.questions.AnswerSuccessfullySignUp;
import co.com.retoTecnico.tasks.OpenUp;
import co.com.retoTecnico.tasks.Register;
import co.com.retoTecnico.tasks.RegisterFailed;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^brandon wants to signup into a utest\\.com$")
    public void brandonWantsToSignupIntoAUtestCom() {

        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^brandon clicks on button Join today$")
    public void brandonClicksOnButtonJoinToday() {

    }

    @And("^brandon writes his credentials$")
    public void brandonWritesHisCredentials(List<UtestSignUpPageData> UtestSignUpPageData) {

        OnStage.theActorCalled("Brandon").wasAbleTo(
                (
                        Register.onThePage(
                                UtestSignUpPageData.get(0).getStrFistName(),
                                UtestSignUpPageData.get(0).getStrLastName(),
                                UtestSignUpPageData.get(0).getStrEmail(),
                                UtestSignUpPageData.get(0).getStrMonth(),
                                UtestSignUpPageData.get(0).getStrDay(),
                                UtestSignUpPageData.get(0).getStrYear(),
                                UtestSignUpPageData.get(0).getStrCity(),
                                UtestSignUpPageData.get(0).getStrZipCode(),
                                UtestSignUpPageData.get(0).getStrCountry(),
                                UtestSignUpPageData.get(0).getStrComputer(),
                                UtestSignUpPageData.get(0).getStrVersion(),
                                UtestSignUpPageData.get(0).getStrLanguagePc(),
                                UtestSignUpPageData.get(0).getStrMobileDevice(),
                                UtestSignUpPageData.get(0).getStrModel(),
                                UtestSignUpPageData.get(0).getStrOS(),
                                UtestSignUpPageData.get(0).getStrPassword(),
                                UtestSignUpPageData.get(0).getStrLanguageUser()
                        )
                )
        );

    }

    @Then("^brandon was successfully registered$")
    public void brandonWasSuccessfullyRegistered(List<UtestSignUpPageData> utestSignUpPageData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerSuccessfullySignUp.toThe(utestSignUpPageData.get(0).getStrQuestion())));
    }

    @When("^brandon is writing his credentials on stepOne$")
    public void brandonIsWritingHisCredentialsOnStepOne(List<UtestSignUpPageData> UtestSignUpPageData) {

        OnStage.theActorCalled("Brandon").wasAbleTo(
                (
                        RegisterFailed.onThePage(
                                UtestSignUpPageData.get(0).getStrFistName(),
                                UtestSignUpPageData.get(0).getStrLastName(),
                                UtestSignUpPageData.get(0).getStrEmail(),
                                UtestSignUpPageData.get(0).getStrMonth(),
                                UtestSignUpPageData.get(0).getStrDay(),
                                UtestSignUpPageData.get(0).getStrYear(),
                                UtestSignUpPageData.get(0).getStrLanguageUser()
                        )
                )
        );

    }

    @Then("^brandon wrote an existing email on utest\\.com$")
    public void brandonWroteAnExistingEmailOnUtestCom(List<UtestSignUpPageData> utestSignUpPageData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEmailAlreadyRegistered.toThe(utestSignUpPageData.get(0).getStrQuestion())));

    }






}

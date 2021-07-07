package co.com.retoTecnico.tasks;

import co.com.retoTecnico.userInterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


public class Register implements Task {

    private String strFistName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZipCode;
    private String strCountry;
    private String strComputer;
    private String strVersion;
    private String strLanguagePc;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
    private String strPassword;
    private String strLanguageUser;

    public Register(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strCity, String strZipCode, String strCountry, String strComputer, String strVersion, String strLanguagePc, String strMobileDevice, String strModel, String strOS, String strPassword, String strLanguageUser) {
        this.strFistName = strFistName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguagePc = strLanguagePc;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPassword = strPassword;
        this.strLanguageUser = strLanguageUser;
    }

    public static Performable onThePage(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strCity, String strZipCode, String strCountry, String strComputer, String strVersion, String strLanguagePc, String strMobileDevice, String strModel, String strOS, String strPassword, String strLanguageUser) {
        return Tasks.instrumented(Register.class, strFistName, strLastName, strEmail, strMonth, strDay, strYear, strCity, strZipCode, strCountry, strComputer, strVersion, strLanguagePc, strMobileDevice, strModel, strOS, strPassword, strLanguageUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UtestSignUpPage.SIGNUP_BUTTON),
                Enter.theValue(strFistName).into(UtestSignUpPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UtestSignUpPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestSignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UtestSignUpPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UtestSignUpPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UtestSignUpPage.INPUT_YEAR),
                Enter.theValue(strLanguageUser).into(UtestSignUpPage.INPUT_LANGUAGE),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_LANGUAGE),
                Click.on(UtestSignUpPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UtestSignUpPage.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_CITY),
                Enter.theValue(strZipCode).into(UtestSignUpPage.INPUT_ZIPCODE),
                Click.on(UtestSignUpPage.BUTTON_COUNTRY),
                Enter.theValue(strCountry).into(UtestSignUpPage.INPUT_COUNTRY),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_COUNTRY),
                Click.on(UtestSignUpPage.BUTTON_NEXT_DEVICES),
                Click.on(UtestSignUpPage.BUTTON_COMPUTER),
                Enter.theValue(strComputer).into(UtestSignUpPage.INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_COMPUTER),
                Click.on(UtestSignUpPage.BUTTON_VERSION),
                Enter.theValue(strVersion).into(UtestSignUpPage.INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_VERSION),
                Click.on(UtestSignUpPage.BUTTON_LANGUAGE_PC),
                Enter.theValue(strLanguagePc).into(UtestSignUpPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_LANGUAGE_PC),
                Click.on(UtestSignUpPage.BUTTON_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(UtestSignUpPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_MOBILE_DEVICE),
                Click.on(UtestSignUpPage.BUTTON_MODEL),
                Enter.theValue(strModel).into(UtestSignUpPage.INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_MODEL),
                Click.on(UtestSignUpPage.BUTTON_OS),
                Enter.theValue(strOS).into(UtestSignUpPage.INPUT_OS),
                Hit.the(Keys.DOWN).keyIn(UtestSignUpPage.INPUT_OS),
                Hit.the(Keys.ENTER).keyIn(UtestSignUpPage.INPUT_OS),
                Click.on(UtestSignUpPage.BUTTON_LAST_STEP),
                Enter.theValue(strPassword).into(UtestSignUpPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestSignUpPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestSignUpPage.CHECKBOX_INFORMED),
                Click.on(UtestSignUpPage.CHECKBOX_TERM_USE),
                Click.on(UtestSignUpPage.CHECKBOX_PRIVACY_SECURITY),
                Click.on(UtestSignUpPage.BUTTON_COMPLETE_SETUP),
                WaitUntil.the(UtestSignUpPage.SUCCESSFULLY_SIGNUP, WebElementStateMatchers.isVisible()).forNoMoreThan(120).seconds()


        );
    }
}

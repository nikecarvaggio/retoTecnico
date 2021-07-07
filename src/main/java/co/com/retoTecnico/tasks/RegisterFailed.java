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

public class RegisterFailed implements Task {

    private String strFistName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguageUser;

    public RegisterFailed(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguageUser) {
        this.strFistName = strFistName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguageUser = strLanguageUser;
    }

    public static Performable onThePage(String strFistName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strLanguageUser) {
        return Tasks.instrumented(RegisterFailed.class, strFistName, strLastName, strEmail, strMonth, strDay, strYear, strLanguageUser);
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
                WaitUntil.the(UtestSignUpPage.EMAIL_EXISTS, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds()

        );
    }
}

package co.com.retoTecnico.questions;

import co.com.retoTecnico.userInterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AnswerSuccessfullySignUp implements Question<Boolean> {
    private String strQuestion;

    public String getStrQuestion() {
        return strQuestion;
    }

    public void setStrQuestion(String strQuestion) {
        this.strQuestion = strQuestion;
    }

    public AnswerSuccessfullySignUp(String strQuestion) {
        this.strQuestion = strQuestion;
    }

    public static AnswerSuccessfullySignUp toThe(String question) {
        return new AnswerSuccessfullySignUp(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String successfullSignUp;
        Target SUCCESSFULLY_SIGNUP=Target.the("locate H1 to confirm successfully signup").

                //located(By.xpath("//div[@class='col-md-8 col-sm-8 col-xs-12']//span[contains(text(),'The last step')]"));
                //located(By.xpath("h1[contains(text(),'Welcome to the world\'s largest community of freelance software testers!')]"));
                        located(By.xpath("//h1"));

        try {
            successfullSignUp= Text.of(UtestSignUpPage.SUCCESSFULLY_SIGNUP).viewedBy(actor).asString();
        }catch (Exception excepcion){
            return true;
        }

        if(strQuestion.equals(successfullSignUp)){
            result=false;
        }else{
            result=true;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

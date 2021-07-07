package co.com.retoTecnico.questions;

import co.com.retoTecnico.userInterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerEmailAlreadyRegistered implements Question<Boolean> {
    private String strQuestion;

    public AnswerEmailAlreadyRegistered(String strQuestion) {
        this.strQuestion = strQuestion;
    }

    public static AnswerEmailAlreadyRegistered toThe(String question) {
        return new AnswerEmailAlreadyRegistered(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String answerEmailAlreadyRegistered;

        answerEmailAlreadyRegistered= Text.of(UtestSignUpPage.EMAIL_EXISTS).viewedBy(actor).asString();

        if(strQuestion.equals(answerEmailAlreadyRegistered)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

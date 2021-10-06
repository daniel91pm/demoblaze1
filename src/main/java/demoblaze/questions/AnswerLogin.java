package demoblaze.questions;

import demoblaze.userinterface.DemoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AnswerLogin implements Question<String> {


    public static AnswerLogin successful(){
        return new AnswerLogin();
    }

    @Override
    public String answeredBy(Actor actor) {
        return DemoBlazePage.LABEL_WELCOME.resolveFor(actor).getText();
    }
}

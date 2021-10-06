package demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AnswerRegister implements Question<String> {

public static AnswerRegister tothe(){
    return new AnswerRegister();
}
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getAlert().getText();
    }


}

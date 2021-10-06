package demoblaze.questions;

import demoblaze.userinterface.DemoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class AnswerItemAdded implements Question<String> {

    public static AnswerItemAdded complete() {
        return new AnswerItemAdded();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getAlert().getText();
    }
}

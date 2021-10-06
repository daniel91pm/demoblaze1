package demoblaze.tasks;

import demoblaze.userinterface.DemoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AddItemToCart implements Task {

    private DemoBlazePage demoBlazePage;
    private String strItem;

    public AddItemToCart (String strItem){
        this.strItem = strItem;
    }


    public static AddItemToCart additem(String strItem) {
        return Tasks.instrumented(AddItemToCart.class, strItem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DemoBlazePage.LABEL_LAPTOPS, WebElementStateMatchers.isVisible()),
                Click.on(DemoBlazePage.LABEL_LAPTOPS),
                Click.on(DemoBlazePage.LABEL_ITEM),
                Click.on(DemoBlazePage.BUTTON_ADDTOCART));
    }
}

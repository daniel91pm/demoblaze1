package demoblaze.tasks;

import demoblaze.model.DemoBlazeUserData;
import demoblaze.userinterface.DemoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SignUp implements Task {

    private DemoBlazePage demoBlazePage;
    private DemoBlazeUserData demoBlazeUserData;

    private String strUserName;
    private String strPassword;

    public SignUp(String strUserName, String strPassword) {
        this.strUserName = strUserName;
        this.strPassword = strPassword;
    }

    public static SignUp inThePage(String strUserName, String strPassword) {
        return Tasks.instrumented(SignUp.class, strUserName, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoBlazePage.PAGESIGNUP_BUTTON),
               Enter.theValue(strUserName).into(DemoBlazePage.INPUT_USER),
                Enter.theValue(strPassword).into(DemoBlazePage.INPUT_PASSWORD),
               Click.on(DemoBlazePage.FORM_SIGNUPBUTTON)

        );

    }

}

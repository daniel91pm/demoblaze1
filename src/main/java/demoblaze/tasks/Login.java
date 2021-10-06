package demoblaze.tasks;


import demoblaze.userinterface.DemoBlazePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Task {

    private String strUserName;
    private String strPassword;

    public Login(String strUserName, String strPassword) {
        this.strUserName = strUserName;
        this.strPassword = strPassword;
    }

    public static Login formpage(String strUserName, String strPassword) {
        return Tasks.instrumented(Login.class, strUserName, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DemoBlazePage.LOGIN_BUTTON),
                Enter.theValue(strUserName).into(DemoBlazePage.INPUTLOGIN_USER),
                Enter.theValue(strPassword).into(DemoBlazePage.INPUTLOGIN_PASSWORD),
                Click.on(DemoBlazePage.FORM_LOGINBUTTON),
                WaitUntil.the(DemoBlazePage.LABEL_WELCOME, WebElementStateMatchers.isVisible())

        );

    }
}

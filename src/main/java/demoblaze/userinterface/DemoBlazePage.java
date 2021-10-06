package demoblaze.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class DemoBlazePage extends PageObject {

    public static final Target PAGESIGNUP_BUTTON = Target.the("Shows up the sign up form")
            .located(By.xpath("//a[@id='signin2']"));
    public static final Target INPUT_USER = Target.the("field to fill with username")
            .located(By.xpath("//input[@id='sign-username']"));
    public static final Target INPUT_PASSWORD = Target.the("field to fill with password")
            .located(By.xpath("//input[@id='sign-password']"));
    public static final Target FORM_SIGNUPBUTTON = Target.the("Shows up the sign up form")
            .located(By.xpath("//button[contains(text(),'Sign up')]"));

    public static final Target LOGIN_BUTTON = Target.the("Identify login button")
            .located(By.xpath("//a[@id='login2']"));
    public static final Target INPUTLOGIN_USER = Target.the("field to fill with username")
            .located(By.xpath("//input[@id='loginusername']"));
    public static final Target INPUTLOGIN_PASSWORD = Target.the("field to fill with password")
            .located(By.xpath("//input[@id='loginpassword']"));
    public static final Target FORM_LOGINBUTTON = Target.the("button to submit login")
            .located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target LABEL_WELCOME = Target.the("Label that identifies correctly the login")
            .located(By.xpath("//a[@id='nameofuser']"));

    public static final Target CONTACT_BUTTON = Target.the("identify contact label")
            .located(By.xpath("//a[contains(text(),'Contact')]"));
    public static final Target INPUT_CONTACTEMAIL = Target.the("field to fill with email")
            .located(By.xpath("//input[@id='recipient-email']"));
    public static final Target INPUT_CONTACTNAME = Target.the("field to fill with name ")
            .located(By.xpath("//input[@id='recipient-name']"));
    public static final Target INPUT_CONTACTMESSAGE = Target.the("field to fill with the message to send")
            .located(By.xpath("//textarea[@id='message-text']"));
    public static final Target SENDMESSAGE_BUTTON = Target.the("button to submit the form")
            .located(By.xpath("//button[contains(text(),'Send message')]"));

    public static final Target LABEL_LAPTOPS = Target.the("identify laptop label")
            .located(By.xpath("//a[contains(text(),'Laptops')]"));
    public static final Target LABEL_ITEM = Target.the("identify THE ITEM TO PURCHASE")
            .located(By.xpath("//a[contains(text(),'MacBook Pro')]"));
    public static final Target BUTTON_ADDTOCART = Target.the("identify THE ITEM TO PURCHASE")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));




}

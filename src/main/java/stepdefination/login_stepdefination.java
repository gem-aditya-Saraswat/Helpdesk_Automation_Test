package stepdefination;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemjarTestngBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.cucumber.java.en.Given;
import static com.gemini.generic.ui.utils.DriverAction.*;
import io.cucumber.java.en.Then;
import selectors.login_xpath;

import java.util.function.Supplier;


public class login_stepdefination extends GemjarTestngBase {
    Logger logger = LoggerFactory.getLogger(login_stepdefination.class);
    @Given("^Launch URL$")
    public void login() throws Exception{
        waitSec(5);
    }

    @Then("^click on Login with SSO button$")
    public void sso_button_click(){
        try {
            waitSec(2);
            click(login_xpath.ssologinbtn);
            waitSec(2);
        }
        catch (Exception e){
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }

    @Then("^Login with (.+) and (.+)$")
    public void login_credential(String userid, String pass){
        try {
            click(login_xpath.ms_signin_text);
            typeText(login_xpath.ms_signin_text, userid);
            click(login_xpath.nextlogin_btn);
            waitSec(1);
            click(login_xpath.ms_signin_pass);
            typeText(login_xpath.ms_signin_pass, pass);
            click(login_xpath.nextlogin_btn);
            waitSec(1);
            click(login_xpath.skip);
            waitSec(10);
        }
        catch (Exception e){
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }

    @Then("^Do Login with (.+) and (.+)$")
    public void common_login(String userid, String pass){
        try {
            sso_button_click();
            login_credential(userid, pass);
        } catch (Exception e) {
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }

    }
}

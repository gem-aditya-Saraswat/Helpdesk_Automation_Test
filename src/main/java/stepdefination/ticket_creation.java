package stepdefination;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.tdd.GemjarTestngBase;
import io.cucumber.java.en.Then;
import selectors.ticket_creation_xpath;

import static com.gemini.generic.ui.utils.DriverAction.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ticket_creation extends GemjarTestngBase {
    Logger logger = LoggerFactory.getLogger(login_stepdefination.class);

    @Then("^click on create ticket$")
    public void click_on_create_ticket() {
        try {
            click(ticket_creation_xpath.createticket);
            waitSec(2);
        } catch (Exception e) {
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }

    @Then("^Fill Details (.+), (.+)$")
    public void fill_details(String subject, String description) {
        try {
            click(ticket_creation_xpath.enter_subject);
            typeText(ticket_creation_xpath.enter_subject, subject);
            waitSec(1);
            click(ticket_creation_xpath.enter_desc);
            typeText(ticket_creation_xpath.enter_desc, description);
            waitSec(5);
        } catch (Exception e) {
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }

    @Then("^Select ticket type as (.+)$")
    public void select_ticket_type(String ticketType) {
        try {
            click(ticket_creation_xpath.drp_click);
            waitSec(5);
            if (ticketType == "Incident") {
                click(ticket_creation_xpath.incidentSelect);
            }
            if (ticketType == "Request") {
                click(ticket_creation_xpath.requestSelect);
            }
        } catch (Exception e) {
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }

    @Then("^Select Department as (.+)$")
    public void select_department() {
        try {
        } catch (Exception e) {
            logger.info("An exception occurred!", e);
            GemTestReporter.addTestStep("ERROR", "SOME ERROR OCCURRED", STATUS.FAIL);
        }
    }
}

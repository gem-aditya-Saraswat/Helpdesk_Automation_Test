package selectors;

import org.openqa.selenium.By;

public class ticket_creation_xpath {
    public static By createticket = By.xpath("//button[text()='Create New Ticket']");

    public static By enter_subject = By.xpath("//input[@placeholder = 'Enter Subject']");

    public static By enter_desc = By.xpath("//textarea[@placeholder='Write the details here...']");

    public static By drp_click = By.xpath("//div[@class = ' css-tlfecz-indicatorContainer']");

    public static By incidentSelect = By.xpath("//div[text() = 'Incident']");

    public static By requestSelect = By.xpath("//div[text() = 'Request']");
}

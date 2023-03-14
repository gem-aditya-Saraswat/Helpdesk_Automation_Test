package selectors;

import org.openqa.selenium.By;

public class login_xpath {
    public static By ssologinbtn = By.xpath("//button[text()='Login with SSO']");

    public static By ms_signin_text = By.xpath("//input[@type='email']");

    public static By ms_signin_pass = By.xpath("//input[@type='password']");

    public static By nextlogin_btn = By.xpath("//input[@type='submit']");

    public static By skip = By.xpath("//input[@type='button']");
}

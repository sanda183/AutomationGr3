
package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }
//    Homepage
    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("enterimg");
//    SignIn
    private By signInEmailField=By.xpath("//input[@type=text]");
    private By signInPasswordField=By.xpath("//input.[@type=password]");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id ("errormsg");


    public boolean isLogoDisplayed() {
        LOG.info("Verify if LogoisDisplayed");
        return driver.findElement(logo).isDisplayed(); //return se foloseste doar la boolean;
    }

    public boolean isSigninButtonDisplayed() {
        LOG.info("Verify if Sign in button is Displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isSkipSignInButtonDisplayed() {
        LOG.info("Verify if Skip Sign in button is Displayed");
        return driver.findElement(By.id("SkipSigninButton")).isDisplayed();
    }

    public boolean isEmailFieldDisplayed() {
        LOG.info("Verify if Email Field is Displayed");
        return driver.findElement(emailField).isDisplayed();
    }


    public void clickSkipSignInButton() {
        LOG.info("Click Skip Sign in Button");
        driver.findElement(skipSignInButton).click();
    }



   public void typeInEmailField (String email) {
       LOG.info("Type in Email Field");
       driver.findElement(emailField).sendKeys(email);
    }





    public void clickNextButton() {
    LOG.info("Click Next Button");
    driver.findElement(nextButton).click();
    }

     public void typeInSignInEmailfield(String email){
     LOG.info("Typing email address in'Email' field");
     driver.findElement(signInEmailField).sendKeys(email);
       }
     public void typeInSignInPasswordField(String password){
     LOG.info("Typing email address in 'Email' field");
     driver.findElement(signInPasswordField).sendKeys(password);
}


public void clickEnterButton(){
LOG.info("Click the 'Enter' button");

}
public boolean s;

    boolean ErrorMessageDisplayes()

    {
     LOG.info("Verifying if error message is displayed");
     return driver.findElement(errorMsg).isDisplayed();

    }


    public boolean isErrorMessageDisplayed() {
        return false;
    }


    public void typeInSignInEmailfield() {
    }

    public void typeInSignInPasswordField() {
    }
}














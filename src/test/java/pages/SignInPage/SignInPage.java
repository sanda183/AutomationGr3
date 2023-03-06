package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends  BasePage {
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

    private final By logo = By.id("logo");
    private final By signInButton = By.id("btn1");
    private final By skipSignInButton = By.id("btn2");
    private final By emailField = By.id("email");
    private final By nextButton = By.id("enterimg");

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
        }














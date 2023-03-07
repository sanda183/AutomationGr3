package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);


private String newUrl = getBaseUrl() + "Index.html";

private String getBaseUrl() {

}


    @Test
    public void signUp() {
        String email = "Email@example.com";
        String password = "12345";
        
        
        LOG.info("Navigate to Sign Up Page");
        final driver.get. String newUrl = this.newUrl;
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Sign in is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(), "Skip Sign in is not displayed");
        signInPage.clickSignInButton();

        LOG.info("Type in email and pass");
        signInPage.typeInSignInEmailfield();
        signInPage.typeInSignInPasswordField();
    }







}












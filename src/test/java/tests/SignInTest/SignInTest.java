package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest<is> extends BaseTest {
private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);
private Object displayed;

    @Test
    public void checkIfLogoIsDisplayed(){
   String email = "grupa3@automation.com";


//   Log.info("Verify if Logo is displayed");
   Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not Displayed");


//  Log.info("Complete the email field");
    Assert.assertTrue(signInPage.isEmailFieldDisplayed(),"Email field is not displayed");
  signInPage.typeInEmailField(email);

//  Log.info("Click the next button");
  signInPage.clickNextButton();
//  Log.info("Click 'Enter' button");
  signInPage.clickEnterButton();
//  Log.info("Verifying if error message is displayed");
     Assert.assertTrue(signInPage.isErrorMessageDisplayed());




    }










}

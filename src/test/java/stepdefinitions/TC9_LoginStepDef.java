package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TC9_LoginStepDef {



    SignInPage signInPage=new SignInPage();

    @When("user launches the browser")
    public void userLaunchesTheBrowser() {
        Driver.getDriver();
    }

    @And("user navigates to home page")
    public void userNavigatesToHomePage() {

        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("login_url"));

    }

    @And("user verifies home page is visible")
    public void userVerifiesHomePageIsVisible() {

        String homePageTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("MEDUNNA",homePageTitle);

    }

    @And("user clicks PersonBox button")
    public void userClicksPersonBoxButton()  {
        signInPage.PersonBox.click();

    }

    @And("user clicks signin button")
    public void userClicksSigninButton() {

        signInPage.signinButton.click();
        
    }

        @And("user verifies signin to your account is visible")
        public void userVerifiesSigninToYourAccountIsVisible() {
         Driver.wait(2);
         Assert.assertTrue(signInPage.signinPage.isDisplayed());


    }

    @And("user enters correct username and password")
    public void userEntersCorrectUsernameAndPassword() {
        signInPage.userNameBox.sendKeys("staffo");
        signInPage.passwordBox.sendKeys("12345678");

    }

    @And("user clicks signinlast button")
    public void userClicksSigninlastButton()
    {
        signInPage.signinlastButton.click();
    }

    @Then("user verifies that signed in")
    public void userVerifiesThatSignedIn() {
        Driver.wait(2);
        Assert.assertTrue(signInPage.myPagesText.isDisplayed());


    }


    @Then("user Click on MyPagesText button")
    public void userClickOnMyPagesTextButton() {
        signInPage.myPagesText.click();
    }

    @And("select SearchPatience button at Dropbox")
    public void selectSearchPatienceButtonAtDropbox() {
        signInPage.SearchPatienceDropbox.click();

    }

    @Then("user verifies Patiences Page")
    public void userVerifiesPatiencesPage() {
        Assert.assertTrue(signInPage.PatiencesPage.isDisplayed());
        Driver.wait(2);

    }

    @Then("user clicks View button")
    public void userClicksViewButton() {
        signInPage.viewButton.click();
    }

    @Then("user verifies Patience Information")
    public void userVerifiesPatienceInformation() {
        Assert.assertTrue(signInPage.PatienceInfoPage.isDisplayed());
        Driver.wait(5);
    }

    @And("user clicks Back Button")
    public void userClicksBackButton() {
        Driver.clickWithJS(signInPage.Backbutton);


    }

    @When("user clicks Edit button")
    public void userClicksEditButton() {
    }

    @Then("verify This Page Create or Edit Patient")
    public void verifyThisPageCreateOrEditPatient() {
    }

    @And("user updates all Patient information")
    public void userUpdatesAllPatientInformation() {
    }

    @Then("user clicks Save button")
    public void userClicksSaveButton() {
    }
}

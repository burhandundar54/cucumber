package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US05_AppointmentPage {

    public US05_AppointmentPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Make an']")
    public WebElement MakeAnAppointmentButton;


    @FindBy(xpath = "//*[@id=\"appointment\"]/div[1]/div/div/h2")
    public WebElement MakeAnAppointmentHeader;

    @FindBy(id = "firstName")
    public WebElement firstnameTextbox;

    @FindBy(id = "lastName")
    public WebElement lastnameTextbox;

    @FindBy(id = "ssn")
    public WebElement ssnTextbox;

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "phone")
    public WebElement phoneTextbox;

    @FindBy(name = "appoDate")
    public WebElement dateTextbox;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement requestButton;


    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement accountmenu;

    @FindBy(xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationpageHeader;

    @FindBy(id = "ssn")
    public WebElement ssnTextboxRegP;

    @FindBy(id = "firstName")
    public WebElement firstnameTextboxRegP;

    @FindBy(id = "lastName")
    public WebElement lastnameTextboxRegP;

    @FindBy(id = "username")
    public WebElement usernameTextboxRegP;

    @FindBy(id = "email")
    public WebElement emailTextboxRegP;

    @FindBy(id = "firstPassword")
    public WebElement firstPassTextboxRegP;

    @FindBy(id = "secondPassword")
    public WebElement secondPassTextboxRegP;

    @FindBy(xpath = "(//*[text()='Register'])[2]")
    public WebElement registerButtonRegP;

    @FindBy(xpath = "//*[text()='Registration Saved']")
    public WebElement successMessageToastContainerRegP;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement SignInButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement Usernametextbox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement Passwordtextbox;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement SigninButtonlast;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myPagesPatientbutton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement myAppointmentbutton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[1]")
    public WebElement myPatientId;






}
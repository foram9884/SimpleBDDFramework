package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStepDefinition {
    WebDriver driver;

    @Given("^User able to open browser$")
    public void user_able_to_open_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("^Enter Url$")
    public void enter_Url()
    {
        driver.get("https://demo.nopcommerce.com/");


    }

    @Then("^User click on Register Link$")
    public void user_click_on_Register_Link()
    {

     driver.findElement(By.className("ico-register")).click();
    }

    @Then("^user click on gender button$")
    public void user_click_on_gender_button()
    {

    driver.findElement(By.id("gender-female")).click();
    }

    @Then("^user enter first name and last name$")
    public void user_enter_first_name_and_last_name() {
        driver.findElement(By.id("FirstName")).sendKeys("Heena");
        driver.findElement(By.id("LastName")).sendKeys("Mehta");

    }



    @Then("^user enter date of birth$")
    public void user_enter_date_of_birth()
    {


        driver.findElement(By.name("DateOfBirthDay")).sendKeys("12");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1962");
    }

    @Then("^user enter email$")
    public void user_enter_email() {
        driver.findElement(By.id("Email")).sendKeys("heenamehta1262@hotmail.com");
    }

    @Then("^user company name$")
    public void user_company_name()
    {
        driver.findElement(By.id("Company")).sendKeys("H.M.Ltd");

    }

    @Then("^user enter password and confirm password$")
    public void user_enter_password_and_confirm_password()
    {
        driver.findElement(By.id("Password")).sendKeys("test123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
    }



    @Then("^user click on register button$")
    public void user_click_on_register_button()
    {
        driver.findElement(By.id("register-button")).click();


    }



}


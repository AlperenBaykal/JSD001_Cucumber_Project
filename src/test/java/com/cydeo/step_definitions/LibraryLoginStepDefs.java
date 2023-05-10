package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LibraryLoginStepDefs {

    //---------------------------------------BACKGROUND---------------------------------------
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    //---------------------------------------STUDENT LOGIN---------------------------------------
    @When("the student enters valid credentials")
    public void the_student_enters_valid_credentials() {
        Driver.getDriver().findElement(By.xpath("//*[@id='inputEmail']")).sendKeys(ConfigurationReader.getProperty("student_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='inputPassword']")).sendKeys(ConfigurationReader.getProperty("student_password"));
    }

    @And("the student clicks sign in")
    public void the_student_clicks_sign_in() {
        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("the student lands on home page")
    public void the_student_lands_on_home_page() {
        String actualText1 = Driver.getDriver().findElement(By.xpath("//*[@class='title'][.='Books']")).getText();
        String expectedText1 = "Books";

        Assert.assertEquals(actualText1, expectedText1);

        Driver.closeDriver();
    }

    //---------------------------------------LIBRARIAN LOGIN---------------------------------------
    @When("the librarian enters valid credentials")
    public void the_librarian_enters_valid_credentials() {
        Driver.getDriver().findElement(By.xpath("//*[@id='inputEmail']")).sendKeys(ConfigurationReader.getProperty("librarian_username"));
        Driver.getDriver().findElement(By.xpath("//*[@id='inputPassword']")).sendKeys(ConfigurationReader.getProperty("librarian_password"));
    }

    @And("the librarian clicks sign in")
    public void the_librarian_clicks_sign_in() {
        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("the librarian lands on home page")
    public void the_librarian_lands_on_home_page() {
        String actualText = Driver.getDriver().findElement(By.xpath("//*[@class='title'][.='Dashboard']")).getText();
        String expectedText = "Dashboard";

        Assert.assertEquals(actualText, expectedText);

        // Driver.closeDriver();
    }

}
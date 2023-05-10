package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LibraryLogoutStepDefs {

    //---------------------------------------STUDENT LOGOUT---------------------------------------
    @When("the student clicks their profile at the right top")
    public void the_student_clicks_their_profile_at_the_right_top() {
        Driver.getDriver().findElement(By.xpath("//*[@id='navbarDropdown']")).click();
    }

    @When("the student click logout button")
    public void the_student_click_logout_button() {
        Driver.getDriver().findElement(By.xpath("//*[@class='dropdown-item']")).click();
    }

    @Then("user lands on login page")
    public void user_lands_on_login_page() {
        String actualText = Driver.getDriver().findElement(By.xpath("//*[.='Sign in']")).getText();
        String expectedText = "Sign in";

        Assert.assertEquals(actualText, expectedText);
    }

    //---------------------------------------LIBRARIAN LOGOUT---------------------------------------
    @When("the librarian clicks their profile at the right top")
    public void the_librarian_clicks_their_profile_at_the_right_top() {
        Driver.getDriver().findElement(By.xpath("//*[@id='navbarDropdown']")).click();
    }
    @When("the librarian click logout button")
    public void the_librarian_click_logout_button() {
        Driver.getDriver().findElement(By.xpath("//*[@class='dropdown-item']")).click();
    }
}

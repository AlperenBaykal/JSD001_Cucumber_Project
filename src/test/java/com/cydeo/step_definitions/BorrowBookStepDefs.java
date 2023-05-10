package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class BorrowBookStepDefs {
    @When("the student clicks first available borrow book button")
    public void the_student_clicks_first_available_borrow_book_button() {

        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-sm  ']")).click();
    }

    @Then("the student will see the confirmation message")
    public void the_student_will_see_the_confirmation_message() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class=\"toast-message\"]")).isDisplayed());
    }//*[.=' Edit Book']

    // Driver.closeDriver();
}


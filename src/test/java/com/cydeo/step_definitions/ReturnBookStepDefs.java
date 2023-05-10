package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ReturnBookStepDefs {

    @When("the student clicks borrowing books")
    public void the_student_clicks_borrowing_books() {
        Driver.getDriver().findElement(By.xpath("//*[@href='#borrowing-books']")).click();
    }

    @When("the student clicks first available return book button")
    public void the_student_clicks_first_available_return_book_button() {
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-sm ']")).click();
    }
}

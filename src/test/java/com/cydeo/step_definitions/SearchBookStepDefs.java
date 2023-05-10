package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchBookStepDefs {

    @And("the student enters book name {string} in search box")
    public void the_student_enters_book_name_in_search_box(String searchBook) {
        Driver.getDriver().findElement(By.xpath("//*[@class='form-control input-sm input-small input-inline']")).sendKeys(searchBook + Keys.ENTER);
    }
    @And("the student should see the book {string} in the list")
    public void the_student_should_see_the_book_in_the_list(String expectedTitle) {
        String actualTitle = Driver.getDriver().findElement(By.xpath("//td[.='"+expectedTitle+"']")).getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

}

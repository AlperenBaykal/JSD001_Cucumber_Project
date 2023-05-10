package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchUserStepDefs {

    @And("librarian searches up {string} user")
    public void librarian_searches_up_user(String searchUser) {
        Driver.getDriver().findElement(By.xpath("//*[@class='form-control input-sm input-small input-inline']")).sendKeys(searchUser + Keys.ENTER);
    }
    @Then("librarian sees user {string} on list")
    public void librarian_sees_user_on_list(String expectedUser) {
        String actualUser = Driver.getDriver().findElement(By.xpath("//td[.='"+expectedUser+"']")).getText();

        Assert.assertEquals(actualUser, expectedUser);
    }

}

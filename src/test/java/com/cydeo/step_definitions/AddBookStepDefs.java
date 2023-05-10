package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddBookStepDefs {

    Faker faker = new Faker();

    String fakeBookName = faker.book().title();
    String fakeISBN = faker.numerify("2-84#-#####-#");
    String fakeAuthor = faker.book().author();
    String  fakeYear = String.valueOf(faker.number().numberBetween(2021,2023));
    String fakeDescription = faker.nation().capitalCity();


    @When("librarian clicks books tab")
    public void librarian_clicks_books_tab() {
        Driver.getDriver().findElement(By.xpath("//*[@href='#books']")).click();
    }
    @And("librarian clicks add book button")
    public void librarian_clicks_add_book_button() {
        Driver.getDriver().findElement(By.xpath("//*[@href='tpl/add-book.html']")).click();
    }
    @And("librarian fills out book information")
    public void librarian_fills_out_book_information() throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("//*[@name='name']")).sendKeys(fakeBookName + "     ");
        Driver.getDriver().findElement(By.xpath("//*[@name='isbn']")).sendKeys(fakeISBN);
        Driver.getDriver().findElement(By.xpath("//*[@name='year']")).sendKeys(fakeYear);
        Driver.getDriver().findElement(By.xpath("//*[@placeholder='Author']")).sendKeys(fakeAuthor);
        Driver.getDriver().findElement(By.xpath("//*[@id='description']")).sendKeys(fakeDescription);

        Select dropDownGenre = new Select(Driver.getDriver().findElement(By.xpath("//*[@id='book_group_id']")));
        dropDownGenre.selectByIndex((int)(Math.random() * 11) + 10);
    }
    @And("librarian presses save changes button")
    public void librarian_presses_save_changes_button() {
        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();
    }
    @Then("the librarian will see the confirmation message")
    public void the_librarian_will_see_the_confirmation_message() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class=\"toast-message\"]")).isDisplayed());
    }
}

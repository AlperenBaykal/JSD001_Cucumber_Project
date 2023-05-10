package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EditBookStepDefs {

    Faker faker = new Faker();

    String fakeBookName = faker.book().title();
    String fakeISBN = faker.numerify("2-84#-#####-#");
    String fakeAuthor = faker.book().author();
    String  fakeYear = String.valueOf(faker.number().numberBetween(2021,2023));
    String fakeDescription = faker.nation().capitalCity();


    @And("the librarian clicks edit book button")
    public void the_librarian_clicks_edit_book_button() {
        Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();
    }
    @And("the librarian edits books info")
    public void the_librarian_edits_books_info() {

        Driver.getDriver().findElement(By.xpath("//*[@name='name']")).clear();
        Driver.getDriver().findElement(By.xpath("//*[@name='isbn']")).clear();
        Driver.getDriver().findElement(By.xpath("//*[@name='year']")).clear();
        Driver.getDriver().findElement(By.xpath("//*[@placeholder='Author']")).clear();
        Driver.getDriver().findElement(By.xpath("//*[@id='description']")).clear();

        Driver.getDriver().findElement(By.xpath("//*[@name='name']")).sendKeys(fakeBookName + " [EDITED]" + "     ");
        Driver.getDriver().findElement(By.xpath("//*[@name='isbn']")).sendKeys(fakeISBN);
        Driver.getDriver().findElement(By.xpath("//*[@name='year']")).sendKeys(fakeYear);
        Driver.getDriver().findElement(By.xpath("//*[@placeholder='Author']")).sendKeys(fakeAuthor);
        Driver.getDriver().findElement(By.xpath("//*[@id='description']")).sendKeys(fakeDescription);

        Select dropDownGenre = new Select(Driver.getDriver().findElement(By.xpath("//*[@id='book_group_id']")));
        dropDownGenre.selectByIndex((int)(Math.random() * 11) + 10);
    }
}

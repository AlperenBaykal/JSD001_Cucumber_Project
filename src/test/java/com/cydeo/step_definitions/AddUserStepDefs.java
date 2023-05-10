package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddUserStepDefs {

    Faker faker = new Faker();

    String fakeFirst = faker.name().firstName();
    String fakeLast = faker.name().lastName();
    String fakeFull = fakeFirst + " " + fakeLast;
    String fakeEmail = faker.bothify(fakeFirst.toLowerCase() + "." +fakeLast.toLowerCase() + "##@gmail.com");
    String fakeAddress = faker.address().fullAddress();



    @And("the librarian clicks users tab")
    public void the_librarian_clicks_users_tab() {
        Driver.getDriver().findElement(By.xpath("//*[@href='#users']")).click();
    }
    @And("the librarian clicks add user button")
    public void the_librarian_clicks_add_user_button() {
        Driver.getDriver().findElement(By.xpath("//*[@href='tpl/add-user.html']")).click();
    }
    @And("the librarian fills in user info")
    public void the_librarian_fills_in_user_info() {
        Driver.getDriver().findElement(By.xpath("//*[@name='full_name']")).sendKeys(fakeFull + "     ");
        Driver.getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys(fakeEmail);
        Driver.getDriver().findElement(By.xpath("//*[@name='address']")).sendKeys(fakeAddress);
        Driver.getDriver().findElement(By.xpath("//*[@name='password']")).sendKeys("JSD001");

        Select dropDownUserGroup = new Select(Driver.getDriver().findElement(By.xpath("//*[@name='user_group_id']")));
        dropDownUserGroup.selectByValue("2");

        Select dropDownStatus = new Select(Driver.getDriver().findElement(By.xpath("//*[@name='status']")));
        dropDownUserGroup.selectByIndex(0);
    }
}


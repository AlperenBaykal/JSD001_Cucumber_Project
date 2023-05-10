@comp
Feature: Search Book


  Scenario: Verify searched book is in the list
    Given the user is on the login page
    When the student enters valid credentials
    And the student clicks sign in
    And the student enters book name "Jay Alexenko" in search box
    Then the student should see the book "Jay Alexenko" in the list

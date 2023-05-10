@comp
Feature: Student can borrow a book


  Scenario: Student can borrow the first available book
    Given the user is on the login page
    When the student enters valid credentials
    And the student clicks sign in
    And the student clicks first available borrow book button
    Then the student will see the confirmation message
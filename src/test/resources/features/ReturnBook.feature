@comp
Feature: Student can return a book


  Scenario: Student will return the first available book
    Given the user is on the login page
    When the student enters valid credentials
    And the student clicks sign in
    And the student clicks borrowing books
    And the student clicks first available return book button
    Then the student will see the confirmation message

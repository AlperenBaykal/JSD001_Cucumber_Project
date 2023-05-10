Feature: Student can switch number of books displayed

  Scenario: The student will choose the number of books displayed on the page
    Given the user is on the login page
    When the student enters valid credentials
    And the student clicks sign in
    And the student clicks the book length dropbox
    And the student clicks 5

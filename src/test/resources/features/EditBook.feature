@comp
Feature: Librarian can edit book


  Scenario: Librarian will edit book and replace the old information with a new "[EDIT]" marker on title of book.
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian lands on home page
    And librarian clicks books tab
    And the librarian clicks edit book button
    And the librarian edits books info
    And librarian presses save changes button
    When the librarian will see the confirmation message
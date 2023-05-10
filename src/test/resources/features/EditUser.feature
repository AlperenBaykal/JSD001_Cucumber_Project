@comp
Feature: Librarian can edit user


  Scenario: Librarian will edit user and replace the old information with a new "[EDIT]" marker on name.
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian lands on home page
    And the librarian clicks users tab
    And the librarian clicks edit user button
    And the librarian edits user info
    And librarian presses save changes button
    When the librarian will see the confirmation message
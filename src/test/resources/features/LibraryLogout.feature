@comp
Feature: User can logout


  Scenario: Student can logout using the logout button
    Given the user is on the login page
    When the student enters valid credentials
    And the student clicks sign in
    And the student clicks their profile at the right top
    And the student click logout button
    Then user lands on login page


  Scenario: Librarian can logout using the logout button
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian clicks their profile at the right top
    And the librarian click logout button
    Then user lands on login page

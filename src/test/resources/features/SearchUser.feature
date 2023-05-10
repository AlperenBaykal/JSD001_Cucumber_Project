@comp
Feature: Librarian can search user


  Scenario: Librarian will be able to search for a specific user
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian clicks users tab
    And librarian searches up "Brandy Kozey" user
    Then librarian sees user "Brandy Kozey" on list
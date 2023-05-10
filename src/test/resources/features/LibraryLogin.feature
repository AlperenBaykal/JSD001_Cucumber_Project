@comp
Feature: User can login

#  We have 2 types of users:
#  student
#  librarian

  Background: go to URL
    Given the user is on the login page


  Scenario: Student can login with valid credentials
#  Given the user is on the login page
  When the student enters valid credentials
  And the student clicks sign in
  Then the student lands on home page


  Scenario: Librarian can login with valid credentials
#    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    Then the librarian lands on home page
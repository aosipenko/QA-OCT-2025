Feature: test sql + api + web

  Scenario: api and db and selenium test
    Given I request 3 random people as "random_group_1"
    Given I store "random_group_1" in database
    Given I pick one random person from DB as "random_person_1"
    Given I load google page
    Given I accept google cookies if present
    When I send "random_person_1" first and last name to google search
    Then search dropdown appears

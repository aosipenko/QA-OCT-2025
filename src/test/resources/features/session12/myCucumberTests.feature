Feature: test sql + api + web

  @severity=critical
  @skip
  Scenario: api and db and selenium test
    Given I request 3 random people as "random_group_1"
    Given I store "random_group_1" in database
    Given I pick one random person from DB as "random_person_1"
    Given I load google page
    Given I accept google cookies if present
    When I send "random_person_1" first and last name to google search
    Then search dropdown appears

  @severity=blocker
  @regression
  Scenario: Scenatio that rarely fails 1
    Given A step that rarely fails

  @severity=normal
  @bug
  Scenario: Scenatio that rarely fails 2
    Given A step that sometimes fails

  @severity=trivial
  @regression
  Scenario: Scenatio that rarely fails 3
    Given A step that often fails

  @severity=normal
  @bug
  @skip
  Scenario: Scenatio that rarely fails 4
    Given A step that sometimes fails

  @severity=trivial
  @skip
  Scenario: Scenatio that rarely fails 5
    Given A step that sometimes fails
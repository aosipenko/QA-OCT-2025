Feature: test sql + api + web

  Scenario: api and db and selenium test
    Given I request 3 random people from random user service
    Given I store these users in database
    Given I pick one random person from DB
    Given I load google page
    Given I accept google cookies if present
    When I send that person's first and last name to google search
    Then search dropdown appears

#  Scenario: demo enum
#    When I load page and ACCEPT cookies

#  Scenario: cucumber demo scenario
#    Given my first step has message "my first message"
#    When My second step "Step 2" is " with two params"
#    Then I test my enum value OBJECT_1
#
#  Scenario Outline: cucumber demo scenario
#    Given my first step
#    When My second step "Step 2" is " with two params"
#    Then I test my enum value OBJECT_3
#    Examples:
#      | my_var              |
#      | "my second message" |
#      | "my third message"  |
#      | "my fourth message" |


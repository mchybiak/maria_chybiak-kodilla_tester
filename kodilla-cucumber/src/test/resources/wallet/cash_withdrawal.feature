Feature: Cash Withdrawal
  Scenario: Succesful withdrawal from a wallet credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Unsuccesful withdrawal from a wallet credit
    Given I have deposited $100 in my wallet
    When I request $120
    Then I should get 0

  Scenario: No withdrawal from a wallet credit
    Given I have deposited $100 in my wallet
    When I don't have withdrawal
    Then $0 should be dispensed

  Scenario: User tries to take out more money than their balance
    Given there is $100 in my wallet
    When I withdraw $200
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet

  Scenario: User checks the balance of their wallet
    Given There is $100 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $100
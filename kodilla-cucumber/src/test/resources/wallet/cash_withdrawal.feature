Feature: Cash Withdrawal
  Scenario: Successful withdrawal from wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Incorrect withdrawal
    Given I have deposited $200 in my wallet
    When I request $300
    Then Withdrawal isn't possible - not enough money in the wallet

  Scenario: No withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $0
    Then Withdrawal shouldn't be made

Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given My account has been credited with $100.00
    When I withdraw $20
    Then $20 should be dispensed
    Then The balance of my account should be $80.00
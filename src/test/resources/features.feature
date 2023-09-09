Feature: Purchase a ticket

  @Background:
  Scenario Outline: Trip info
    Given the user goes to the home page
    And enters "agileway" in the username field, enters "testwise" in the password field, and clicks the sign-in button
    And enters flight information: "<trip type>","<from>","<to>", "<departingday>","<departingMonth>", and optionally "<returningDay>", "<returningYear>", and clicks continue
    And enters passenger information as "john" and "doe", and clicks the next button


    Examples:Trip info
      | trip type | from     | to     | departingday | departingMonth | returningDay | returningYear |
      | Return    | New York | Sydney | 08           | Feburary 2023  | 06           | January 2023  |

  Scenario Outline:Pay info
    And the user enters credit card information: "<Credit Card>", "<Holders_Name>","<Card_Number>","<Expiry_In_Day>","<Expiry_in_Year>"
    And clicks the "Pay Now" button
    Then verifies that the text "Confirmation" is displayed
    Then refreshes the page


    Examples:Pay info
      | Credit Card | Holders_Name | Card_Number | Expiry_In_Day | Expiry_in_Year |
      | Visa        | faker        | faker       | 07            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |
      | Master      | faker        | faker       | 08            | 2024           |










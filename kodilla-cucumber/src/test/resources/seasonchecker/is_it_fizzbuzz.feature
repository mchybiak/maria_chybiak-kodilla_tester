Feature: The Fizz Buzz game
  Scenario Outline: it is Fizz or Buzz
    Given The test number is <number>
    When I check for FizzBuzz
    Then I receive <result>
    Examples:

      | number | result |
      | 1     | "None" |
      | 2     | "None" |
      | 3     | "Fizz" |
      | 4     | "None" |
      | 5     | "Buzz" |
      | 6     | "Fizz" |
      | 7     | "None" |
      | 8     | "None" |
      | 9     | "Fizz" |
      | 10    | "Buzz" |
      | 20    | "Buzz" |
      | 40    | "Buzz" |
      | 50    | "Buzz" |
      | 55    | "Buzz" |
      | 56    | "None" |
      | 71    | "None" |
      | 76    | "None" |
      | 89    | "None" |
      | 92    | "None" |
      | 99    | "Fizz" |
      | 100   | "Buzz" |
      | 101   | "None" |
      | 999   | "Fizz" |
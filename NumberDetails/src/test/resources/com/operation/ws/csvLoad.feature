Feature: checking the functionality of the business logic
   Scenario Outline : Getting associated key for a particular value
      Given the key as <key>
      when user hit enter
      Then <value> will be displayed on screen
      Examples:
         |value  |key|
         |one    |1  |
         |three  |3  |
         |hundred|100|
         |five   |5  |
         |twenty |20 |
         |fifty  |50 |
         |seven  |7  | 
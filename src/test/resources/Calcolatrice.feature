Feature: Exercise on calculator

  Background:
    Given two number 15 and 5

  @Calculator
  Scenario: Calculator sum
    Then result sum is 20

  @Calculator
  Scenario: Calculator dif
    Then result dif is 10

  @Calculator
  Scenario: Calculator mpy
    Then result mpy is 75

  @Calculator
  Scenario: Calculator div
    Then result div is 3

  @Outline
  Scenario Outline: Calculator sum with DataTables
    Given number <number1> and <number2>
    Then result sum DataTable is <result>
    Examples:
      |number1|number2|result|
      |10|10|20|
      |10|15|25|
      |25|25|50|

  @Outline
  Scenario Outline: Calculator dif with DataTables
    Given number <number1> and <number2>
    Then result dif DataTable is <result>
    Examples:
      |number1|number2|result|
      |10|10|0|
      |10|5|5|
      |25|5|20|

  @Outline
  Scenario Outline: Calculator div with DataTables
    Given number <number1> and <number2>
    Then result div DataTable is <result>
    Examples:
      |number1|number2|result|
      |10|10|1|
      |10|5|2|
      |25|5|5|

  @Outline
  Scenario Outline: Calculator mpy with DataTables
    Given number <number1> and <number2>
    Then result mpy DataTable is <result>
    Examples:
      |number1|number2|result|
      |10|10|100|
      |10|15|150|
      |4|3|12|

  @Outline
  Scenario Outline: Calculator DataTables for factorial operation
    Given number <number> for factorial
    Then result DataTable factorial is <result>
    Examples:
      |number|result|
      |5|120|
      |10|3628800|
      |3|6|

  @Outline
  Scenario Outline: Calculator DataTables for control if number is primo
    Given number <number> for primo number
    Then result DataTable primo number is <result>
    Examples:
      |number|result|
      |5|true|
      |10|false|
      |3|true|
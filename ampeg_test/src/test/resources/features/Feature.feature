#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Run Ampeg Tests
  I want to use this template for my feature file

  @tag1
  Scenario: I can go to the product view and go home
    Given I open home page
    When I go to products
    And I go to Svt Pro
    And I go to svt3
    And I go home
    Then I should be Home

  @tag2
  Scenario Outline: I can view the Artist Endorsement
    Given I open home page
    When I go to products
    And I go to classic
    And I go to svt410hlf
    Then I can see artist endorsement

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

@MakeMyTrip
Feature: MakeMy Trip Flight Search

Background:
Given Launch the Browser and enter the MakeMyTrip URL


  @MakeMyTrip
  Scenario: Verify the User can able to search the Flight with Valid Data
   	#Given Launch the Browser and enter the MakeMyTrip URL
    When I Select the From Location "MAA"
    And I Select the To Location "PNQ"
    And I Select the Fly Date
    And I Click On Search button
    Then I should see the Flight search Result page
    
  @MakeMyTrip
  Scenario: Verify the User getting an error message when select the same From and To location
    #Given Launch the Browser and enter the MakeMyTrip URL
    When I Select the From Location "MAA"
    And I Select the To Location "MAA"
    Then I should see the Error message
    
  @MakeMyTrip 
  Scenario Outline: Verify the User can able to search the Flight with Multiple Valid Data
    When I Select the From Locations <From>
    And I Select the To Locations <To>
    And I Select the Fly Date
    And I Click On Search button
    Then I should see the Flight search Result page

    Examples: 
      | From  | To	|
      | MAA | PNQ 	|
      | BLR | GOI		|

 

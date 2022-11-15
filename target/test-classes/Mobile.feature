#Author: your.email@your.domain.com
Feature: Mobile
Background:
Given User needs to login amazon

  Scenario: Mobile Purchase    
    When user can search mobile
    And user can choose the mobile
    And user doing payment
    Then user receives confirmation information

   
    Scenario: Mobile Purchase with one dimensional
    When user can search mobile with onedime list
    |samsung| |nokia|
    And user can choose the mobile
    And user doing payment
    Then user receives confirmation information
    
    
    Scenario: Mobile Purchase with one dimensional
    When user can search mobile with onedime map
    |phone1|samsung| 
    |phone2|nokia|
    And user can choose the mobile
    And user doing payment
   Then user receives confirmation information
    
    Scenario Outline: Mobile purchase
     When user can search mobile "<phone>"
     And user can choose the mobile
     And user doing payment
     Then user receives confirmation information
    
    Examples:
    |phone|
    |samsung|
    |nokia|
    
    
@Activity1
  Feature: "First Test"


  Scenario: Opening webpage through selenium
    Given User is on google home page
    When User types in Cheese and hit Enter
    Then Show how many search results
    And Close the browser
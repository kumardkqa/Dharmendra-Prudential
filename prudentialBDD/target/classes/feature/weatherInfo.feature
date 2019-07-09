Feature: Weather Details

  @Test3
  Scenario: Get the City Weather Infomation
    Given User should be on Home page
   # When Weather Info page displayed
    Then Enter the Valid City Name "Mumbai" In Search filed
    And Click on Search Button
    Then Verify the City Name "Mumbai"
    Then Verify Weather detail display
    

  @Test2
  Scenario: Get the City Weather Infomation
    Given User should be on Home page
    #When Weather Info page displayed
    Then Enter the Invalid City Name "testxyz" In Search filed
    And Click on Search Button
    Then Verify the search result "not found"
    
 
    
    
    
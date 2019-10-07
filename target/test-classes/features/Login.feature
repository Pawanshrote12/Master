Feature: Application Login

  Scenario: To verify the verifyleaveconfigureholidays
    Given Navigate to url
    When User login into application with username "Admin" and password "admin123"
    Then Click on leave button
    And Click on configure
    And Click on holidays
    Then Verify holiday page title
    Then Close the browser
    
    Scenario: To verify the verifyrecruitmentpage
    Given Navigate to url
    And User login into application with username "Admin" and password "admin123"
    Then Click on recruitment button
    And Click on Vaccancy
    Then Close the browser
    
    Scenario: To verify the joworkshifts
    Given Navigate to url
    When User login into application with username "Admin" and password "admin123"
    Then Hover on Admin button
    And Hover on job
    When User click on workshifts
    Then Work shift will be displayed
    Then Close the browser
    
    
  
   

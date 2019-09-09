Feature: Application Login

  Scenario: To verify the verifyleaveconfigureholidays
    Given Navigate to url
    When User login into application with username "Admin" and password "admin123"
    Then Click on leave button
    And Click on configure
    And Click on holidays
    Then Verify holiday page title
    
    Scenario: To verify the verifyrecruitmentpage
    Given Navigate to url
    When User login into application with username "Admin" and password "admin123"
    Then Click on recruitment button
    And Click on Vaccancy
    
    
   

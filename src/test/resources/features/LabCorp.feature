Feature: LabCorp job listing information
@ui
  Scenario: Job listing information
    Given As a user i want to be on home page
    When user click on Careers link
    And user search for QA Test Automation Developer
    And user click select and browse to this position
    And user click Apply Now and confirm Job Title, Job Location, Job ID and another text of choice to match the previous page in the proceeding page
    Then user click return to Job Search
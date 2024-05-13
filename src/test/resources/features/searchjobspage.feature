Feature: Search Functionality for NHS Jobs website

  As a jobseeker on NHS Jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results

#  Background:
#    Given I am on the NHS jobs website search page

    Scenario: Successful search jobs with default input values on what and where fields
      Given I am a jobseeker on NHS Jobs website
      When I put my preferences into the Search functionality
      Then I should get a list of jobs which matches my preferences
      And sort my search results with the newest Date Posted

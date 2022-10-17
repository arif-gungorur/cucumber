Feature: upload test

  @upload
  Scenario: File Upload Testing

    Given user goes the website to upload
    And user uploads the file
    Then user validates the result

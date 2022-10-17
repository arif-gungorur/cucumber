Feature: download testing

  @download
  Scenario: File Download Testing

    Given user goes the website to download
    And user downloads the file
    Then user validates the file
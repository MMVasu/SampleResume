Feature: To Verify Adactin Hotel WebPage

  Scenario Outline: To Verify Adactin Hotel Login Page With Valid Credentails
    Given User should be in Adactin Login Page
    When User should Enter the "<Username>", and "<Password>"
    And User should Click the Login
    Then User should verify login successfull message
    When User should Enter the "<Location>", and "<Hotel>","<RoomType>"

    Examples: 
      | Username | Password  | location | Hotels         | RoomType |
      | vbk21sut | 53766418v |Melbourne | Hotel Sunshine | Deluxe   |

Feature: Login functionality for Adactin Application


Scenario: User enter valid username and valid password
    Given User launch application
    When User enter "Sowmiyasri" as username
    And User enter "Sowmiya05" as password
    Then User verify valid username and valid password
    
    Scenario: User enter valid location, valid hotel, valid rome type, valid number of types,
                valid check in date, valid check out date, valid adulte per room, valid children per room
    
        Given User select valid location
        When User select valid hotel
        And User select valid room type
        And User select valid number of room
        And User enter the valid check in date
        And User enter the valid check out date
        And User select valid adult per room
        And user select valid children per room
        Then User verifiy all box
        
        Scenario: User viewing and selecting hotel
            Given User check the option
            When User click the radiobutton
            Then User verify the all box
            
        Scenario: User enter valid first name, valid last name, valid billing address, valid credit card num, valid credit card type,
         valid selet expiry month, valid selet expiry year, valid cvvnumber
            Given User enter valid first name
            When User enter valid last name
            And User enter valid billing address
            And User enter valid credit card num
            And User select valid credit card type
            And User select valid select month
            And User select valid select year
            And User enter valid cvv number
            And user click the book now
            Then User verify the all box
            
            
            
            
            
            
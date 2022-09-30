Feature: Automate the API sample

  Scenario: Post then Get requests
    Given json body and API url
    When i use Post request , i should see status code 201
    And when i use Get request, the response have to be a json body i just created and status code 200
    Then i should assert to make sure that json body contains the same information

@API
    Scenario: Post then Get request when json body exceeds the max number of elements
    Given json body and API url
    When i use Post request , i should see status code 400 and there is a error message

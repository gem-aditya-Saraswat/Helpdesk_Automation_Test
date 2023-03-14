Feature: Ticket Creation
  Scenario Outline: Create an Incident without file
    Given Do Login with <Userid> and <Password>
    Then click on create ticket
    Then Fill Details <Subject>, <Description>
    Then Select ticket type as <ticketType>
    Then Select Department as <Department>
    Examples:
      | Userid                              | Password     |  Subject       | Description             | ticketType  | Department  |
      | aditya.saraswat@geminisolutions.com | Pimco#adi123 |  Sample ticket | Sample Description text | Incident    | IT          |
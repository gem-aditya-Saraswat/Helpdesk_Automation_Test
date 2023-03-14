Feature: Login

  Scenario Outline: Launch Helpdesk
    Given Launch URL
    Then click on Login with SSO button
    Then Login with <Userid> and <Password>
    Examples:
      | Userid                              | Password     |
      | aditya.saraswat@geminisolutions.com | Pimco#adi123 |




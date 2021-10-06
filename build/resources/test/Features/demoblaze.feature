Feature: Register

  Background:
    Given user on the Register Page

  @Test
  Scenario Outline: user register successfully
    When user enters <strUsername> and <strPassword>
    Then user see <strLogin> message

    Examples:
      | strUsername | strPassword | strLogin            |
      | Danip123    | 123Dan      | Sign up successful. |

  @Test
  Scenario Outline:user Login succesfully
    When user enters credential to login <strUsername> with <strPassword>
    Then user see <strLogin> string
    Examples:
      | strUsername | strPassword | strLogin |
      | Danip123    | 123Dan      | Welcome  |

  @Test
  Scenario Outline: user fill contact form
    Given user enters credential to login <strUsername> with <strPassword>
    When user enter <strEmail> with <strName> and <strMessage> for fill contact form
    Then user see <strLogin> string
    Examples:
      | strUsername | strPassword | strEmail                   | strName | strMessage  | strLogin |
      | Danip123    | 123Dan      | danieljapones1@hotmail.com | Daniel  | Hello world | Welcome  |

  @RegressionTest
  Scenario Outline: user purchase a item
    Given user enters credential to login <strUsername> with <strPassword>
    When user add <strItem> to the cart
    Then user going to see <strAdded>
    Examples:
      | strUsername | strPassword | strItem     | strAdded       |
      | Danip123    | 123Dan      | Macbook Pro | Product added. |

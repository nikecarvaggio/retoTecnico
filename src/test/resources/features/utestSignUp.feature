# Autor: Nicolas

@stories

Feature: Testing utest
  An user wants signup into a utest.com

  @sceneario2
  Scenario: Singup fail by already exist email address
    Given brandon wants to singup into a utest.com
    When brandon clicks on button Join today
    And  brandon is writing his credentials on stepOne
      | strFistName           | strLastName   | strEmail                  | strMonth  | strDay  | strYear   | strCity       | strZipCode  | strCountry  | strComputer | strVersion  | strLanguagePc | strMobileDevice  | strModel  | strOS  | strPassword     | strLanguageUser |
      | Nicolas               | Caraballo     | nikecarvaggio@gmail.com       | December  | 28      | 1995      | Buenos Aires  | B1675       | Argentina   | macos       | 10.7.5      | spanish       | Motorola        | macro     | 8       |  TesTing-123++  | Spanish         |
    Then brandon wrote an exists email on utest.com
      | strQuestion               |
      | Email already registered  |

  @scenario1
  Scenario: Signup successfully
    Given brandon wants to singup into a utest.com
    When brandon clicks on button Join today
    And  brandon writes his credentials
      | strFistName           | strLastName   | strEmail                  | strMonth  | strDay  | strYear   | strCity       | strZipCode  | strCountry  | strComputer | strVersion  | strLanguagePc | strMobileDevice  | strModel  | strOS  | strPassword     | strLanguageUser |
      | Nicolas               | Caraballo     | testing38@gmail.com       | December  | 28      | 1995      | Buenos Aires  | B1675       | Argentina   | macos       | 10.7.5      | spanish       | Motorola        | macro     | 8       |  TesTing-123++  | Spanish         |
    Then brandon was successfully registered
      | strQuestion |
      | Welcome to the world's largest community of freelance software testers! |






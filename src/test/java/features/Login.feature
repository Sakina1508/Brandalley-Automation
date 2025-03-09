@Login
Feature:Login funksiyasi
  Scenario Outline:Ugurlu giris
    Given Istifadeci Ana sehifeye gedir
    And Giris Iconuna Klick Edir
    And Istifadeci acilan Tabloda Continue With Emaili secir
    When Istifadeci "<email>" ve "<password>" yazir
    Then Login Buttonuna basir ve Istifadeci sehifesine kecid edir

    Examples:
      | email                     | password   |
      | sakina.guliyeva@yahoo.com | sakina1985 |
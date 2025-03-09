@ShoppingCart
Feature: Səbət funksionallığı

  Scenario Outline: Məhsulu səbətə əlavə et və ödənişə keç
    Given Istifadeci Esas sehifeye gedir
    When Axtarish butonuna klik edir
    And "<Çantalar>" üçün axtarış edib axtarış düyməsini klik et
    And Mehsullara bax duymesini klik et
    And Siyahida 1 ci mehsulu sec
    And Sebete elave et duymesine klik et
    When Sebete get
    When Odenishe Kec duymesini klik et
    When Ilk gelen catdirilmani sec
    And Odenise davam et
    Then Odenis sehifesine yonlendirilir

    Examples:
      | Çantalar |
      | Bags     |
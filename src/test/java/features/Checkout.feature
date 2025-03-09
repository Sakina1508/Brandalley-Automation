@Checkout
  Feature: Manage Checkout
    Scenario: Add and modify products in the shopping cart
      When the user navigates to the shopping cart
      When the user clicks on Woman
      And the user clicks on accessories from the product catalog
      And the user clicks on sunglasses
      When the user clicks on Add to Cart
      Then the user click basketbutton


    Scenario: Add and modify sunglasses in the shopping cart
      And the sunglasses are being removed from the cart

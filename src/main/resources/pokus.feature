Feature: pokus

  #Komentar

  Scenario: pokusny test 1
    Given nastavenie pociatocnych podmienok
    And dalsi nastavovaci krok
    When Toto je niaka akcia
    And Toto je dalsia akcia
    Then Overenie vysledku
    And Dalsie overenie vysledku

    Scenario: pokusny test 2
      Given nastavenie pociatocnych podmienok
      When Toto je dalsia akcia
      Then Overenie vysledku

      Scenario: Calculator - the sum of two numbers
        Given The user has enter two numbers 5 and 8
        When The user sum those two numbers
        Then The user can see the result 13

        Scenario: Calculator - divided of two numbers
          Given The user has enter two numbers 20 and 2
          When The user divide two numbers
          Then The user can see the result 10

          Scenario: Calculator - subtraction of numbers
            Given The user has enter two numbers 100 and 25
            When The user subtract two numbers
            Then The user can see the result 75

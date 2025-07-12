Feature: Reproducir canción
  Scenario: Reproducir video exitosamente de la canción solicitada
    Given el usuario abre la url de youtube
    When el usuario busca una canción y selecciona la primera en aparecer
    Then el usuario puede ver el título de la canción
    And el título coincíde con la canción buscada

  Scenario: Reproducir video exitosamente de una canción diferente a la solicitada
    Given el usuario abre la url de youtube
    When el usuario busca una canción y selecciona la última canción en aparecer
    Then el usuario puede ver el título de la canción
    And el título no coincíde con la canción buscada
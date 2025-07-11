Feature: Reproducir canción
  Scenario: Reproducir video exitosamente
    Given el usuario abre la url de youtube
    When el usuario busca una canción y selecciona aleatoreamente una canción
    Then el usuario puede ver el título de la canción
@playTrendingMusic
Feature: Reproducir la primera canción en Tendencias - Música

  Scenario: Navegar a la pestaña de Música en Tendencias y reproducir una canción
    Given el usuario abre la url de youtube
    When el usuario navega a la sección de Tendencias
    And el usuario selecciona la pestaña de Música
    And el usuario da clic en la primera canción de la lista
    Then el usuario debe ver el título de la canción reproducida
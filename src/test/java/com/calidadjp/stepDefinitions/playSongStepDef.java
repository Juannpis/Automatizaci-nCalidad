package com.calidadjp.stepDefinitions;

import com.calidadjp.interactions.SelectLastSong;
import com.calidadjp.questions.ValidateDisplayedSong;
import com.calidadjp.questions.ValidateExactSong;
import com.calidadjp.tasks.SearchTask;
import com.calidadjp.tasks.SelectFirstSongTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class playSongStepDef {


    @When("el usuario busca una canción y selecciona la primera en aparecer")
    public void elUsuarioBuscaUnaCancionYSeleccionaLaPrimeraCancion() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.searchSong(),
                SelectFirstSongTask.selectFirstSong()
        );

    }

    @When("el usuario busca una canción y selecciona la última canción en aparecer")
    public void elUsuarioBuscaUnaCancionYSeleccionaLaUltimaCancion() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.searchSong(),
                SelectLastSong.lastSong()
        );

    }

    @Then("el usuario puede ver el título de la canción")
    public void elUsuarioPuedeVerElTituloDeLaCancion() {
            theActorInTheSpotlight().should(
                    seeThat("La respuesta es: ", ValidateDisplayedSong.assertion(), Matchers.equalTo(false))
            );
    }
    @And("el título coincíde con la canción buscada")
    public void elTituloCoincideConElLaCancionBuscada() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta es: ", ValidateExactSong.assertion(), Matchers.equalTo(true))
        );
    }
    @And("el título no coincíde con la canción buscada")
    public void elTituloNoCoincideConLaCancionBuscada() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta es: ", ValidateExactSong.assertion(), Matchers.equalTo(false))
        );
    }

}

package com.calidadjp.stepDefinitions;

import com.calidadjp.questions.ValidateSong;
import com.calidadjp.tasks.SelectFirstSongTask;
import com.calidadjp.tasks.SelectMusicTask;
import com.calidadjp.tasks.SelectTrendingTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class playTrendingMusicStepDef {

    @When("el usuario navega a la sección de Tendencias")
    public void elUsuarioNavegaALaSeccionDeTendencias() {
        theActorInTheSpotlight().attemptsTo(
                SelectTrendingTask.selectTendencies()
        );
    }
    @And("el usuario selecciona la pestaña de Música")
    public void elUsuarioSeleccionaLaPestañaDeMusica() {
        theActorInTheSpotlight().attemptsTo(
                SelectMusicTask.selectMusic()
        );
    }
    @And("el usuario da clic en la primera canción de la lista")
    public void elUsuarioDaClicEnLaPrimeraCancionDeLaLista() {
        theActorInTheSpotlight().attemptsTo(
                SelectFirstSongTask.selectFirstSong()
        );
    }
    @And("el usuario debe ver el título de la canción reproducida")
    public void elUsuarioDebeVerElTituloDeLaCancionReproducida() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta es: ", ValidateSong.assertion(), Matchers.equalTo(false))
        );
    }

}

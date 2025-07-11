package com.calidadjp.stepDefinitions;

import com.calidadjp.questions.ValidateSong;
import com.calidadjp.tasks.SearchTask;
import com.calidadjp.tasks.SelectSongTask;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class playSongStepDef {


    @When("el usuario busca una canción y selecciona aleatoreamente una canción")
    public void elUsuarioBuscaUnaCancionYSeleccionaAleatoreamenteUnaCancion() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.searchSong(),
                SelectSongTask.selectSong()
        );

    }
    @Then("el usuario puede ver el título de la canción")
    public void elUsuarioPuedeVerElTituloDeLaCancion() {
            theActorInTheSpotlight().should(
                    seeThat("La respuesta es: ", ValidateSong.assertion(), Matchers.equalTo(false))
            );
    }

}

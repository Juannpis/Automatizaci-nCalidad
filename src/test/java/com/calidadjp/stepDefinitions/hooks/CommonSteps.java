package com.calidadjp.stepDefinitions.hooks;

import com.calidadjp.tasks.OpenYoutubeTask;
import io.cucumber.java.en.Given;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class CommonSteps {

    @Given("el usuario abre la url de youtube")
    public void elUsuarioAbreLaUrlDeYoutube() {
        theActorCalled("Users").wasAbleTo(OpenYoutubeTask.openBrowser());
    }
}

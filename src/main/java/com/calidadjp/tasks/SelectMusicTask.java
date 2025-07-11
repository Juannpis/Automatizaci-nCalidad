package com.calidadjp.tasks;

import com.calidadjp.ui.TrendingUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectMusicTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(TrendingUI.BTN_MUSIC)
        );
    }

    public static SelectMusicTask selectMusic() {
        return instrumented(SelectMusicTask.class);
    }
}

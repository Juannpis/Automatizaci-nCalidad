package com.calidadjp.tasks;

import com.calidadjp.interactions.SelectFirstSong;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstSongTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFirstSong.firstSong()
        );
    }

    public static SelectFirstSongTask selectFirstSong() {
        return instrumented(SelectFirstSongTask.class);
    }
}

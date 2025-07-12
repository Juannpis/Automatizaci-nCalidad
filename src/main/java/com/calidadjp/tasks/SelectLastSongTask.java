package com.calidadjp.tasks;

import com.calidadjp.interactions.SelectFirstSong;
import com.calidadjp.interactions.SelectLastSong;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLastSongTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectLastSong.lastSong()
        );
    }

    public static SelectLastSongTask selectFirstSong() {
        return instrumented(SelectLastSongTask.class);
    }
}

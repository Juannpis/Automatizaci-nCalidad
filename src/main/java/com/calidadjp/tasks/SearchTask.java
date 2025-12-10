package com.calidadjp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.calidadjp.ui.SearchUI.SEARCH_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {

    public static final String NOMBRE_CANCION = "Beéle, Ozuna, Ryan Castro, Kapo - Como Las Olas";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("song", NOMBRE_CANCION);

        actor.attemptsTo(
                Click.on(SEARCH_INPUT),
                Enter.theValue(NOMBRE_CANCION).into(SEARCH_INPUT).thenHit(Keys.ENTER)
        );
    }

    public static SearchTask searchSong() {
        return instrumented(SearchTask.class);
    }
}

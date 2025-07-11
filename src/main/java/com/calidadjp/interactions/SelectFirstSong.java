package com.calidadjp.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.calidadjp.ui.SongListUI.LIST_SONGS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFirstSong implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listSong = LIST_SONGS.resolveAllFor(actor);
        WebElementFacade firstSong = listSong.get(0);
        String nameSong = firstSong.getText();
        actor.remember("song", nameSong);
        firstSong.click();

    }
    public static SelectFirstSong firstSong() {
        return instrumented(SelectFirstSong.class);
    }
}

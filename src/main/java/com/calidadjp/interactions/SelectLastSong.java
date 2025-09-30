package com.calidadjp.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.calidadjp.ui.SongListUI.LIST_SONGS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectLastSong implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listSong = LIST_SONGS.resolveAllFor(actor);
        WebElementFacade lastSong = listSong.get(listSong.size()-1);
        String nameSong = lastSong.getText();
        actor.remember("song", nameSong);
        System.out.print(listSong.size()-1);
        lastSong.click();

    }
    public static SelectLastSong lastSong() {
        return instrumented(SelectLastSong.class);
    }
}


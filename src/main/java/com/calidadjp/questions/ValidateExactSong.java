package com.calidadjp.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.calidadjp.tasks.SearchTask.NOMBRE_CANCION;
import static com.calidadjp.ui.SongTitleUI.LBL_NAME_SONG;

public class ValidateExactSong implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementTitle = LBL_NAME_SONG.resolveFor(actor);

        String titleVisible = elementTitle.getText().trim().toLowerCase();
        String titleEsperado = NOMBRE_CANCION.trim().toLowerCase();

        System.out.println(">> Título visible: " + titleVisible);
        System.out.println(">> Título esperado: " + titleEsperado);
        System.out.printf("Es la canción buscada: %b%n", titleVisible.contains(titleEsperado));

        return titleVisible.contains(titleEsperado);

    }

    public static ValidateExactSong assertion() {
        return new ValidateExactSong();
    }
}


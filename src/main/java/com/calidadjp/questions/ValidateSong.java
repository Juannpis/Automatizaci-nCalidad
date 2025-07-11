package com.calidadjp.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;

import static com.calidadjp.ui.SongTitleUI.LBL_NAME_SONG;

public class ValidateSong implements Question<Boolean>{


    @Override
    public Boolean answeredBy(Actor actor){

        WebElementFacade elementTitle = LBL_NAME_SONG.resolveFor(actor);

        String title = String.valueOf(elementTitle.isDisplayed());

        String titleSong = actor.recall("song");


        return titleSong.isEmpty();

    }

    public static Question<Boolean> assertion(){
        return new ValidateSong();
    }

}

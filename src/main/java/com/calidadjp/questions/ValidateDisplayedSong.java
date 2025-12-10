package com.calidadjp.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;

public class ValidateDisplayedSong implements Question<Boolean>{


    @Override
    public Boolean answeredBy(Actor actor){

        String titleSong = actor.recall("song");
        return titleSong.isEmpty();

    }

    public static Question<Boolean> assertion(){
        return new ValidateDisplayedSong();
    }

}

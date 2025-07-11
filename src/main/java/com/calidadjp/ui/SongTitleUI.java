package com.calidadjp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SongTitleUI {
    public static Target LBL_NAME_SONG = Target.the("Name of the song")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");
}

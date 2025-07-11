package com.calidadjp.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUI {

    public static Target SEARCH_INPUT = Target.the("Search input")
            .locatedBy("//*[@id='center']/yt-searchbox/div[1]/form/input");

}

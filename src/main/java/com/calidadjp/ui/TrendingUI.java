package com.calidadjp.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TrendingUI {

    public static Target BTN_TRENDING = Target.the("button trending")
            .located(
                    By.xpath(
                            // Anchor que contiene el texto “Trending”
                            "//a[.//yt-formatted-string[normalize-space()='Tendencias']]"
                    )
            );



    public static Target BTN_MUSIC = Target.the("button music")
            .located(By.xpath("//yt-tab-shape[@role='tab' and .//div[normalize-space()='Música']]"));
}

package com.soundcloud.android.foundation.playqueue;

import com.adjust.sdk.Constants;
import java.util.Locale;

/* compiled from: DiscoverySource */
public enum m {
    RECOMMENDER("recommender"),
    STATIONS("stations"),
    STREAM("stream"),
    STATIONS_SUGGESTIONS("stations:suggestions"),
    HISTORY("history"),
    RECENTLY_PLAYED("recently_played"),
    PLAY_NEXT("play_next"),
    RECOMMENDATIONS("personal-recommended"),
    CAST("cast"),
    DEEPLINK(Constants.DEEPLINK);
    
    private String l;

    private m(String str) {
        this.l = str;
    }

    public String a() {
        return this.l;
    }

    public static m a(String str) {
        m[] values;
        for (m mVar : values()) {
            if (mVar.l.equalsIgnoreCase(str)) {
                return mVar;
            }
        }
        return valueOf(str.toUpperCase(Locale.US).replaceAll(":", "_"));
    }
}

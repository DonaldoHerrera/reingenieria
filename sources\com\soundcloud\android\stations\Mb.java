package com.soundcloud.android.stations;

import android.content.res.Resources;
import com.soundcloud.android.ia.p;

/* compiled from: StationTypes */
public final class Mb {
    public static String a(Resources resources, String str) {
        char c;
        switch (str.hashCode()) {
            case -1409097913:
                if (str.equals("artist")) {
                    c = 3;
                    break;
                }
            case 98240899:
                if (str.equals("genre")) {
                    c = 1;
                    break;
                }
            case 110621003:
                if (str.equals("track")) {
                    c = 0;
                    break;
                }
            case 1126448022:
                if (str.equals("curator")) {
                    c = 2;
                    break;
                }
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return resources.getString(p.stations_home_station_based_on_track);
        }
        if (c == 1) {
            return resources.getString(p.stations_home_station_based_on_genre);
        }
        if (c == 2) {
            return resources.getString(p.stations_home_station_based_on_curator);
        }
        if (c != 3) {
            return "";
        }
        return resources.getString(p.stations_home_station_based_on_artist);
    }
}

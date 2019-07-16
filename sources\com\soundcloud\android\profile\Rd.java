package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.v;

/* compiled from: UserSoundsTypes */
public final class Rd {
    public static v a(int i, int i2) {
        return new v(a(i), i2);
    }

    private static String a(int i) {
        switch (i) {
            case 0:
                return "users-spotlight";
            case 1:
                return "users-tracks";
            case 2:
                return "users-albums";
            case 3:
                return "users-playlists";
            case 4:
                return "users-reposts";
            case 5:
                return "users-likes";
            case 6:
                return "users-top-tracks";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown UserSoundType: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}

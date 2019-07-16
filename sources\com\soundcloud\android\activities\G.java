package com.soundcloud.android.activities;

import java.util.EnumSet;

/* compiled from: ActivityKind */
public enum G {
    TRACK_LIKE("track_like"),
    PLAYLIST_LIKE("playlist_like"),
    TRACK_REPOST("track_repost"),
    PLAYLIST_REPOST("playlist_repost"),
    TRACK_COMMENT("track_comment"),
    USER_FOLLOW("user_follow");
    
    public static final String[] g = null;
    public static final EnumSet<G> h = null;
    private final String j;

    static {
        g = b();
        h = EnumSet.of(TRACK_LIKE, PLAYLIST_LIKE, TRACK_REPOST, PLAYLIST_REPOST, TRACK_COMMENT);
    }

    private G(String str) {
        this.j = str;
    }

    private static String[] b() {
        String[] strArr = new String[values().length];
        for (int i2 = 0; i2 < values().length; i2++) {
            strArr[i2] = values()[i2].j;
        }
        return strArr;
    }

    public String a() {
        return this.j;
    }

    public String toString() {
        return this.j;
    }

    public static G a(String str) {
        G[] values;
        for (G g2 : values()) {
            if (g2.j.equals(str)) {
                return g2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported Activity type: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}

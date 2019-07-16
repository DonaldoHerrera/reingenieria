package defpackage;

/* renamed from: dda reason: default package and case insensitive filesystem */
/* compiled from: UrnCollection */
public enum C3751dda {
    TRACKS("tracks"),
    USERS("users"),
    PLAYLISTS("playlists"),
    STATIONS("stations"),
    TRACK_STATIONS("track-stations"),
    ARTIST_STATIONS("artist-stations"),
    COMMENTS("comments"),
    DAY_ZERO("dayzero"),
    ADS("ads"),
    SOUNDS("sounds"),
    GENRES("genres"),
    NEW_FOR_YOU("newforyou"),
    SYSTEM_PLAYLIST("system-playlists"),
    UNKNOWN("unknown");
    
    private String p;

    private C3751dda(String str) {
        this.p = str;
    }

    /* access modifiers changed from: 0000 */
    public String a() {
        return this.p;
    }

    public String toString() {
        return this.p;
    }

    public static C3751dda a(C3508cda cda) {
        return cda.a();
    }

    public static C3751dda a(String str) {
        C3751dda[] values;
        for (C3751dda dda : values()) {
            if (dda.a().equals(str)) {
                return dda;
            }
        }
        if (str.matches("[\\w-]+-stations")) {
            return STATIONS;
        }
        return UNKNOWN;
    }
}

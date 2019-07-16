package com.google.android.gms.internal.clearcut;

public enum bc implements C0764ja {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    
    private static final C0767ka<bc> f = null;
    private final int h;

    static {
        f = new fc();
    }

    private bc(int i) {
        this.h = i;
    }

    public static bc a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return UNMETERED_ONLY;
        }
        if (i == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i != 4) {
            return null;
        }
        return NEVER;
    }

    public final int zzc() {
        return this.h;
    }
}

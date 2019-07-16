package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.q reason: case insensitive filesystem */
public final /* synthetic */ class C6193q {
    public static final /* synthetic */ int[] a = new int[a.values().length];
    public static final /* synthetic */ int[] b = new int[a.values().length];

    static {
        a[a.LOCAL_ONLY.ordinal()] = 1;
        a[a.LOCAL_THEN_SYNCED.ordinal()] = 2;
        a[a.SYNC_MISSING.ordinal()] = 3;
        a[a.SYNCED.ordinal()] = 4;
        b[a.LOCAL_ONLY.ordinal()] = 1;
        b[a.LOCAL_THEN_SYNCED.ordinal()] = 2;
        b[a.SYNCED.ordinal()] = 3;
        b[a.SYNC_MISSING.ordinal()] = 4;
    }
}

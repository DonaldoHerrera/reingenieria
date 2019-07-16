package com.soundcloud.android.playback;

/* compiled from: VideoSourceProvider */
/* synthetic */ class he {
    static final /* synthetic */ int[] a = new int[C6902mGa.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[C6902mGa.WIFI.ordinal()] = 1;
        a[C6902mGa.FOUR_G.ordinal()] = 2;
        a[C6902mGa.THREE_G.ordinal()] = 3;
        a[C6902mGa.TWO_G.ordinal()] = 4;
        a[C6902mGa.OFFLINE.ordinal()] = 5;
        try {
            a[C6902mGa.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
    }
}

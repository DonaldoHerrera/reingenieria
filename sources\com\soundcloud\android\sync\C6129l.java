package com.soundcloud.android.sync;

/* renamed from: com.soundcloud.android.sync.l reason: case insensitive filesystem */
/* compiled from: BackgroundSyncResultReceiver */
/* synthetic */ class C6129l {
    static final /* synthetic */ int[] a = new int[a.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    static {
        a[a.AUTH_ERROR.ordinal()] = 1;
        a[a.NOT_ALLOWED.ordinal()] = 2;
        a[a.NETWORK_ERROR.ordinal()] = 3;
        try {
            a[a.SERVER_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
    }
}

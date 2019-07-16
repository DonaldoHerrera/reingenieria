package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.he reason: case insensitive filesystem */
/* compiled from: OfflineStateOperations */
/* synthetic */ class C4100he {
    static final /* synthetic */ int[] a = new int[C3823mda.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[C3823mda.REQUESTED.ordinal()] = 1;
        a[C3823mda.DOWNLOADING.ordinal()] = 2;
        a[C3823mda.NOT_OFFLINE.ordinal()] = 3;
        a[C3823mda.DOWNLOADED.ordinal()] = 4;
        a[C3823mda.UNAVAILABLE.ordinal()] = 5;
    }
}

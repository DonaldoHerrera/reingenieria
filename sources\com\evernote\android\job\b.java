package com.evernote.android.job;

import com.evernote.android.job.s.d;

/* compiled from: Job */
/* synthetic */ class b {
    static final /* synthetic */ int[] a = new int[d.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    static {
        a[d.CONNECTED.ordinal()] = 1;
        a[d.NOT_ROAMING.ordinal()] = 2;
        a[d.UNMETERED.ordinal()] = 3;
        try {
            a[d.METERED.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
    }
}

package com.soundcloud.android.features.record;

import com.soundcloud.android.features.record.RecordFragment.a;

/* compiled from: RecordPresenter */
/* synthetic */ class M {
    static final /* synthetic */ int[] a = new int[a.values().length];
    static final /* synthetic */ int[] b = new int[J.a.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
    static {
        try {
            b[J.a.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[J.a.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a[a.IDLE_RECORD.ordinal()] = 1;
        a[a.RECORD.ordinal()] = 2;
        a[a.IDLE_PLAYBACK.ordinal()] = 3;
        a[a.PLAYBACK.ordinal()] = 4;
        a[a.EDIT.ordinal()] = 5;
    }
}

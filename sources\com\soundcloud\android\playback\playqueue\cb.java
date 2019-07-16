package com.soundcloud.android.playback.playqueue;

/* compiled from: QueueUtils */
/* synthetic */ class cb {
    static final /* synthetic */ int[] a = new int[b.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[b.REPEAT_NONE.ordinal()] = 1;
        a[b.REPEAT_ONE.ordinal()] = 2;
        try {
            a[b.REPEAT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}

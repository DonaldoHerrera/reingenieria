package com.soundcloud.android.activities;

/* compiled from: ActivityItemRenderer */
/* synthetic */ class D {
    static final /* synthetic */ int[] a = new int[G.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    static {
        a[G.USER_FOLLOW.ordinal()] = 1;
        a[G.TRACK_LIKE.ordinal()] = 2;
        a[G.PLAYLIST_LIKE.ordinal()] = 3;
        a[G.TRACK_REPOST.ordinal()] = 4;
        a[G.PLAYLIST_REPOST.ordinal()] = 5;
        try {
            a[G.TRACK_COMMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
    }
}

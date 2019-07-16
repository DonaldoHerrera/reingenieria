package defpackage;

import com.soundcloud.android.sync.na;

/* renamed from: YAa reason: default package and case insensitive filesystem */
/* compiled from: EntitySyncRequestFactory */
/* synthetic */ class C5461YAa {
    static final /* synthetic */ int[] a = new int[na.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[na.TRACKS.ordinal()] = 1;
        a[na.USERS.ordinal()] = 2;
        try {
            a[na.PLAYLISTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}

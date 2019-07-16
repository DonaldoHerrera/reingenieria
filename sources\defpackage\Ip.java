package defpackage;

import android.text.Layout.Alignment;

/* renamed from: Ip reason: default package */
/* compiled from: WebvttCue */
/* synthetic */ class Ip {
    static final /* synthetic */ int[] a = new int[Alignment.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[Alignment.ALIGN_NORMAL.ordinal()] = 1;
        a[Alignment.ALIGN_CENTER.ordinal()] = 2;
        try {
            a[Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}

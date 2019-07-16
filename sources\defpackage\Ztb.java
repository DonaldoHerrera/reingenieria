package defpackage;

/* renamed from: Ztb reason: default package */
/* compiled from: TypeSubstitutor */
/* synthetic */ class Ztb {
    static final /* synthetic */ int[] a = new int[b.values().length];

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    static {
        a[b.OUT_IN_IN_POSITION.ordinal()] = 1;
        a[b.IN_IN_OUT_POSITION.ordinal()] = 2;
        try {
            a[b.NO_CONFLICT.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
    }
}
